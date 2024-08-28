package Test_java;

class Bank{
	private long balance;
	private String Cname;
	private int Cid;
	
	public void setBalance(long balance,String Cname,int Cid)
	{
		if (balance>0) {
			this.balance=balance;
		}
		else {
			System.out.println("Invalid Payment!");
			
		}
		//System.exit(0);
		this.Cname=Cname;
		this.Cid=Cid;
	}
	public long getBalance()
	{
		return balance;
	}
	public String getCname()
	{
		return Cname;
	}
	public int getCid()
	{
		return Cid;
	}
	
	}

public class Encapsulation_01 {
	public static void main(String[] args) {
		
		Bank e=new Bank();
		e.setBalance(24000l, "Arijit", 225);
		System.out.println(e.getCname());
		
		
	}

}
