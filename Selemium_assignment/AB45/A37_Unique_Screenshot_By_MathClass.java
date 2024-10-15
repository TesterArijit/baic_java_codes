package ab45_selenium;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class A37_Unique_Screenshot_By_MathClass {

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
		File Destination = new File("D:\\Selinium_Screenshot\\gopal"+Math.random()+".png");//Using Math class.
		FileHandler.copy(Source, Destination);
		Thread.sleep(1000);
		driver.quit();

	}

}
