import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;

public class Test123 {
	public static WebDriver driver;
	
	public Test123(Class<Driver> class1) {
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void setUp(String browser, String url)
	{
		if(browser.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "path of the chrome driver");
		 driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FireFox")) {
			//System.setProperty("webdriver.gecko.driver", "path of the gecko driver");
			driver= new FirefoxDriver();
		}
		else {
			driver=new InternetExplorerDriver();
		}
		driver.get(url);
		
	}


}
