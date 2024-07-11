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
		
		for(int i=0;i<8;i++)
		{
			int index=rand.nextInt(s.length());
			char randChar=s.charAt(index);
			sb.append(randChar);
		}
		String randomString= sb.toString();
		System.out.println("The generated randam string is: "+randomString+j);
	
		
	for(int p=1;p<=30;p++)
	{
		if(((p%3)==0)||((p%5)==0))
          {
			if (((p%3)==0))
			{
				System.out.println(p+"  is the Buzz");
			}
		    if (((p%3)==0)&&((p%5)==0))
			{
				System.out.println(p +" is the Buzz and Freez");
			}
			if(((p%5)==0))
			{
				System.out.println(p +" is the Freez");
			}
          }
		else
		{
			System.out.println(p+ " is not buzz and Not Freez");
		}
	}
}
}	
	/*
	 * WebDriverWait wait= new WebDriverWait(driver,30)
	 * .ignoring(StaleElementReferenceException.class) .until(WebDriver driver)--> {
	 * driver.findElement(By.id("")).click(); return true }
	 */

//}
