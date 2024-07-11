package bhikshapathi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class excelReadWrite {
	
	public static WebDriver driver;
	public static String un;
	public static String pw;
	public static String browser;
	public static String url;
	File f= new File("C:\\Users\\Kummari Bhikshapathi\\Desktop\\AutomationPractice.xlsx");
	
	@SuppressWarnings("resource")
	@BeforeTest
	public void loginTest() throws IOException {
	FileInputStream fis=new FileInputStream(f);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet("Sheet2");
	Row r=sh.getRow(1);
    un=r.getCell(0).getStringCellValue();
	 pw=r.getCell(1).getStringCellValue();
	 browser=r.getCell(2).getStringCellValue();
	 url=r.getCell(3).getStringCellValue();
		if(browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
	    driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\FirefoxDriver\\firefoxdriver.exe");
		    driver=new FirefoxDriver();
		}
		else {
			driver=new InternetExplorerDriver();
		}
		
		driver.get("url");
		driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider="values")
	public void doLogin(String uname, String pwd) throws IOException
	{
		/*java.util.Scanner sc=new java.util.Scanner(System.in);
		String sd=sc.next();
		int x=sc.nextInt();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String sa=br.readLine();
		int z=br.read();*/
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
	}
	
	public void writeExcel() throws IOException
	{
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("Sheet3");
		int c=sh.getLastRowNum();
		Row row=sh.getRow(1);
		row.getCell(1).setCellValue("Bhikshapathi");
		row.getCell(2).setCellValue("Kummari");
		FileOutputStream fo=new FileOutputStream(f);
		wb.write(fo);
		wb.close();
		
	}
	public void readExcel() throws FileNotFoundException
	{
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh=wb.getSheet("Sheet3");
		int rowsize=sh.getLastRowNum();
		for(int j=1;j<=rowsize-1;j++) 
		{
		Row row=sh.getRow(j);
		int col=row.getLastCellNum();
			for(int i=0;i<=col-1;i++) 
			{
			System.out.println(row.getCell(i));
			}
			System.out.println("******************************************");
	    }
	}
	
	@DataProvider(name="values")
	public Object[][] testdata()
	{
		return new Object[][]
			{
			{"test1","Test1"},
			{"test1","Test1"},
			{"test1","Test1"},
			{"test1","Test1"}
			};
			
	}
	
	

}
