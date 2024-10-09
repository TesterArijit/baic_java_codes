package ab45_selenium;
// WAP for TagName locator using learning HTML file"

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A12_tagName_locator_local_file {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/learningHTML1.html");
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.tagName("input"));
		e.sendKeys("selenium");
		Thread.sleep(2000);
		driver.quit();

	}

}
