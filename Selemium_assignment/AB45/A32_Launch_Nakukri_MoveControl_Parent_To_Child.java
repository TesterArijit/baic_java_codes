package ab45_selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A32_Launch_Nakukri_MoveControl_Parent_To_Child {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		WebElement login = driver.findElement(By.xpath("//a[@id='login_Layer']"));
		login.click();
		Thread.sleep(1000);
		WebElement google = driver.findElement(By.xpath("//span[.='Sign in with Google']"));
		google.click();
		Thread.sleep(000);
		//To get broser ids
		Set<String> s = driver.getWindowHandles();
		System.out.println(s);
		// Use Iterator interface to get parent & childs browser ids
		Iterator<String> i = s.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		String parent_id = i.next();
		String child_id = i.next();
		System.out.println(parent_id);
		System.out.println(child_id);
		//Transfer control from parent to child browser.
		driver.switchTo().window(child_id);
		Thread.sleep(1000);
		
		WebElement mail = driver.findElement(By.xpath("//input[@id='identifierId']"));
		mail.sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		WebElement next = driver.findElement(By.xpath("(//div[@class='VfPpkd-dgl2Hf-ppHlrf-sM5MNb'])[2]"));
		next.click();
		Thread.sleep(2000);
		driver.quit();
	
	}

}
