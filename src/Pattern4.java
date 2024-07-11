
public class Pattern4 {

	public static void main(String[] args) {
		int n=5;
		int totalCol;
		
		for(int i=0;i<n-1;i++)
		{
			if(i<n)
			{
				totalCol=n-i;
			}else {
				totalCol=i;
			}

			for(int j=0;j<totalCol;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

} 
