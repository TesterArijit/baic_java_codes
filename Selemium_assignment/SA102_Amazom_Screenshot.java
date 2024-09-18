package basic_selinium;
import java.io.File;
import java.io.IOException;
//Assignment 102 - WAP to launch the Amazon and search for "Shoe" and 
//select the fourth option by using AutoSuggestion and also, take a Screenshot
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SA102_Amazom_Screenshot {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); // to maximize the window
		Thread.sleep(2000);
	WebElement e =driver.findElement(By.xpath("//div[@class='nav-fill']/div/input"));
	           e.sendKeys("shoe");
	           Thread.sleep(2000);
	List<WebElement> e1 =driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	           int count = e1.size();
	           Thread.sleep(2000);
	           System.out.println(count);
	           e1.get(3).click();
	           Thread.sleep(5000);
	           
	           TakesScreenshot t1=(TakesScreenshot) driver;
	           File f1=t1.getScreenshotAs(OutputType.FILE);
	           File f2=new File("D:\\Selinium_Screenshot\\ram.png");
	           Files.copy(f1,f2);
	           Thread.sleep(1000);
	           driver.quit();
		
	}

}
