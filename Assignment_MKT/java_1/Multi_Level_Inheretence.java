package basic01;
class SuperMost_Parent{
	public static String a="10 acr land";
	public void Farm_house()
	{
		System.out.println("Grand paa have farm house");
	}
}
class Parent extends SuperMost_Parent{
	public void Govt_job()
	{
		System.out.println("Father have govt job");
	}
	public void Bunglow()
	{
		System.out.println("Father have big bunglow");
	}
	public void car()
	{
		System.out.println("Father have car");
	}
}
public class Multi_Level_Inheretence extends Parent  {
	public void sleeping()
	{
		System.out.println("Son love sleeping");
	}

public static void main(String[] args) {
	Multi_Level_Inheretence m=new Multi_Level_Inheretence();
	System.out.println(a);
	m.Farm_house();
	m.Govt_job();
	m.Bunglow();
	m.car();
	m.sleeping();
	}

}
