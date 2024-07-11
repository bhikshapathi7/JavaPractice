
public class methodOverRidding extends bank{
	double calculateIntrest()
	{
		int p = 20000,n = 5,t = 8;
		double r = 12.5;
		double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("Compound Interest after " + t + " years: "+cinterest);
        System.out.println("Amount after " + t + " years: "+amount);
        super.calculateIntrest(850000, 12, 15.20);
		return cinterest;
	}
	public static void main(String[] args) {

		methodOverRidding mor= new methodOverRidding();
		mor.calculateIntrest();
		
	}

}
