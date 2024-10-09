package ab45_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A17_Growtech_Drag_and_drop {

	public static void main(String[] args) throws InterruptedException {
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
		driver.quit();

	}

}
