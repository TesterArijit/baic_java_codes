package ab45_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A73_ExplicitWait_Element_to_be_clickable {

	public static void main(String[] args) {

		String key = "webdriver.chrome.driver";
		String value = "./Software/chromedriver.exe";

		System.setProperty(key, value);

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		// tittlecontails--->>
		wait.until(ExpectedConditions.titleContains("Goo"));
		// tittleIs--->>
		wait.until(ExpectedConditions.titleIs("Google"));

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[.='India']"))).click();

	}

}
