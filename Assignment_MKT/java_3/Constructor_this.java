package com.jsp;
class Agent{
	int Cid;
	String Cname;
	
	public Agent()
	{
		Cid=225;
		Cname="Arijit";
	}
	public Agent(int x,String y)
	{
		this();
	}

}
public class Constructor_this {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Agent a=new Agent(500,"abc");
		System.out.println(a.Cid+"  "+a.Cname);
		

	}

}
