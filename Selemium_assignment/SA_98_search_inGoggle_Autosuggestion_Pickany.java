package basic_selinium;
//Assignment 98- WAP to launch the Google and search for "bangalore"
//and select the first suggestion by using AutoSuggestion 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_98_search_inGoggle_Autosuggestion_Pickany {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize(); // to maximize the window
		Thread.sleep(2000);
	WebElement	e=driver.findElement(By.name("q"));
	            e.sendKeys("bangalore");
	        Thread.sleep(2000);
	 List<WebElement>  e2= driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	       int count =e2.size();
	       System.out.println(count);
	      e2.get(count-6).click();
	      Thread.sleep(2000);
	      driver.quit();
	      
	       
	        
	

	}

}
