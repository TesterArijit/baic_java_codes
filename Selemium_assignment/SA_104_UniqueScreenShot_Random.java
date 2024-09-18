package basic_selinium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SA_104_UniqueScreenShot_Random {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//to maximize the browser
	    driver.get("https://www.google.com/");
	 WebElement  search =driver.findElement(By.name("q"));
	            Thread.sleep(2000);
	            search.sendKeys("Selenium"+Keys.ENTER);
	            Thread.sleep(2000);
	            TakesScreenshot t= driver;//Upcasting
	            File source= t.getScreenshotAs(OutputType.FILE); // source of the screenshot
	            File destination = new File("D:\\Selinium_Screenshot\\googleSearch"+Math.random()+".png");
	            FileHandler.copy(source, destination);
	            driver.quit();
	            
	            
	}

}
