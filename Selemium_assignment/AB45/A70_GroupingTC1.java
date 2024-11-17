package ab45_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
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
import org.testng.annotations.Test;

public class A70_GroupingTC1 {
	WebDriver driver;
	
	@Test(groups = {"smoke","integration"}, priority = 1)
	public void testcase1() throws InterruptedException, EncryptedDocumentException, IOException
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//Thread.sleep(2000);
		//implicit wait.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		FileInputStream f=new FileInputStream("C:\\Users\\chatt\\eclipse-workspace\\Selinium_TestNG\\DDT_Practice\\Arijit_ac.xlsx");
		Workbook w = WorkbookFactory.create(f);
		String un= NumberToTextConverter.toText(w.getSheet("first").getRow(2).getCell(0).getNumericCellValue());   
		String psw=w.getSheet("first").getRow(2).getCell(1).getStringCellValue();
			
		
		WebElement hover = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		//Hover-Over
		Actions a=new Actions(driver);
		a.moveToElement(hover).build().perform();
		Thread.sleep(2000);
		WebElement signin = driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		signin.click();
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys(un);
		WebElement con = driver.findElement(By.xpath("//input[@id='continue']"));
		con.click();
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys(psw);
		Thread.sleep(2000);
		WebElement in = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		in.click();
		Thread.sleep(2000);
		
		WebElement hover1 = driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(hover1).build().perform();
		Thread.sleep(2000);
		
		WebElement signout = driver.findElement(By.xpath("//span[.='Sign Out']"));
		signout.click();
		Thread.sleep(2000);
		driver.quit();
	}
	@Test(groups = {"smoke"}, priority = 2)
	public void testcase2() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes", Keys.ENTER);
		Thread.sleep(4000);
		driver.quit();
	}
	@Test(groups = {"integration"}, priority = 3)
	public void testcase3() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shirt", Keys.ENTER);
		Thread.sleep(4000);
		
		List<WebElement> all = driver.findElements(By.xpath("//div[@class='a-section a-spacing-base a-text-center']"));
		Thread.sleep(2000);
		int count = all.size();
		System.out.println(count);
		driver.quit();
	}
	@Test(groups = {"smoke"}, priority = 4)
	public void testcase4() throws InterruptedException
	{
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("jeans",Keys.ENTER);
		Thread.sleep(2000);
		// For multiple elements there is one thing that is common is the "class name".
		WebElement shoe1 = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		shoe1.click();
		Thread.sleep(2000);
		
		Set<String> w = driver.getWindowHandles();
		Iterator<String> i = w.iterator();
		String parent_id = i.next();
		String child_id = i.next();
		System.out.println(parent_id);
		System.out.println(child_id);
		//Move the control from parent to child.
		driver.switchTo().window(child_id);//Now control in child id.
		Thread.sleep(1000);
		WebElement addcart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addcart.click();
		Thread.sleep(2000);
		driver.quit();
	}
	@Test(groups = {"smoke"}, priority = 5)
	public void testcase5() throws InterruptedException
	{
		driver=new ChromeDriver();
		Thread.sleep(1000);	
		driver.manage().window().maximize();
		//Amazon--->>
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("books");
		Thread.sleep(1000);
		List<WebElement> results = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count = results.size();
		System.out.println(count);
		Thread.sleep(1000);
		results.get(count-9).click();
		Thread.sleep(4000);
		driver.quit();
	}

}
