import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class HashMapTest1 {

	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>();
	    hm.put("Vk", "Captain");
	    hm.put("Rohit", "Opener");
	    hm.put("Hardik", "All Rounder");
	    hm.put("Bumrah", "Bowler");
	    hm.put("Pant", "WicketKeeper");
	    hm.put("Pant", "WicketKeeper1");
	    hm.put("", "WicketKeeper");
	    hm.put("Sanju", "WicketKeeper"); // Duplicate values-- allowed
	    hm.put("Pant1", "");  // Null Values -- allowed
	    
           Set<String>keyset=hm.keySet();
           System.out.println(keyset);
           List<String> list=new ArrayList<String>();
           for(String s:keyset)
           {
        	   list.add(s);
           }
           System.out.println("list " +list);        
           Collection<String> valuesList= hm.values();
          List<String> listValues=new ArrayList<String>();
          for(String v:valuesList)
          {
        	  listValues.add(v);
          }
          System.out.println("listValues :"+ listValues);
	}

}
