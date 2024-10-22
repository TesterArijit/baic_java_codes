package ab45_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class A62_Disable_Any_Testcase {

	@Test(enabled = true, priority = 2)
	public void Right_click() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//a[.='Gmail']"));

		Actions a = new Actions(driver);
		a.contextClick(e).perform();
		Thread.sleep(2000);
		driver.quit();

	}

	@Test(enabled = true, priority = 1)
	public void Launch_app() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.firstcry.com/");
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//a[.=' Toys']"));

		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
		Thread.sleep(2000);
		driver.quit();

	}

	@Test(priority = 0, enabled = false)
	public void Launch_google() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
	}
}
