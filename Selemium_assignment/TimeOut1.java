package selinium.TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeOut1 {
	@Test (timeOut = 10000)
	public void Operation() throws InterruptedException
	{
	ChromeDriver driver =new ChromeDriver();
	//Instead of driver.get, we can write this----->>
	             driver.navigate().to("https://www.google.co.in/");
	             driver.manage().window().maximize();
	             String title = driver.getTitle();
	             System.out.println(title);
	             driver.navigate().back(); // to back the page
	             Thread.sleep(2000);
	             driver.navigate().forward(); // o forward the page
	             Thread.sleep(2000);
	             driver.navigate().refresh(); // o refresh the page
	             Thread.sleep(2000);
	             driver.quit();
	
	}

}
