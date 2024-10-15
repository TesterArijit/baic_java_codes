package ab45_selenium;
//steps to take screenshot---->
//1.Upcasting 'driver' to TakeScreenshot(Interface)
//2.Use method getScrrenshotAs to take the screenshot ---->source
//3.File class object creation, provide the location os screenshot --->destination.
//4.FileHandler class, use copy method(source,destination)

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

public class A35_Taking_Normal_Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='container-6']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='div2']"));
		Thread.sleep(1000);	
		Actions a=new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);	
		a.dragAndDrop(drop, drag).perform();
		Thread.sleep(1000);	
		//For taking Screenshot--->>
		
	TakesScreenshot	ss=(TakesScreenshot) driver;//-----1
	File source = ss.getScreenshotAs(OutputType.FILE);// ----2
	File destination=new File("D:\\Selinium_Screenshot\\radha.png");// ----3
	FileHandler.copy(source, destination);//-----4
	Thread.sleep(1000);
	driver.quit();

	}

}
