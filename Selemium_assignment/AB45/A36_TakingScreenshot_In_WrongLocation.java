package ab45_selenium;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class A36_TakingScreenshot_In_WrongLocation {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/?srsltid=AfmBOorEJdX4Lh-5LlcgomP3f-2V5FYYZt1uVV8qsymxRMf_uq-YXxCn");
		Thread.sleep(1000);	
		WebElement profile = driver.findElement(By.xpath("//span[.='Profile']"));
		Actions a=new Actions(driver);
		a.moveToElement(profile).build().perform();
		Thread.sleep(2000);
		//For Taking Screenshot--->>
		
		TakesScreenshot ss=(TakesScreenshot) driver;
		File Source = ss.getScreenshotAs(OutputType.FILE);
		try {
			File Destination = new File("M:\\Selinium_Screenshot\\gopal.png");//FileNotFoundException
			FileHandler.copy(Source, Destination);
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception handled");
			
		}
		Thread.sleep(1000);
		driver.quit();

	}

}
