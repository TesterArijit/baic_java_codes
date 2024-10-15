package ab45_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A39_Growtech_JS_popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/javascript-popup/");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//button[.='Click ']"));
		button.click();
		Thread.sleep(2000);
		//Transfer the control from browser to pop-up--->>
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.quit();
	
	}

}
