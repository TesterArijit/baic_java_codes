package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SA_88_Form_growtech {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement drop1= driver.findElement(By.xpath("//select[@id='gender']"));
		
		Select s=new Select(drop1);
		       s.selectByIndex(1);
		       Thread.sleep(2000);
		       
		WebElement drop2= driver.findElement(By.xpath("//select[@id='state']"));
				
				Select s1=new Select(drop2);
				       s1.selectByIndex(30);
				       Thread.sleep(2000);
	    driver.quit();

	}

}
