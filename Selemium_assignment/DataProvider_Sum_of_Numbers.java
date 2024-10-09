package selinium.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Sum_of_Numbers {

	@Test(dataProvider = "Hello")
	public void Sum_Operation(int value)
	{
		int sum=value+100;
		System.out.println(sum);
	}
	@DataProvider(name = "Hello")
	public Object[][] testcase()
	{
		return new Object[][] {{10},{20},{30}};
	}

}
