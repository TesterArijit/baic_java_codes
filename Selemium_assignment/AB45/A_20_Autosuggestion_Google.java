package ab45_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class A_20_Autosuggestion_Google {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement search = driver.findElement(By.name("q"));
		Thread.sleep(1000);
		search.sendKeys("bangalore");
		Thread.sleep(2000);
		List<WebElement> result = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count = result.size();
		System.out.println(count);
		Thread.sleep(1000);
		result.get(count-5).click();
		Thread.sleep(3000);	
		driver.quit();

	}

}
