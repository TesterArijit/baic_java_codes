package ab45_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A16_HoverOver_Growtech {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/hoverover/");
		Thread.sleep(1000);	
		WebElement e = driver.findElement(By.xpath("(//div[@class='toolrip4'])[1]"));
		
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.xpath("((//div[@class='toolrip4'])[1]/span/div)[3]"));
		e1.click();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
