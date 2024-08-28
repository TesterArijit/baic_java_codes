package Demo;
class SadhiException extends Exception{
	private String msg="Grow Now!";
	public void Set_msg(String msg)
	{
		this.msg=msg;
	}
	public String get_msg()
	{
		return msg;
		
	}
	
	
}
public class Custom03  {
	public static void Submit(int age) throws SadhiException
	{
		if(age>18)
		{
			System.out.println("sadhi Mubarakho!");
		}
		else
		{
			SadhiException se=new SadhiException();
			System.out.println(se.get_msg());
			throw se;
			
			
		}
	}

	public static void main(String[] args) {
		
		try {
			Submit(15);
			
		} catch (Exception e) {
			System.out.println("Handled");
			
		}
		

	}

}
