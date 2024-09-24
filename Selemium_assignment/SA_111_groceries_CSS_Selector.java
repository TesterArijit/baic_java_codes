package basic_selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_111_groceries_CSS_Selector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize(); // to maximize the window
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.cssSelector("a[class='a-spacing-none a-link-normal _quad-multi-asin-card-v2_style_linkContainer__1pWUv a-text-normal']"));
		Thread.sleep(1000);
		ele.click();
		Thread.sleep(3000);
		driver.quit();

	}

}
