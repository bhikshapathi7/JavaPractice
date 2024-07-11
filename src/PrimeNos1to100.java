
public class PrimeNos1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int n = 0;
		// Empty String
		String primenbers = "";

		for (i = 2; i <= 100; i++) {
			int counter = 0;
			for (n = i; n >= 1; n--) {
				if (i % n == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				// Appended the Prime nber to the String
				primenbers = primenbers + i + " ";
			}
		}
		System.out.println("Prime nbers from 1 to 100 are :");
		System.out.println(primenbers);

	}

}
