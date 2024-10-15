package ab45_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A29_Print_allLink_Google {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		List<WebElement> e = driver.findElements(By.tagName("a"));
		int count = e.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			WebElement ele = e.get(i);
			String text = ele.getText();
			System.out.println(text);
			Thread.sleep(1000);
		}
		driver.quit();

	}
}
