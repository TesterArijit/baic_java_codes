package basic_selinium;
//Assignment 99 - WAP to launch the Amazon and search for "Shoe" and 
//select the fourth option by using AutoSuggestion 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_99_Amazon_Autosuggestion {
	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); // to maximize the window
		Thread.sleep(2000);
	WebElement e =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	           e.sendKeys("shoe");
	           Thread.sleep(2000);
	List<WebElement> e1 =driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	           int count = e1.size();
	           Thread.sleep(2000);
	           System.out.println(count);
	           e1.get(4).click();
	           Thread.sleep(2000);
	           driver.quit();
	
	}

}
