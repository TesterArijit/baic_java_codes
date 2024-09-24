package basic_selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_112_Facebook_cssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize(); // to maximize the window
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.cssSelector("input[id='email']"));
		Thread.sleep(1000);
		ele.sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.quit();

	}

}
