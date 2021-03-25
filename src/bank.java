
public class bank {
	
	double calculateIntrest()
	{
		int principleAmount = 10000 ,time = 10;
		double rate = 8.50;
		double sum=0;
		sum=(principleAmount*time*rate)/100;
		System.out.println("This is Sipmle Interest calculation:"+sum);
		return sum;
		
	}

}
