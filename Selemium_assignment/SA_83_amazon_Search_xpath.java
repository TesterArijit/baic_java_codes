package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_83_amazon_Search_xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//form[@id='nav-search-bar-form']/div/div/input"));
		           e.sendKeys("books");
		           Thread.sleep(2000);
		           e.sendKeys(Keys.ENTER);
		driver.quit();
	}

}
