package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment 69 Atomate this page https://grotechminds.com/registration/ 
public class SA_69_Grow_Register01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e1= driver.findElement(By.xpath("//input[@name='fname']"));
		e1.sendKeys("Arijit");
	    Thread.sleep(1000);
	    WebElement e2=driver.findElement(By.xpath("//input[@name='lname']"));
	    e2.sendKeys("Chatterjee");
	    Thread.sleep(1000);
	    WebElement e3=driver.findElement(By.xpath("//input[@name='email']"));
	    e3.sendKeys("watercolourarijit@gmail.com");
	    Thread.sleep(1000);
	    WebElement e4=driver.findElement(By.xpath("//input[@name='password']"));
	    e4.sendKeys("Cabfrd12345");
	    Thread.sleep(1000);
	    	    
	    driver.findElement(By.xpath("//input[@id='male']")).click();
	    Thread.sleep(1000);
	WebElement  e = driver.findElement(By.xpath("//select[@name='Skills']"));
	            e.click();
	            e.sendKeys(Keys.ARROW_DOWN);
	                 
	            e.click();
	            Thread.sleep(2000);
	            	            
	  WebElement  e5 =driver.findElement(By.xpath("//select[@id='Country']"));
	              e5.click();
	              e5.sendKeys(Keys.ARROW_DOWN);
		          e5.sendKeys(Keys.ARROW_DOWN);
		          e5.sendKeys(Keys.ARROW_DOWN);
		          e5.sendKeys(Keys.ARROW_DOWN);
		          e5.sendKeys(Keys.ARROW_DOWN);
		          e5.sendKeys(Keys.ARROW_DOWN);
		          e5.sendKeys(Keys.ARROW_DOWN);
		          e5.sendKeys(Keys.ARROW_DOWN);
	              Thread.sleep(2000);
	     //Copy -Paste operation---->>         
	  WebElement  address=driver.findElement(By.xpath("//textarea[@id='Present-Address']"));
	             address.sendKeys("Bengal Ambuja, Durgapur, Stare:-West Bengal");
	             address.sendKeys(Keys.CONTROL+"a");
	             address.sendKeys(Keys.CONTROL+"c");
	             Thread.sleep(2000);
	             
	  WebElement  permanent=driver.findElement(By.xpath("//textarea[@id='Permanent-Address']"));
	              permanent.sendKeys(Keys.CONTROL+"v");
	              Thread.sleep(1000);
	   WebElement  pin=driver.findElement(By.xpath("//input[@id='Pincode']"));
	               pin.sendKeys("715589");
	               Thread.sleep(2000);
	    WebElement  religion=driver.findElement(By.xpath("(//div[@class='container']/div/select)[2]"));
	                
	                religion.sendKeys(Keys.ARROW_DOWN);
	                //religion.click();
	                Thread.sleep(2000);
	    WebElement  checkbox=driver.findElement(By.xpath("//input[@id='relocate']"));
	                 checkbox.click();
	                 Thread.sleep(2000);
	    
	   WebElement  submit=driver.findElement(By.xpath("//button[@name='Submit']"));
	               submit.click();
	               Thread.sleep(2000);                          
	         	   driver.quit();

	}

}
