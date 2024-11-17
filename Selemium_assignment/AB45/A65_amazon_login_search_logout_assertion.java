package ab45_TestNG;

import java.io.FileInputStream;
import java.io.IOException;

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
import org.testng.Assert;
import org.testng.annotations.Test;

public class A65_amazon_login_search_logout_assertion {
	
	WebDriver driver;

	@Test
	public void Login() throws InterruptedException, EncryptedDocumentException, IOException {
		FileInputStream f = new FileInputStream(
				"C:\\Users\\chatt\\eclipse-workspace\\Selinium_TestNG\\DDT_Practice\\Arijit_ac.xlsx");
		Workbook w = WorkbookFactory.create(f);
		String User_name = NumberToTextConverter.toText(w.getSheet("first").getRow(2).getCell(0).getNumericCellValue());
		String Password = w.getSheet("first").getRow(2).getCell(1).getStringCellValue();
		// DDT apply--->>
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); // to maximize the window
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
//Hover-Over	   
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
		Thread.sleep(2000);
		WebElement signin = driver.findElement(By.linkText("Sign in"));
		signin.click();
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys(User_name);
		Thread.sleep(1000);
		WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
		Continue.click();
		Thread.sleep(1000);
		WebElement psw = driver.findElement(By.xpath("//input[@id='ap_password']"));
		psw.sendKeys(Password);
		Thread.sleep(1000);
		WebElement submit = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		submit.click();
		Thread.sleep(3000);
		//Search--validation---->.
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        //using Assertion concept
        
        Assert.assertEquals(searchbox.isDisplayed() && searchbox.isEnabled(), true,"Search box invalid");
        
        searchbox.sendKeys("shoes",Keys.ENTER);
        
      //Hover-Over	   
        Actions a1 = new Actions(driver);
        WebElement e1 = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
      		a1.moveToElement(e1).perform();
      		Thread.sleep(2000);
      		WebElement logout = driver.findElement(By.xpath("//span[.='Sign Out']"));
      		//logout validation---1
      		Assert.assertEquals(logout.isDisplayed(),true,"logout option not displayed");
      		logout.click();
      		//logout validation---2
      		WebElement username1 = driver.findElement(By.xpath("//input[@name='email']"));
      		Assert.assertEquals(username1.isEnabled(), true);
      		
      		Thread.sleep(2000);
      		driver.quit();

}
}
