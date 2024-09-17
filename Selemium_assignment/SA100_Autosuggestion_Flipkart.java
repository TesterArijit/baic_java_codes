package basic_selinium;
import java.util.List;

import org.openqa.selenium.By;
// Assignment 100 -  WAP to launch the flipkart and search for "Shoe"
//and select the second option by using AutoSuggestion 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA100_Autosuggestion_Flipkart {
	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize(); // to maximize the window
		Thread.sleep(2000);
		
	WebElement	e=driver.findElement(By.name("q"));
	            e.sendKeys("shoe");
	Thread.sleep(2000);
    List<WebElement> search= driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
    Thread.sleep(2000);
    int count =search.size();
    Thread.sleep(1000);
    System.out.println(count);
    Thread.sleep(2000);
    search.get(2).click();
    Thread.sleep(2000);
    driver.quit();
    
    
		
	}

}
