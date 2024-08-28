package basic01;
class Launch{
	public static void Browser_Launch()
	{
		System.out.println("Launch th browser");
	}
	public void Url()
	{
		System.out.println("Enter the url");
	}
}
public class Single_level_Inheretence extends Launch {
	public static void Search()
	{
		System.out.println("Search the Product");
	}

	public static void main(String[] args) {
	Single_level_Inheretence s=new Single_level_Inheretence();
	Browser_Launch();
	s.Url();
	Search();
		}
}
