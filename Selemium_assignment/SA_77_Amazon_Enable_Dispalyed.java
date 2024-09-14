package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_77_Amazon_Enable_Dispalyed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		           search.click();
		           
		boolean b1=search.isEnabled();
		boolean b2=search.isDisplayed();
		
		if(b1 && b2 ==true)
		{
			System.out.println("Search field is OK");
		}
		else
		{
			System.out.println("Search field is NOK");
		}
		search.sendKeys("Shoes");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	
	}

}
