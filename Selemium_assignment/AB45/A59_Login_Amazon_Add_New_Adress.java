package ab45_TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class A59_Login_Amazon_Add_New_Adress {

	WebDriver driver;

	@Test
	public void Login_ChanageAddress() throws InterruptedException, EncryptedDocumentException, IOException {
		// DDT apply--->>
		FileInputStream f = new FileInputStream(
				"C:\\Users\\chatt\\eclipse-workspace\\Selinium_TestNG\\DDT_Practice\\Arijit_ac.xlsx");
		Workbook w = WorkbookFactory.create(f);
		String User_name = NumberToTextConverter.toText(w.getSheet("first").getRow(2).getCell(0).getNumericCellValue());
		String Password = w.getSheet("first").getRow(2).getCell(1).getStringCellValue();

		String Full_name = w.getSheet("first").getRow(6).getCell(0).getStringCellValue();
		String Mobile = NumberToTextConverter.toText(w.getSheet("first").getRow(6).getCell(1).getNumericCellValue());
		String pin_code = NumberToTextConverter.toText(w.getSheet("first").getRow(6).getCell(2).getNumericCellValue());
		String Address = w.getSheet("first").getRow(6).getCell(3).getStringCellValue();
		String Area = w.getSheet("first").getRow(6).getCell(4).getStringCellValue();
		String Land_mark = w.getSheet("first").getRow(6).getCell(5).getStringCellValue();
		String Town = w.getSheet("first").getRow(6).getCell(6).getStringCellValue();

		driver = new ChromeDriver();
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
		Thread.sleep(2000);
		// Add location
		WebElement location = driver.findElement(By.xpath("//span[@id='glow-ingress-line2']"));
		location.click();
		Thread.sleep(2000);
		WebElement add_location = driver.findElement(By.xpath("//a[.='Add an address or pick-up point ']"));
		add_location.click();
		Thread.sleep(1000);
		WebElement add = driver.findElement(By.xpath("//div[@class='a-box first-desktop-address-tile']"));
		add.click();

		// New Adress Elements--->
		WebElement fname = driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressFullName']"));
		fname.sendKeys(Full_name);
		Thread.sleep(1000);
		WebElement mob = driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressPhoneNumber']"));
		mob.sendKeys(Mobile);
		Thread.sleep(1000);
		WebElement pin = driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressPostalCode']"));
		pin.sendKeys(pin_code);
		Thread.sleep(1000);
		WebElement address1 = driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressLine1']"));
		address1.sendKeys(Address);
		Thread.sleep(1000);
		WebElement area1 = driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressLine2']"));
		area1.sendKeys(Area);
		Thread.sleep(1000);
		WebElement lmark1 = driver.findElement(By.xpath("//input[@id='address-ui-widgets-landmark']"));
		lmark1.sendKeys(Land_mark);
		Thread.sleep(1000);
		WebElement twn = driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressCity']"));
		twn.sendKeys(Town);
		Thread.sleep(3000);
		driver.quit();

	}
}
