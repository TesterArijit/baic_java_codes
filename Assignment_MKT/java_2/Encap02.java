package test.one;
 
class Bank{
public long balance;
public int cid;
public String Cname;

public void setDetails(long balance,int cid,String Cname)
{
	this.balance=balance;
	this.cid=cid;
	this.Cname=Cname;

}
public long get_balance()
{
	return balance;
	}
public int get_cid()
{
	return cid;
}
public String get_Cname()
{
	return Cname;
}
	
}
public class Encap02 {

	public static void main(String[] args) {
		Bank ba=new Bank();
		ba.setDetails(50000l, 205, "Arijit Chatterjee");
		System.out.println(ba.get_balance()+"  "+ba.get_cid()+"  "+ba.get_Cname());
		

	}

}
