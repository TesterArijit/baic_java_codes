package com.jsp;
class Customer{
	private int Cid;
	private String Cname;
	private long Cnumber;
	
	public void setDetails(int x,String y,long z)//formal argument.
	{
		//not right way of deceleration use this keyword.
		Cid=x;
		Cname=y;
		Cnumber=z;
	}
	public int getCid()
	{
		return Cid;
	}
	public String getCname()
	{
		return Cname;
	}
	public long getCnumber()
	{
		return Cnumber;
	}
	
}

public class Encapsulation01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		c.setDetails(123,"Ajit", 874589654L);// passing the value , actual argument
		System.out.println(c.getCid()+"  "+c.getCname()+"  "+c.getCnumber());

	}

}
