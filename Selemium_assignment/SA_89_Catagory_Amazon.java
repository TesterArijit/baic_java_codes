package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SA_89_Catagory_Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	WebElement	drop=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	
	  Select s =new Select(drop);
         s.selectByVisibleText("Books");   //----------->> select By VisibleTest method
         Thread.sleep(2000);
         
   WebElement e=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	              e.sendKeys("minds"+Keys.ENTER);
	              Thread.sleep(2000);
	             	            	              
//<option value="search-alias=furniture">Furniture</option>
//	              Thread.sleep(2000);
              driver.quit();
	              
	}

}
