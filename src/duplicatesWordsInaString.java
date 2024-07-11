import java.util.Iterator;
import java.util.LinkedHashSet;

public class duplicatesWordsInaString {

	public static void main(String[] args) {
		String s = "Selenium test automation test engineer test qa test functional test";
		StringBuffer sb = new StringBuffer();
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		String w[] = s.trim().split(" ");

		for (int i1 = 0; i1 < w.length; i1++) {
			set1.add(w[i1]);
		}
		
		for (String ss : set1) {
			sb.append(ss + " ");
		}

		String output = sb.toString();
		System.out.print(output + " ");
		System.out.print("********************* ");

		int count = 0;
		String s1 = "mississippi";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		char ch[] = s1.toCharArray();
		StringBuffer sbr = new StringBuffer();
		for (char m : ch) {
			set.add(m);

		}		
		System.out.println("The result set is :"+set);
		for (char c1 : set) {
			sbr.append(c1);
		}
		String res = sbr.toString();
		System.out.println("After removed duplicate chars result string is " + res);

		for (char m : ch) {
			if (m == 's') {
				count++;
			}
		}
		// or

		/*
		 * for(int d=0;d<s1.length();d++)
		 * 
		 * { if(s1.charAt(d)=='s') { count++;
		 * 
		 * } }
		 */

		System.out.println("the character oocurence of s is" + count);

		int cou = s1.length() - s1.replace("p", "").length();		
		System.out.println("the character occurence count is" + cou);

	}
}
