package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SA85_CreateAcoount_button {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement create = driver.findElement(By.xpath("//a[.='Create new account']"));
		           create.click();
	   
	           Thread.sleep(2000);
	         driver.quit();
	    
		
	}

}
