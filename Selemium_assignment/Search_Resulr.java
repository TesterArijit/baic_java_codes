package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Resulr {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	WebElement	sr=driver.findElement(By.name("q"));
	            sr.sendKeys("Bangalore");
	            Thread.sleep(2000);
	 List<WebElement> e=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	 int count = e.size();
	    System.out.println(count);
	    e.get(4).click();
	    Thread.sleep(2000);
	    driver.quit();

	}

}
