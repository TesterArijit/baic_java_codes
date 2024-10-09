package ab45_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A15_HoverOver_Amazon_Language {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Amazon--->>
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);	
		WebElement en = driver.findElement(By.xpath("//div[text()='EN']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(en).perform();
		Thread.sleep(2000);	
		WebElement bong = driver.findElement(By.xpath("(//span[text()='বাংলা'])[1]"));
		bong.click();
		Thread.sleep(2000);	
		driver.quit();

	}

}
