
public class MaxAndMinFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] a= {4,1,2,-8,0,7,3};
		int max=0;
		int min=0;
		
		
		for(int i=1;i<a.length;i++)
		{
			
			 if(a[i]>max) 
			 { max=a[i]; }
			 
			
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		
		System.out.println("The maximum value is :"+ max);
		System.out.println("The minimum value is :"+ min);

	}

}
