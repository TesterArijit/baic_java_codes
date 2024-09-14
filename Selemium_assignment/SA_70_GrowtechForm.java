package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_70_GrowtechForm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement Fname=driver.findElement(By.name("firstName"));
		           Fname.sendKeys("Selinium");
		Thread.sleep(2000);
		WebElement Lname=driver.findElement(By.name("lastName"));
		           Lname.sendKeys("Architecture");
		Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("abc@gmail.com");
        Thread.sleep(2000);
              
        WebElement phone=driver.findElement(By.name("phone"));
        phone.sendKeys("7485745658");
        Thread.sleep(2000);
        
        WebElement gen=driver.findElement(By.xpath("//select[@id='gender']"));
        gen.click();
        gen.sendKeys(Keys.ARROW_DOWN);
        gen.click();
        Thread.sleep(2000);
        
        WebElement state=driver.findElement(By.id("state"));
        state.click();

        driver.findElement(By.xpath("//option[text()='West Bengal']")).click();
        //state.click();
        Thread.sleep(2000);
        
        WebElement adhar=driver.findElement(By.id("aadhaar"));
                   adhar.sendKeys("154785458965");
                   Thread.sleep(2000);
                   
        WebElement pan=driver.findElement(By.id("pan"));
                   pan.sendKeys("AJ45801PP");
                   Thread.sleep(2000);
        WebElement checkbox=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
                   checkbox.click();
                   Thread.sleep(2000);
        WebElement submit=driver.findElement(By.name("Submit"));
                   submit.click();
                   Thread.sleep(1000);
                   
                          
        driver.quit();
        
     	}

}
