
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class removedDuplicates {

	public static void main(String[] args) {
			    ArrayList<Integer> list1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,1,2,3,1,2,3,4,5,6,1,1,2,3,9,9,9,7,7,10,77,88));
			    /*list1.add(1);
			    list1.add(10);
			    list1.add(1);
			    list1.add(111);
			    list1.add(11);
			    list1.add(10);
			    list1.add(111);
			    list1.add(11);
			    list1.add(2);
			    list1.add(2);*/
			    
			    
			  //1. LinkedHashSet
			  LinkedHashSet<Integer> list2= new LinkedHashSet<Integer>(list1);
			 ArrayList<Integer> duplicates=new ArrayList<Integer>(list2);
			  System.out.println(duplicates);
			  //2. JDK8 Stream 
				
				// ArrayList<Integer> listA=new
				// ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,1,2,3,1,2,3,4,5,6,1,1,2,3));
				// List<Integer>
				 //removedDuplicates=listA.stream().distinct.collect(Collectors.toList());
				 //System.out.println(removedDuplicates);
			  
			}
}
	
