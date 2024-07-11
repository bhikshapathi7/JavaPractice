import java.util.ArrayList;
import java.util.Random;

public class Reversewords {

	public static void main(String[] args) {
		String s[]="Learning java and pyton and cucumber".split(" ");
		
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}
		
		int num = 1234567, reversed = 0;

        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("Reversed Number: " + reversed);
        

		Random rnd=new Random();
		int reversed1=rnd.nextInt(1000);
        System.out.println("Random Number: " + reversed1);
 
		int num1 = 1234567;
		String s1=Integer.toString(num1);
		char[] sa=s1.toCharArray();
		for(int i=sa.length-1;i>=0;i--)
		{
			System.out.print(sa[i]);
		}
		ArrayList<String> list= new ArrayList<String>();
		list.add("bhik");
		list.add("arun");
		list.add("uday");
		list.add("srinu");
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i).charAt(3));
		}
		int list1[]= {11,22,55,66,88,99,47};
		 for(int i=list1.length-1;i>=0;i--)
		    {
		    	System.out.print(list1[i]+",");
		    }

		 StringBuffer sb=new StringBuffer(s1);
		 sb.reverse();
		String reversedstring=sb.toString();
		int finalInteger=Integer.parseInt(reversedstring);
		System.out.println(finalInteger);
	}

}
