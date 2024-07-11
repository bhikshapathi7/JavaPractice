import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list1 = new ArrayList<String>(
				Arrays.asList("vk", "rs", "msdcool", "Kl", "Jb", "Ash"));
		ArrayList<String> list2 = new ArrayList<String>(
				Arrays.asList("aa", "vk", "rs", "msd", "Kl", "Jb", "Ash", "Rj", "RP", "Sg"));

		Collections.sort(list1);
		System.out.println("After sorting list1 :" + list1);
		Collections.sort(list2);
		System.out.println("After sorting list2 :" + list2);

		// Comparing two lists by using equals
		System.out.println(list1.equals(list2));		
		//missing element from list1 list1.removeAll(list2);
		list2.removeAll(list1);

		System.out.println("Different values from both lists are " + list2);
		//list2.removeAll(list1);

		// compare and print extra items from list
		//System.out.println(list2);

		// Pring common values from both list

		list1.retainAll(list2);

		System.out.println("common values from both lists are " + list1);

	}

}
