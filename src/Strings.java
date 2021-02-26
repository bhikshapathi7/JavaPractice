import java.util.Random;

public class Strings {

	public static void main(String[] args) {

		String[] s="Selenium Test Automation with Java".split(" ");
		
		for (int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i].charAt(3));
		}
		
		//Random String
		
		String rs="asddfjjkqwertyuizxcvbnm";
		StringBuilder sb= new StringBuilder();
		 Random rnd= new Random();
		  int len=5;
		  int rndnum=rnd.nextInt(1000);
		  
		  for(int i=0;i<=len;i++)
		  {
			  int index=rnd.nextInt(rs.length());
			  
			  char rndChar=rs.charAt(index);
			  sb.append(rndChar);
			  
			 }
		    String rndString=sb.toString();
		    System.out.println("\n"+rndString+rndnum+"@gmail.com");
				 
		
			String a = "Love";  
	        String b = "You";  
	        System.out.println("Before swap: " + a + " " + b);  
	        a = a + b;  
	        b = a.substring(0, a.length() - b.length());  
	        a = a.substring(b.length());  
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
		
	}

}
