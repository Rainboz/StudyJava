package com.zhb.hadoop.test;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Partitioner;

public class FirstPartitioner extends Partitioner<test.PairWritable, LongWritable>{
	//分区
	@Override
	public int getPartition(test.PairWritable key, LongWritable value,
							int numPartitions) {
		// TODO Auto-generated method stub
		return (Integer.valueOf(key.getDate())).hashCode()&value.hashCode()%numPartitions;
	}
	

}
