
public class duplicatesWordsInaString {

	public static void main(String[] args) {
		  String s="Selenium test automation test engineer test qa test functional test";
		  
		  String w[]=s.trim().split(" ");
		  
		  for(int i=0;i<w.length;i++)
		  {
			  for(int j=i+1;j<w.length;j++)
			  {
				  if(w[i].equals(w[j]))
				  {
					  w[j]="";
				  }
			  }
		  }
		  for(int k=0;k<w.length;k++)
		  {
			  if(w[k]!=null)
			  {
				  System.out.print(w[k]+" ");
			  }
		  }
	}

}
