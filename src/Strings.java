import java.util.HashSet;
import java.util.Random;

public class Strings {

	public static void main(String[] args) {
		String[] s="Selenium Test Automation with Java".split(" ");
		for (int i=s.length-1;i>=0;i--)
		{
			//System.out.print(s[i] +" ");
			System.out.print(s[i].charAt(3));
		}
		System.out.println();
		for(int j=0;j<=s.length-1;j++)
		{
			System.out.print(s[j].charAt(3));
		}
				 
			String a = "bhi";  
	        String b = "kum";  
	        System.out.println("Before swap: " + a + " " + b);  
	        a = a + b; 
	        // bhikum
	        b = a.substring(0, a.length() - b.length()); // bhikum-kum==bhi
	        a = a.substring(b.length()); // kum
	        System.out.println("After swap: " + a + " " + b);
	        
	        
	        //Remove Duplicate strings
	       String[] w="Selenium Test Automation Test java Test java Selenium Test Automation Test java".split(" ");
	       // int[] w= {1,1,2,2,5,6,3,2,1,5,6,5,3,2};
	        
	        for(int i=0;i<w.length;i++)
	        {
	        	for(int j=i+1;j<w.length;j++)
		        {
	        		if(w[i].equalsIgnoreCase(w[j]))
	        		{
	        			w[j]=" ";
	        		}
		        }
	        }
	        for(int k=0;k<w.length;k++)
	        {
	        	if(w[k]!=" ")
	        	{
	        		System.out.print(w[k]+" ");
	        	}
	        }
	        System.out.println();
		
	        String x[]="kavya hare i am Bhikshapathi".split(" ");
	        for(int i=x.length-1;i>=0;i--)
	        {
	        	for(int j=x[i].length()-1;j>=0;j--)
	        	{
	        		System.out.print(x[i].charAt(j));
	        	}
	        	System.out.print(" ");
	        }
	
	/*protected void waitForElement(int timeout, final WebDriver aDriver,final WebElement element) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(aDriver)
		.withTimeout(60, TimeUnit.SECONDS)
		.pollingEvery(5, TimeUnit.SECONDS);
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver aDriver) {
				return element.isDisplayed();
			}
		};
		try {
			wait.until(expectation);
		} catch (Throwable error) {
			error.getMessage();
		}*/
	
	String g="mississippi";
	char cha[]=g.toCharArray();
	int count=0;
	for(char i1='a';i1<='z';i1++)
	{
		for(char m:cha)
		{
			if(m==i1) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("the count of "+i1+ "is "+count);
			count=0;}
	}
	
	StringBuffer sb1=new StringBuffer();
	HashSet<Character> set= new HashSet<Character>();
	
	for(char n:cha)
	{
		set.add(n);
	}
	for(char l:set) {
		sb1.append(l);
		
	}
	String d=sb1.toString();
	System.out.print("the final string is "+ d);
	
	}
	
	//swap two integers without using third variable
	/*int a=45,  b=25;
	
	a=a+b;   //45+25=70
	b=a-b;   //70-25=45
	a=a-b;   //70-45=25*/
}











