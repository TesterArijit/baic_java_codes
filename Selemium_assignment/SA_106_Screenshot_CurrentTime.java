package basic_selinium;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SA_106_Screenshot_CurrentTime {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//to maximize the browser
	    driver.get("https://www.amazon.in");
	    WebElement E1= driver.findElement(By.id("twotabsearchtextbox"));
	    E1.sendKeys("book");
	     Thread.sleep(2000); 
		List<WebElement>li =driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count=li.size();
		li.get(count-8).click();
	     TakesScreenshot T1= driver; //upcasting// Interface
		File source=T1.getScreenshotAs(OutputType.FILE);//AbstarctMethod
		Date d=new Date();
		System.out.println(d.getTime());
		Date d1=new Date(d.getTime());
		System.out.println(d1);
   File Destination=new File("D:\\\\Selinium_Screenshot\\shyam.png"+d1.getTime()+".png");
		//it gives the screen shot with class name 
		Files.copy(source,Destination);
		 Thread.sleep(2000); 
		 driver.quit();

	}

}
