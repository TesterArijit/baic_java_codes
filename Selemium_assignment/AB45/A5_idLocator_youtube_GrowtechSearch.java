package ab45_selenium;

//WAP :on Youtube Search Grotechminds with help of ID locator "
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class A5_idLocator_youtube_GrowtechSearch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);	
		 driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys(" Grotechminds");
		 Thread.sleep(2000);	
		 driver.findElement(By.id("search-icon-legacy")).click();
	     Thread.sleep(5000);	
		driver.quit();

	}

}
