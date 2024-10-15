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

public class A37_UniqueScreenshot_By_getclass {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amul.com/index.php");
		Thread.sleep(2000);	
		WebElement brand = driver.findElement(By.xpath("//a[.='Brands']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(brand).perform();
		Thread.sleep(2000);
		WebElement paneer = driver.findElement(By.xpath("//a[.='Paneer']"));
		paneer.click();
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\Selinium_Screenshot\\Paneer"+new A37_UniqueScreenshot_By_getclass().getClass()+".png");
		FileHandler.copy(source, destination);
		Thread.sleep(2000);		
		driver.quit();


	}

}
