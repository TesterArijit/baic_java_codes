package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SA_93_Amazon_catagory_book_search {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	WebElement	drop=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	 
	Select s =new Select(drop);
	       s.selectByIndex(12);
	       
	       Thread.sleep(2000);
	       
	   WebElement e =driver.findElement(By.xpath("//input[@name='field-keywords']"));
	           Thread.sleep(1000);
	          e.sendKeys("java"+Keys.ENTER);
	           Thread.sleep(2000);
	           driver.quit();

	}

}
