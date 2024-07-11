import java.util.Scanner;

public class OccurenceOfChar {
	
	public static void main(String[] args)
	{
		//String S="Apple and Banana are fruits".toLowerCase();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Some text : ");
		
		String S=sc.next("Enter Some text : ");
		
		
		char[] ch=S.toCharArray();
		
		int count=0;
		
		for (char i='a'; i<='z';i++)
		{
			for (char c:ch)
			{
				if(c==i)
				{
					count++;
				}
			
			}
			if(count>1)
			{
				System.out.println("The occurence of " +i+ "is"+ count);
				count=0;
			}
		}
	}

}
