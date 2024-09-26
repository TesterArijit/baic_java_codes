package selinium.TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCount_Multiple_Run {
	@Test (invocationCount=4)
	public void Registration1() throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream f = new FileInputStream("C:\\Users\\chatt\\eclipse-workspace\\Selinium_TestNG\\DDT_Practice\\Arijit_ac.xlsx");
        Workbook w = WorkbookFactory.create(f);
        String mail = w.getSheet("first").getRow(1).getCell(2).getStringCellValue();
        String Password = w.getSheet("first").getRow(1).getCell(3).getStringCellValue();
        
        //DDT apply--->>
        WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[autofocus='autofocus']")).sendKeys(mail);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='password']")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='RememberMe']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("a[class='ico-logout']")).click();
		driver.quit();
	}

}
