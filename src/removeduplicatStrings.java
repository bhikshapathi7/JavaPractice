import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class removeduplicatStrings {

	public static void main(String[] args) {
		 ArrayList<String> listStrings=new ArrayList<String>(Arrays.asList("11","22","Vk","bk","dk","msd","vk","bk","rs","vk","bk","dk","msd"));
		    
		  //1. LinkedHashSet is data type it is not allowed duplicates but allowed null
		  LinkedHashSet<String> a= new LinkedHashSet<String>(listStrings);
		  ArrayList<String> duplicatesStr=new ArrayList<String>(a);
		  System.out.println(duplicatesStr);
		  duplicatesStr.sort(String.CASE_INSENSITIVE_ORDER);
		  System.out.println(duplicatesStr);
		  

	}

}
