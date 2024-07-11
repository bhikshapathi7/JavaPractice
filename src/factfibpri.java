
public class factfibpri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  int fact=1;
		  for(int i=1;i<=10;i++) {
			  fact= fact*i;
		  
		 } 
		  System.out.println("The Factorial is "+ fact);
		 
		
		
		 int n1=0; int n2=1; int n3;		 
		 for(int i=0;i<=25;i++)
		 { 
		 n3=n1+n2;
		 System.out.println(n3); 
		 n1=n2; 
		 n2=n3; 
		 }
		 
		
		 int sum = 0,
	     n=14541,r; 
		 int temp=n; 
		 while(n>0){ 
		 r=n%10; //getting remainder
		 sum=(sum*10)+r; 
		 n=n/10;
		 } 
		 if(temp==sum) 
		 { System.out.println("palindrome");
		 }
		  else { 
			  System.out.println("not palindrome"); 
			  }
		 
		
		int nn=7, temp1 = 0;
		for(int i=2;i<=nn;i++) {
		if((nn%i)==0)
		{
			temp1++;
		}
	}
	if(temp<='2')
	{
		System.out.println("not Prime");
	}
	else {
		System.out.println(" Prime");
	}

}
}