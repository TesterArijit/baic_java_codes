package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SA_92_Drag_Drop1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	WebElement	drag=driver.findElement(By.xpath("//div[@id='container-6']"));
	WebElement	drop=driver.findElement(By.xpath("//div[@id='div2']"));
	
	
		Actions a =new Actions(driver);
        a.dragAndDrop(drag, drop).perform();
        Thread.sleep(2000);
        a.dragAndDrop(drop, drag).perform();
        Thread.sleep(2000);
        driver.quit();
	
	}

}
