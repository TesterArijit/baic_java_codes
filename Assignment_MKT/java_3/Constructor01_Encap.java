package com.jsp;
class Client{
	private int Cid;
	private String Cname;
	private long Cnumber;
	
	public Client()//zero parameter.
	{
		Cid=512;
		Cname="Lalu";
		Cnumber=7000099L;
	}
	public Client(int Cid ,String Cname,long Cnumber)//formal argument.
	{
		this();// this method, gives control to another constructor
		//present in the same class.
		//Constructor receiving the value

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

public class Constructor01_Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client c=new Client(547, "Java!", 45687458L);
		//Passing value through Constructor
		System.out.println(c.getCid()+"  "+c.getCname()+"  "+c.getCnumber());
			
	}

}
