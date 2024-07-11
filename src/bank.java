
public class bank {

	static double calculateIntrest(int principleAmount,int time, double rate)
	{
		double sum=(principleAmount*time*rate)/100;
		System.out.println("This is Sipmle Interest calculation:"+sum);
		return sum;

	}

	public static void main(String args[])
	{
		calculateIntrest(150000,15,15.75);
	}
}
