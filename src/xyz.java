import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class xyz {

	public static void main(String[] args) {

		// remove duplicate characters
		// String S = "mississippi malayalam corejava";
		// char[] a = S.toCharArray();
		/*
		 * HashSet<Character> set = new HashSet<Character>(); StringBuffer Sb = new
		 * StringBuffer(); for (char c : a) { set.add(c);
		 * 
		 * } for (char d : set) { Sb.append(d); } String res = Sb.toString();
		 * System.out.println("The FInal ouput is " + res);
		 * 
		 * //reverese of characters in String for(int i=a.length-1;i>=0;i--) {
		 * System.out.print(a[i]); }
		 */
		//// reverese String and each characters in String
		/*
		 * String[] s = S.split(""); for (int i = s.length - 1; i >= 0; i--) { char[] d
		 * = s[i].toCharArray(); for (int j = d.length - 1; j >= 0; j--) {
		 * System.out.print(d[j]); } }
		 */
		// Remove Digits from String
		/*
		 * String S = "14526bhikshapathi007@gmail.com"; char[] c = S.toCharArray();
		 * StringBuffer Sb = new StringBuffer();
		 * 
		 * for (int i = 0; i <= S.length() - 1; i++) { if (!Character.isDigit(c[i])) {
		 * Sb.append(c[i]); } } String res = Sb.toString();
		 * System.out.println("The final output is " + res);
		 */
		/*
		 * String S1="Bhikshapathi"; String S2="Kavya";
		 * System.out.println("Before Swaping "+ S1+" "+S2);
		 * 
		 * S1=S1+S2; S2=S1.substring(0, S1.length()-S2.length());
		 * S1=S1.substring(S2.length()); System.out.println("After Swaping "+
		 * S1+" "+S2);
		 */

		// Bubble sort
		/*
		 * int a[]= {25,65,12,7,895,74,2,35,1}; int swap;
		 * 
		 * for(int i=0;i<a.length-1;i++) { for(int j=i+1;j<a.length-1;j++) {
		 * if(a[i]>a[j]) { swap=a[i]; a[i]=a[j]; a[j]=swap; } } } for(int
		 * k=0;k<a.length-1;k++) { System.out.print(a[k]+","); }
		 */

		// Binary Search

		/*
		 * int a[]= {14,16,52,59,61,85,98,101,145,156}; int value=98;
		 * 
		 * int Start=0; int end=a.length; int mid=(Start+end)/2; while(Start<=end) {
		 * System.out.println(a[mid]); if(value==a[mid]) { System.out.println(mid);
		 * break; } else if(value<a[mid]) { Start=a[mid]+1; } else { end=a[mid]-1; }
		 * mid=(Start+end)/2; System.out.println(mid); }
		 */

		// System.out.println();

		/*
		 * SimpleDateFormat dt=new SimpleDateFormat("MM-dd-yy hh:mm:ss"); Date d=new
		 * Date(); System.out.println(d); System.out.println(dt.format(d));
		 * 
		 * Random rnd=new Random(); int n=rnd.nextInt(1000); String
		 * S="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; StringBuffer Sb=new
		 * StringBuffer(); for(int i=0;i<=7;i++) { int index=rnd.nextInt(S.length());
		 * char c=S.charAt(index); Sb.append(c); } String rndStr=Sb.toString();
		 * System.out.println(rndStr+n);
		 */

		String S = "Java CoreJava PYTHON python JAVASCRIPT";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char c[] = S.toCharArray();
		for (char d : c) {
			if (hm.containsKey(d)) {
				hm.put(d, hm.get(d) + 1);
			}

			else {
				hm.put(d, 1);
			}
		}

		System.out.println("The required Results is " + hm);
    int count= S.length()-S.replace("a","").length();
    System.out.println("The  a required Results is " + count);
	}

}
