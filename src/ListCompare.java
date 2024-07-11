import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class ListCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] ss= {"1,9,4,6,77,11", "1,11,8,9,3,11"};
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
			
		String[] s11=ss[0].split(",");
		
		for (int i=0;i<s11.length;i++)
		{
			int item=Integer.parseInt(s11[i]);
			al1.add(item);
		}
		
		System.out.println(al1);
		
      String[] s22=ss[1].split(",");
		
		for (int i=0;i<s22.length;i++)
		{
			int item=Integer.parseInt(s22[i]);
			al2.add(item);
		}
		System.out.println(al2);		
		
		Collections.sort(al1);
		Collections.sort(al2);
		
		System.out.println(al1);
		System.out.println(al2);
		
		al1.retainAll(al2);
		System.out.println(al1);
		

	}

}
