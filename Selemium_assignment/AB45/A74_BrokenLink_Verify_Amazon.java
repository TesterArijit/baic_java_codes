package ab45_TestNG;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A74_BrokenLink_Verify_Amazon {
	static int count_Validlink=0;
	static int count_Brokenlink=0;
	static int count_Handledlink=0;
	
	public static void Verify_Link(String url) throws IOException
	{
		try {
						
			URL u = new URL(url);
			HttpURLConnection	u1=(HttpURLConnection) u.openConnection();
			
			if(u1.getResponseCode()==200) 
			{
				System.out.println(" Valid Link "+" Response message:-"+u1.getResponseMessage()+" Response code:- "+u1.getResponseCode());
				count_Validlink++;
			}
			else
			{
				System.out.println("In-Valid Link "+" Response message:-"+u1.getResponseMessage()+" Response code:- "+u1.getResponseCode());
				count_Brokenlink++;
			}

			
		} catch (Exception e) {
			System.out.println("Handled Exception");
			count_Handledlink++;
		}
		
	
	}


	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		List<WebElement> e = driver.findElements(By.tagName("a"));
		int count = e.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			WebElement ele = e.get(i);
			String url = ele.getAttribute("href");
			System.out.println(url);
			Verify_Link(url);
		
		}
		System.out.println("Total valid link is :-"+count_Validlink);
		System.out.println("Total In-valid link is :-"+count_Brokenlink);//null
		System.out.println("Total link tobe handled is :-"+count_Handledlink);
			
		driver.quit();

	}

	}
