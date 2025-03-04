package bhikshapathi;

import org.apache.poi.sl.usermodel.ObjectData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class dataProviderExample {
public static WebDriver driver;
	@Test(dataProvider="testData")
	public void loginTest(String un, String pw)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("user-name")).sendKeys(un);
	    driver.findElement(By.id("password")).sendKeys(pw);
	    driver.findElement(By.id("login-button")).click();
	    driver.close();
		
	}
@DataProvider(name="testData")
	public Object[][] dp()
	{
		return new Object [][]{
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"}
		};
		
		
	}
}
