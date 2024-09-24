package basic_selinium;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_108_BrokenLinks {
	static void verify_Link(String url) throws IOException
	   {
		   URL u =new URL(url);
		 HttpURLConnection h = (HttpURLConnection) u.openConnection();
		 
		 
		 if(h.getResponseCode()==200)
		 {
			 System.out.println("Link is OK");
		 }
		 else
		 {
			 System.out.println("Link is BrokenLink");
		 }
	   }	 

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();//to maximize the browser
	    driver.get("https://www.google.com/");
	 List<WebElement> l1=driver.findElements(By.tagName("a"));
	   Thread.sleep(2000);
	   int count = l1.size();
	   System.out.println(count);
	   
	   for(int i=0;i<count;i++)
	   {
		   WebElement  e= l1.get(i);
			 String url = e.getAttribute("href");
			 System.out.println(url);
			 // we get the attribute value of the given attribute name
			 //here it is "href"
			 verify_Link(url);
				 
	   }
		   
	}

}
