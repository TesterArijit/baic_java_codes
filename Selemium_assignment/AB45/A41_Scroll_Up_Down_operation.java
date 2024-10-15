package ab45_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A41_Scroll_Up_Down_operation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//a[.='About Amazon']"));
		Point p = e.getLocation();
		int y = p.getY();
		// For Scrolling operation--->>
		//Upcasting driver to JavascriptExecutor
				
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4400)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-2000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,"+y+")");
		Thread.sleep(3000);

	}

}
