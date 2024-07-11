import java.util.Arrays;
import java.util.LinkedHashSet;

public class duplicatesStrings_words {

	public static void main(String[] args) {

		// Bubble sort
		int a[] = { 8, 2, 3, 9, 7, 1, 0, 4, 6, 58 };
		
		 int swap;
		  
		 for (int i = 0; i < a.length; i++) {
			 for (int j = i + 1; j < a.length; j++) {
				 
		 if (a[i] > a[j]) { 
			 swap = a[i];
			 a[i] = a[j]; 
			 a[j] = swap; } } }
		 for (int k =0; k < a.length; k++) {
			 System.out.print(a[k] + ",");		 
		 }
		 
		/*
		 * Arrays.parallelSort(a); //System.out.println(a); for (int j:a) {
		 * System.out.println(j); }
		 */
		System.out.println("###########");
		

		// Binary search
		// if want to do binary search the array should be in sorted either desc or asc

		int arr[] = { 1, 45, 85, 96, 456, 3590, 5556, 6565, 78956 };
		int target = 6565;
		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end) / 2;

		while (start <= end) 
		{
			if (arr[mid] == target) {
				System.out.println(arr[mid] + 1);
				break;
			} else if (arr[mid] < target) {
				start = mid + 1;

			} else {
				end = mid - 1;
			}
			mid = (start + end) / 2;
		}

	}

}
