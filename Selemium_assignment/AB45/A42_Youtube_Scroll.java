package ab45_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A42_Youtube_Scroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.cssSelector("input[name='search_query']"));
		search.click();
		Thread.sleep(2000);
		search.sendKeys("india",Keys.ENTER);
		Thread.sleep(4000);
		//For scrooling--->
		
		WebElement e = driver.findElement(By.cssSelector("img[class='yt-core-image yt-core-image--fill-parent-height yt-core-image--fill-parent-width yt-core-image--content-mode-scale-aspect-fill yt-core-image--loaded']"));
		//e.click();
		
		Thread.sleep(3000);
		Point p = e.getLocation();
		int y = p.getY();
		System.out.println(y);//615
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+y+")");
		
		//driver.findElement(By.cssSelector("img[class='yt-core-image yt-core-image--fill-parent-height yt-core-image--fill-parent-width yt-core-image--content-mode-scale-aspect-fill yt-core-image--loaded']"));
		
		List<WebElement> li = driver.findElements(By.xpath("//a[@class='yt-simple-endpoint inline-block style-scope ytd-thumbnail']"));
		int count = li.size();
		System.out.println(count);
		Thread.sleep(2000);
		for(WebElement ele:li)
		{
			Point po = ele.getLocation();
			int y2 = po.getY();
			System.out.println(y2);
			Thread.sleep(1000);
			JavascriptExecutor js1= (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,"+y2+")");
			Thread.sleep(3000);
			
		}
				
		Thread.sleep(4000);
		driver.quit();
		
	}

}
