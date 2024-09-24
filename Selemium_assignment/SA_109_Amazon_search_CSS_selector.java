package basic_selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_109_Amazon_search_CSS_selector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize(); // to maximize the window
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		Thread.sleep(1000);
		e.sendKeys("shoe",Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();

	}

}
