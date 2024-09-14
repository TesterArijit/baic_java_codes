package package1;
// Assignment 80 launch Amazon search product click on the first product 
//and add to thecart. 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_80_Amazon_Search {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		           search.sendKeys("shirt");
		           Thread.sleep(2000);
		   List<WebElement>  e =driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div/div/div"));
		                             
	      Thread.sleep(2000);
	      int count= e.size();
	      e.get(count-10).click();
	      Thread.sleep(2000);
		  driver.quit();
	      	   
	}

	
}
