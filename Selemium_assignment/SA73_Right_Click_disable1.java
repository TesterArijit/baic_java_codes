package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA73_Right_Click_disable1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement con=driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		           con.click();
		Thread.sleep(2000);
		WebElement fname=driver.findElement(By.id("username"));
		           fname.sendKeys("Selinium");
		           Thread.sleep(2000);
		WebElement password=driver.findElement(By.name("password"));
		           password.sendKeys("125748");
		           Thread.sleep(2000);
		
		driver.quit();
	}

}
