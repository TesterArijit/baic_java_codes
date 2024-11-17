package ab45_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A68_CrossBrowser_searching_amazon {

	WebDriver driver;

	@Test
	@Parameters("browser")
	public void Autosuggestion(String nameofbrowser) throws InterruptedException {
		if (nameofbrowser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		if (nameofbrowser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		if (nameofbrowser.equals("edge")) {
			driver = new EdgeDriver();
		}

		// driver =new ChromeDriver();
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
		driver.quit();

	}
}
