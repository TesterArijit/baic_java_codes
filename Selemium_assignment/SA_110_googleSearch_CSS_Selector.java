package basic_selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_110_googleSearch_CSS_Selector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize(); // to maximize the window
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.cssSelector("textarea[class='gLFyf']"));
		Thread.sleep(1000);
		e.sendKeys("india",Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
		
	}

}
