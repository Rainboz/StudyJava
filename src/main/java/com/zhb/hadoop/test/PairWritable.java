package test;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.WritableComparable;

public class PairWritable implements WritableComparable<PairWritable>{
    //自定义数据类型
	private int date;
	private double price;
	public PairWritable(int date, double price) {
		super();
		this.date = date;
		this.price = price;
	}

	public PairWritable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}
	public void set(int date,double price)
	{
		this.price = price;
		this.date = date;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public void write(DataOutput out) throws IOException {
		out.writeInt(date);
		out.writeDouble(price);
		
	}

	public void readFields(DataInput in) throws IOException {
		this.date = in.readInt();
		this.price = in.readDouble();
		
	}

	public int compareTo(PairWritable o) {
		int comp = Integer.valueOf(getDate()).compareTo(Integer.valueOf(o.getDate()));
		if(comp !=0)
		return comp;
		else return Double.valueOf(getPrice()).compareTo(Double.valueOf(o.getPrice()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + date;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public String toString() {
		return date + "," + price ;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PairWritable other = (PairWritable) obj;
		if (date != other.date)
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		return true;
	}
	
}
