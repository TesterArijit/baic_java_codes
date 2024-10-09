package ab45_selenium;

//WAP on learning htmt file with help of absolute Xpath(here not to use components Your Last name,Relegion,submit ,submit,and sign up )

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A9_HTML_local_xpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/learningHTML1.html");
		Thread.sleep(1000);	
		WebElement username = driver.findElement(By.xpath("(/html/body/input)[1]"));
		username.sendKeys("Selenium");
		Thread.sleep(1000);
		WebElement Hint = driver.findElement(By.xpath("(/html/body/input)[2]"));
		Hint.sendKeys("abcde");
		Thread.sleep(1000);
		WebElement psw = driver.findElement(By.xpath("(/html/body/input)[3]"));
		psw.sendKeys("123456");
		WebElement fname = driver.findElement(By.xpath("(/html/body/form/input)[1]"));
		fname.sendKeys("Arijit");
		
		WebElement boy = driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
		boy.click();
		WebElement male = driver.findElement(By.xpath("(/html/body/input)[4]"));
		male.click();
		WebElement relocate = driver.findElement(By.xpath("(/html/body/input)[6]"));
		relocate.click();
		WebElement link = driver.findElement(By.xpath("/html/body/a"));
		link.click();
		Thread.sleep(4000);
		driver.quit();
	
	}

}
