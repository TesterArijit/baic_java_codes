package ab45_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A52_Amazon_1BM_1AM_2T {
	WebDriver driver;
	
	@BeforeMethod
	public void Launch() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.quit();
	}
	
	
	@Test(priority=1)
	public void Login_Search_Product() throws InterruptedException, EncryptedDocumentException, IOException
	{
		FileInputStream f = new FileInputStream("C:\\Users\\chatt\\eclipse-workspace\\Selinium_TestNG\\DDT_Practice\\Arijit_ac.xlsx");
        Workbook w = WorkbookFactory.create(f);
        String User_name = NumberToTextConverter.toText(w.getSheet("first").getRow(2).getCell(0).getNumericCellValue());
        String Password = w.getSheet("first").getRow(2).getCell(1).getStringCellValue();
        //System.out.println(User_name);
        //System.out.println(Password);
		
		//DDT using		
		
		 driver=new ChromeDriver();
		          driver.get("https://www.amazon.in/");
		          driver.manage().window().maximize(); // to maximize the window
		  		Thread.sleep(2000);
		 WebElement e= driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	//Hover-Over	   
		 Actions a=new Actions(driver);
		         a.moveToElement(e).perform();
		         Thread.sleep(2000);
		  WebElement signin = driver.findElement(By.linkText("Sign in"));
		              signin.click();
		  WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		             username.sendKeys(User_name);
		             Thread.sleep(1000);
		  WebElement Continue=driver.findElement(By.xpath("//input[@id='continue']"));
		             Continue.click();
		             Thread.sleep(1000);
		  WebElement psw =driver.findElement(By.xpath("//input[@id='ap_password']"));
		                  psw.sendKeys(Password);
		             Thread.sleep(1000);
		  WebElement submit =driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		                     submit.click();
		             Thread.sleep(4000);
		  WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		             e1.click();
		             e1.sendKeys("shoe"+Keys.ENTER);
		             Thread.sleep(2000);
		       		 driver.quit();
	}
	@Test(priority=2)
	public void Add_to_Wishlist() throws InterruptedException, EncryptedDocumentException, IOException
	{
		FileInputStream f = new FileInputStream("C:\\Users\\chatt\\eclipse-workspace\\Selinium_TestNG\\DDT_Practice\\Arijit_ac.xlsx");
        Workbook w = WorkbookFactory.create(f);
        String User_name = NumberToTextConverter.toText(w.getSheet("first").getRow(2).getCell(0).getNumericCellValue());
        String Password = w.getSheet("first").getRow(2).getCell(1).getStringCellValue();
        //System.out.println(User_name);
        //System.out.println(Password);
		
		//DDT using		
		
		 driver=new ChromeDriver();
		          driver.get("https://www.amazon.in/");
		          driver.manage().window().maximize(); // to maximize the window
		  		Thread.sleep(2000);
		 WebElement e= driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	//Hover-Over	   
		 Actions a=new Actions(driver);
		         a.moveToElement(e).perform();
		         Thread.sleep(2000);
		  WebElement signin = driver.findElement(By.linkText("Sign in"));
		              signin.click();
		  WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		             username.sendKeys(User_name);
		             Thread.sleep(1000);
		  WebElement Continue=driver.findElement(By.xpath("//input[@id='continue']"));
		             Continue.click();
		             Thread.sleep(1000);
		  WebElement psw =driver.findElement(By.xpath("//input[@id='ap_password']"));
		                  psw.sendKeys(Password);
		             Thread.sleep(1000);
		  WebElement submit =driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		                     submit.click();
		             Thread.sleep(4000);
		  WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		             e1.click();
		             e1.sendKeys("shoe"+Keys.ENTER);
		             Thread.sleep(2000);
		             WebElement shoe1 = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		             shoe1.click();
		             Thread.sleep(2000);
		             //Transfer the control from parent tab to child tab--->>
		             Set<String> h = driver.getWindowHandles();
		             Iterator<String> i = h.iterator();
		             String parent_id = i.next();
		             String child_id = i.next();
		             System.out.println(parent_id);
		             
		             driver.switchTo().window(child_id);//Controil is in child tab now
		             Thread.sleep(1000);
		             WebElement wishlist = driver.findElement(By.xpath("//span[.='Add to Cart' and @id='submit.add-to-cart']"));
		             wishlist.click();
		             Thread.sleep(2000);
		             
		       		 driver.quit();
	}
	

}
