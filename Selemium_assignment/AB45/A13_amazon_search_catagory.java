package ab45_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment 13 Launch amazon,select a catagory as books,search a book called power of minds and press enter button
public class A13_amazon_search_catagory {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);	
		driver.manage().window().maximize();
		//Amazon--->>
		driver.get("https://www.amazon.in/");
		WebElement e = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		e.click();
		Thread.sleep(2000);	
		WebElement e1 = driver.findElement(By.xpath("//option[text()='Books']"));
		e1.click();
		Thread.sleep(2000);	
		WebElement e2 = driver.findElement(By.id("twotabsearchtextbox"));
		e2.sendKeys("power of minds",Keys.ENTER);
		Thread.sleep(2000);	
		driver.quit();

	}

}
