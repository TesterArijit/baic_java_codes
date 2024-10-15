package ab45_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A38_Growtech_Registration_popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.id("fname"));
		name.sendKeys("Arijit");
		Thread.sleep(1000);
		WebElement tittle = driver.findElement(By.id("lname"));
		tittle.sendKeys("Chatterjee");
		Thread.sleep(1000);
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("abc@gmail.com");
		Thread.sleep(1000);
		WebElement psw = driver.findElement(By.id("password"));
		psw.sendKeys("abcd1234");
		Thread.sleep(1000);
		WebElement gen = driver.findElement(By.id("male"));
		gen.click();
		Thread.sleep(1000);
		WebElement skil = driver.findElement(By.id("Skills"));
		
		Select s=new Select(skil);
		s.selectByIndex(1); //select by index
		Thread.sleep(1000);
		
		WebElement tec = driver.findElement(By.id("technicalskills"));
		Select sc=new Select(tec);
		sc.selectByIndex(3); //select by index
		Thread.sleep(1000);
		
		
		WebElement country = driver.findElement(By.id("Country"));
		
		Select s1=new Select(country);
		s1.selectByValue("India");//select by value
		Thread.sleep(1000);
		
		WebElement address1 = driver.findElement(By.id("Present-Address"));
		address1.sendKeys("Bengal Ambuja");
		Thread.sleep(1000);
		address1.sendKeys(Keys.CONTROL+"a");
		address1.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		WebElement address2 = driver.findElement(By.id("Permanent-Address"));
		address2.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(1000);
		
		WebElement pin = driver.findElement(By.id("Pincode"));
		pin.sendKeys("782255");
		Thread.sleep(1000);
		
		WebElement rel = driver.findElement(By.id("Relegion"));
		
		Select s2=new Select(rel);
		s2.selectByVisibleText("Hindu");//select by visible text
		Thread.sleep(1000);
		
		WebElement loc = driver.findElement(By.id("relocate"));
		loc.click();
		Thread.sleep(1000);
				
		//Handle fileupload popup
		WebElement file=driver.findElement(By.id("file"));
		file.sendKeys("C:\\Users\\chatt\\Downloads\\Triangle01.java");
		
		WebElement sub = driver.findElement(By.name("Submit"));
		sub.click();
		Thread.sleep(2000);
		//To transfer the control from parent browser to popup
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.quit();

	}

}
