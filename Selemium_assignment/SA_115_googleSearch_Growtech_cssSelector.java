package basic_selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_115_googleSearch_Growtech_cssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize(); // to maximize the window
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.cssSelector("textarea[class='gLFyf']"));
		Thread.sleep(1000);
		ele.sendKeys("Growtechminds software private limited",Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();
	
	}

}
