package basic_selinium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SA_105_UniqueScreenshot1_getClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//to maximize the browser
	    driver.get("https://www.amazon.in");
	    WebElement E1= driver.findElement(By.id("twotabsearchtextbox"));
	    E1.sendKeys("book");
	     Thread.sleep(2000); 
		List<WebElement>li =driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count=li.size();
		li.get(count-9).click();
	     TakesScreenshot T1= driver; //upcasting// Interface
		File source=T1.getScreenshotAs(OutputType.FILE);//AbstarctMethod
   File Destination=new File("D:\\\\Selinium_Screenshot\\shyam.png"+new SA_105_UniqueScreenshot1_getClass().getClass()+".png");
		//it gives the screen shot with class name 
		Files.copy(source,Destination);

	}

}
