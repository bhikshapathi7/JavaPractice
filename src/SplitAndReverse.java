
public class SplitAndReverse {

	public static void main(String[] args) {
		String s = "I am Bhikshapathi. working as Lead QA for persistent. and my base location is Hyderabad.";

		String[] ss = s.trim().split("\\s+");
		for (int i = 0; i <= ss.length - 1; i++) {
			if (ss[i].endsWith(".")) {
				char[] ch = ss[i].toCharArray();

				for (int j = ch.length - 2; j >= 0; j--) {
					System.out.print(ch[j]);
				}
				System.out.print(". ");
			} else {
				System.out.print(ss[i] + " ");
			}
		}

	}

}
