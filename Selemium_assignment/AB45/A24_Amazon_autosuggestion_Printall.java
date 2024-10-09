package ab45_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A24_Amazon_autosuggestion_Printall {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);	
		driver.manage().window().maximize();
		//Amazon--->>
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		Thread.sleep(1000);
		List<WebElement> results = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count = results.size();
		System.out.println(count);
		Thread.sleep(1000);
		
		for(WebElement ele:results)
		{
			String text = ele.getText();
			System.out.println(text);
			Thread.sleep(1000);
		}
	
		driver.quit();

	}

}
