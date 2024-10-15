package ab45_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A31_FileUploadPopup_Handle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		Thread.sleep(1000);
		WebElement upload_file = driver.findElement(By.id("uploadfile_0"));
		upload_file.sendKeys("C:\\Users\\chatt\\Downloads\\Triangle01.java");
		Thread.sleep(1000);
		WebElement check = driver.findElement(By.id("terms"));
		check.click();
		Thread.sleep(1000);
		WebElement sub = driver.findElement(By.id("submitbutton"));
		sub.click();
		Thread.sleep(2000);
	driver.quit();

	}

}
