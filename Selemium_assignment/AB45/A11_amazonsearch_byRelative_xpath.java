package ab45_selenium;
//WAP launch Amazon.in try to search something using search field using relative Xpath"

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A11_amazonsearch_byRelative_xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);	
		driver.manage().window().maximize();
		//Amazon--->>
		driver.get("https://www.amazon.in/");
		WebElement e = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Thread.sleep(2000);
		e.sendKeys("tshirt");
		Thread.sleep(3000);
		driver.quit();

	}

}
