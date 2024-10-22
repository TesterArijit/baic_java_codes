package ab45_TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A58_Search_product_on_Amazon_using_DDT {
	
	
	@Test
	public void Amazon_Search() throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\chatt\\eclipse-workspace\\Selinium_TestNG\\DDT_Practice\\Arijit_ac.xlsx");
		Workbook w = WorkbookFactory.create(f);
		String product =w.getSheet("first").getRow(1).getCell(4).getStringCellValue();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		WebElement e = driver.findElement(By.id("twotabsearchtextbox"));
		e.sendKeys(product,Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
		
	}

}
