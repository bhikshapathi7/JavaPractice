
public class leapyear {

	public static void main(String[] args) {
		int y=2014;
		//boolean f=false;
		if(y%400==0||y%4==0)
		{
			System.out.println("The given " +y+ " is leap year");
		} else if(y%100!=0 &&y%4==0) {
			System.out.println("The given " +y+ " is leap year");
		}
		else {
			System.out.println("The given " +y+ " is not leap year");
		}
	}

}
