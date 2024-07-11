import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBuffer_Builder {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first name: ");
		String fname=br.readLine();
		System.out.println("Enter last name: ");
		String lname=br.readLine();
		sb.append(fname);
		sb.append(lname);
		System.out.println("The complete name is :"+ sb);
		System.out.println(sb.length());
		System.out.println("The Reverse of name is :"+sb.reverse());
		String temp="";
		StringBuffer p=new StringBuffer("Malayalam");
		String revStr=p.reverse().toString();
		temp=p.toString();
		if(temp.equalsIgnoreCase(revStr))
		{
			System.out.println("The given string is Polindrome");
		}else
		{
			System.out.println("The given string is not Polindrome");
		}

		String[] y="bhik kav both are one".split(" ");

		for(int v=y.length-1;v>=0;v--)
		{
			StringBuffer bb=new StringBuffer(y[v]);
			String sd=bb.reverse().toString();
			System.out.print(sd +" ");
		}



	}
}
