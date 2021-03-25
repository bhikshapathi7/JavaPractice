
public class tableTest {

	public static void main(String[] args) {
        int n = 1;
		while(n<=10)
		{
			for(int i=1;i<=10;i++)
			{
				int z=n*i;
				System.out.println("This is the "+n+"th table:" +n+"*"+i+"="+z);
			}
			System.out.println("--------------");
			n++;
		}
	}

}
