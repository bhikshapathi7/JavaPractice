
public class duplicatesWordsInaString1 {

	public static void main(String[] args) {
		String s = "Selenium test automation test engineer test qa test functional test";
		
		String[] SS=s.trim().split(" ");
		
		for (int i=0;i<=SS.length-1;i++)
		{
			for( int j=i+1;j<=SS.length-1;j++)
			{
				if(SS[i].equals(SS[j]))
				{
					SS[j]=" ";
				}
			}
		}
		for (int k=0;k<=SS.length-1;k++)
		{
			if(SS[k]!=null)
			{
				System.out.print(SS[k]+" ");
			}
		}

	}

}
