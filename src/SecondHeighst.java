import java.util.Arrays;

public class SecondHeighst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {9,5,2,6,1,-2,8,29,78,23,29};
		
		int n=num.length;
		
		Arrays.parallelSort(num);
		
	   System.out.println(num[n-2]);
		
		//Second approach
		
		int h=0;
		int sh=0;
		
		for(int i=0;i<n;i++)
		{
			if(num[i]>h)
			{
				sh=h;
				h=num[i];
			}
			if(num[i]<h && num[i]>sh)
			{
				sh=num[i];
						
			}
		}
		
		System.out.println(sh);
		

	}

}
