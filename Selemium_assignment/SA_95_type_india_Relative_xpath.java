package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_95_type_india_Relative_xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	WebElement	search =driver.findElement(By.xpath("//div/div/textarea[@name='q']"));
	            search.sendKeys("india"+Keys.ENTER);
	            Thread.sleep(2000);
	            driver.quit();

	}

}
