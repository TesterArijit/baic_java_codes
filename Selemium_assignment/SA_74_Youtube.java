package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_74_Youtube {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	WebElement	sign=driver.findElement(By.xpath("(//yt-button-shape/a)[1]"));
	            sign.click();
	            Thread.sleep(3000);
	   driver.quit();
	
	}

}
