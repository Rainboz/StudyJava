package com.zhb.hadoop.test;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class SecondarySortMapReduce extends Configured implements Tool{
	public static class SecondarySortMapper extends
	//Map
	Mapper<LongWritable, Text, test.PairWritable, DoubleWritable>
	{
		private test.PairWritable mapOutputKey = new test.PairWritable();
		private DoubleWritable mapOutputValue = new DoubleWritable();
		
		@Override
		protected void map(LongWritable key, Text value,Context context)
				throws IOException, InterruptedException {
		String[] splits = value.toString().split(",");
		
		mapOutputKey.set(Integer.valueOf(splits[0]), Double.valueOf(splits[1]));
		
		mapOutputValue.set(Double.valueOf(splits[1]));
		
		context.write(mapOutputKey, mapOutputValue);
		}
		
	}
	
	public static class SecondarySortReducer extends
	Reducer<test.PairWritable, DoubleWritable, IntWritable, DoubleWritable>{
	//Reduce
	private IntWritable outputKey = new IntWritable();
	@Override
		protected void reduce(test.PairWritable key, Iterable<DoubleWritable> values, Context context)
				throws IOException, InterruptedException {
	
		for (DoubleWritable value : values){

			outputKey.set(key.getDate());
			context.write(outputKey, value);
		
			}	
		}
	}
	   //驱动
	   public int run(String[] args) throws Exception {
           // 1.Get Configuration
           Configuration conf = super.getConf();

           // 2.Create Job
           Job job = Job.getInstance(conf);
           job.setJarByClass(getClass());

           // 3.Set Job
           // Input --> map --> reduce --> output
           // 3.1 Input
           Path inPath = new Path(args[0]);
           FileInputFormat.addInputPath(job, inPath);

           // 3.2 Map class
           job.setMapperClass(SecondarySortMapper.class);
           // TODO
           job.setMapOutputKeyClass(test.PairWritable.class);
           job.setMapOutputValueClass(DoubleWritable.class);

           // 1.Partition
           job.setPartitionerClass(FirstPartitioner.class);
           // 2.sort
           // job.setSortComparatorClass(cls);
           // 3.combine
           // job.setCombinerClass(WordCountReducer.class);
           // 4.compress
           // conf.set("mapreduce.map.output.compress", "false");
           // configuration ;
           // 5.group
           job.setGroupingComparatorClass(FirstGroupingComparator.class);
           // 3.3 Reduce class
           job.setReducerClass(SecondarySortReducer.class);
           // TODO
           job.setOutputKeyClass(IntWritable.class);
           job.setOutputValueClass(DoubleWritable.class);
        // 3.4 Output
           Path outPath = new Path(args[1]);

           FileSystem dfs = FileSystem.get(conf);
           if (dfs.exists(outPath)) {
                   dfs.delete(outPath, true);
           }

           FileOutputFormat.setOutputPath(job, outPath);

           // 4.Submit Job
           boolean isSuccess = job.waitForCompletion(true);
           return isSuccess ? 0 : 1;
   }

   public static void main(String[] args) throws Exception {
           // TODO
		   //改下路径即可
           args = new String[] { "/home/zhb/trans.txt",
                           "/home/zhb" };
           Configuration conf = new Configuration();
           // run job
           int status = ToolRunner.run(//
                           conf,//
                           new SecondarySortMapReduce(),//
                           args);

           // exit program
           System.exit(status);
   }

	
	
	
	
	

}
