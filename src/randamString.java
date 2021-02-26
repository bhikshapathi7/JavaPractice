import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class randamString {

	public static void main(String[] args) {

		String s="abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb= new StringBuilder();
		
		Random rand= new Random();
		int j=rand.nextInt(1000);
		
		int len=8;
		for(int i=0;i<len;i++)
		{
			int index=rand.nextInt(s.length());
			char randChar=s.charAt(index);
			sb.append(randChar);
		}
		
		String randomString= sb.toString();
		System.out.println("The generated randam string is: "+randomString+j);
		
	}
	
	/*
	 * WebDriverWait wait= new WebDriverWait(driver,30)
	 * .ignoring(StaleElementReferenceException.class) .until(WebDriver driver)--> {
	 * driver.findElement(By.id("")).click(); return true }
	 */

}
