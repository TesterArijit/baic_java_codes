package ab45_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A40_FindOut_Location_AboutAmazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//a[.='About Amazon']"));
		Point p = e.getLocation();
		int x = p.getX();
		int y = p.getY();
		System.out.println(p);
		System.out.println(x);
		System.out.println(y);
		Thread.sleep(3000);
		driver.quit();
		
	}

}
