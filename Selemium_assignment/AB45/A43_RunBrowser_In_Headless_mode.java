package ab45_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A43_RunBrowser_In_Headless_mode {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions c=new ChromeOptions();
		 c.addArguments("--headless");
		
		ChromeDriver driver=new ChromeDriver(c);
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
