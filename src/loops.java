
public class loops {

	public static void main(String[] args) {

		// do while loop
		
		int x=10;
		
		do {
			System.out.println(x);
			x--;
		}while(x>=1);
		
		// while loop
		while(x<=100) {
			System.out.println(x++);
			//x++;
		}
		
	// for loops	
		int j=1;
		for(;;)
		{
			System.out.println(j++);
			if(j>=10) {
				break;
			}
		}
		
		//for each loop
		int[] c= {10,45,86,96,01,18};
		int sum=0;
		
		for(int l: c)
		{
			 sum=sum+l;
			 System.out.println(sum);
		}
		String[] s= {"vk","Jr","Kw","ss"};
		
		for(String d:s)
		{
			System.out.println(d);
		}
		//Printing stars
		int m;
		int o=5;
		
		for(m=1;m<=o;m++) {
			
			for(int n=1;n<=m;n++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//Switch case
		String name="bk";
		
		switch(name) {
		case "bh":
			System.out.println("this is bhikshapathi");
			break;
		case "kav":
			System.out.println("this is kavya");
			break;
		case "bk":
			System.out.println("this is bhikavya");
			break;
		case "kb":
			System.out.println("this is kavyabhik");
			break;
		default:
			System.out.println("There is nothing");
			
		}
		
		int q=1,w;
		 while(q<=3)
		 {
			 for(w=1;w<=5;w++) {
				 System.out.println(w);
			 }
			 q++;
			 System.out.println("-----------");
		 }
		 
		 int d,e;
		 
		 for(d=1,e=-10;d<=10;d++,e++)
		 {
			 System.out.println(d+"\t"+e);
		 }
		 for(d=1;d<=2;d++)
			{
				for(e=1;e<10;e++)
				{
					System.out.println(d+"\t"+e);
				}
			}
		}
	
	

}
