package basic_selinium;


import java.util.List;

//Assignment 101 -  WAP to launch the Apollo pharmacy and search for "PCM" and select 
//the fourth option by using AutoSuggestion 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_101_Apollophermacy_Autosuggstion {
	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver =new ChromeDriver();
		driver.get("https://www.apollopharmacy.in/");
		driver.manage().window().maximize(); // to maximize the window
		Thread.sleep(2000);
	WebElement	e=driver.findElement(By.xpath("//div[@data-placeholder='Search Medicines']"));
	            e.click();
	            Thread.sleep(1000);
	  WebElement  search =driver.findElement(By.xpath("//input[@id='searchProduct']"));
	              //search.click();
	              search.sendKeys("pcm");
	          
	          Thread.sleep(2000);
	  List<WebElement>  e1 =driver.findElements(By.xpath("//div[@class='MedicineAutoSearch_searchList___m_g7 null']/ul/li"));
	  Thread.sleep(2000);
	  int  count = e1.size();
	  System.out.println(count);
	  Thread.sleep(2000);
	    e1.get(3).click();
	    Thread.sleep(4000);
	    driver.quit();
	    
	           

	}

}
