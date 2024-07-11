import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;

public class brokenLinks {
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
	
	@Test(priority = 1)
	public void getlinks()
	{
		List<WebElement> list=driver.findElements(By.tagName("a"));
		ArrayList<String> links=new ArrayList<String>();		
		for(WebElement e:list)
		{
			String a=e.getAttribute("href");
			links.add(a);
			getStatusOfLink(a);
		}
		int Size=links.size();
		System.out.println("The no of links in a webpage is "+ Size);
		
	}
	@Test(priority = 2)
	public void getStatusOfLink(String li)
	{
	try {	
		HttpURLConnection conn = (HttpsURLConnection)(new URL(li).openConnection());
		conn.setConnectTimeout(5000);
		conn.connect();
		if(conn.getResponseCode()>=400) {
			
			System.out.println("The Given Url is Broken Url");
		}else {	
			
			System.out.println("The Given Url is not Broken Url");
		}
		
	}catch (Exception e) {
		e.getMessage();
	}
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
