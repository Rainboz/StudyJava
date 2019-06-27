package com.zhb.hadoop.test;

import org.apache.hadoop.io.RawComparator;
import org.apache.hadoop.io.WritableComparator;
import com.zhb.hadoop.test.*;


public class FirstGroupingComparator implements RawComparator<test.PairWritable>{
	//分组
	public int compare(test.PairWritable o1, test.PairWritable o2) {
		// TODO Auto-generated method stub
		return (o1.getDate()+"").compareTo(o2.getDate()+"");
	}

	public int compare(byte[] b1, int s1, int l1, byte[] b2, int s2, int l2) {
		// TODO Auto-generated method stub
		return WritableComparator.compareBytes(b1, 0, l1-8, b2, 0, l2-8);
	}

}
