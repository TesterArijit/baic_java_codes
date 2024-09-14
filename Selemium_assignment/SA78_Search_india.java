package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA78_Search_india {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.co.in/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
    WebElement e1 = driver.findElement(By.name("q"));
    e1.sendKeys("india");
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//div/ul/li)[6]"));
	Thread.sleep(2000);
	WebElement e3= driver.findElement(By.xpath("(//input[@name='btnK'])[1]"));
	e3.click();
	Thread.sleep(4000);
	driver.quit();
		
	}

}
