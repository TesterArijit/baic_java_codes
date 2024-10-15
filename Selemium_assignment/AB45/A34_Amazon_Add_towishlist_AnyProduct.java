package ab45_selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A34_Amazon_Add_towishlist_AnyProduct {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shirt",Keys.ENTER);
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
		WebElement addcart = driver.findElement(By.xpath("//a[.=' Add to Wish List ']"));
		addcart.click();
		Thread.sleep(2000);
		driver.quit();

	}

}
