package Test_java;

class Father_Atm{
	private int atm_pin=1234;
	
	public int getAtmpin()
	{
		return atm_pin;
	}
	public void setAtmpin(int atm_pin)
	{
		this.atm_pin=atm_pin;
	}
	
	}

public class Demo_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father_Atm f=new Father_Atm();
		System.out.println(f.getAtmpin());
		f.setAtmpin(5789);
		System.out.println(f.getAtmpin());
	

	}

}
