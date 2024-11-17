package ab45_TestNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A67_Parallel_amazonSearch_add_Wishlist {
	WebDriver driver;

	@Test
	@Parameters("browser")
	public void wishlist(String nameofbrowser) throws InterruptedException {
		if (nameofbrowser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		if (nameofbrowser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		if (nameofbrowser.equals("edge")) {
			driver = new EdgeDriver();
		}

		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); // to maximize the window
		// implicit wait--->>
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Search--validation---->.
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		// using Assertion concept

		Assert.assertEquals(searchbox.isDisplayed() && searchbox.isEnabled(), true, "Search box invalid");

		searchbox.sendKeys("shoes", Keys.ENTER);
		//1st shoe
		WebElement shoe1 = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline']/div)[1]"));
		Thread.sleep(1000);
		shoe1.click();
		//transfer control from parent to child--->>
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		Iterator<String> i = windows.iterator();
		String p_id = i.next();
		String c_id = i.next();
		System.out.println(p_id);
		System.out.println(c_id);
		
		driver.switchTo().window(c_id);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		//wishlist-->>
		WebElement wish = driver.findElement(By.xpath("//span[@id='wishListMainButton']"));
		Thread.sleep(1000);
		wish.click();
		Thread.sleep(1000);
		driver.quit();

}
}
