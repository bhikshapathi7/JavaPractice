
public class repeatedCharCount {

	public static void main(String[] args) {
		String str="Java J2EE JSon JAVa ja va vaja jjjj zz bhikshapathi";
		String str1=str.toLowerCase();
        char[] charArr=str1.toCharArray();
		int count=0;
		for(char i='a';i<='z';i++)
		{
			for(char c:charArr)
			{
				if(c==i)
				{
					count=count+1;
				}
			}
			if(count>0)
			{
				System.out.println("count of:"+i +" = "+count);
				count=0;
			}
		}
		}

	}

