import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class hashMapsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	HashMap<String,String> hm=new HashMap<String,String>();
    hm.put("Vk", "Captain");
    hm.put("Rohit", "Opener");
    hm.put("Hardik", "All Rounder");
    hm.put("Bumrah", "Bowler");
    hm.put("Pant", "WicketKeeper");
    hm.put("Sanju", "WicketKeeper"); // Duplicate values-- allowed
    hm.put("Pant1", "");  // Null Values -- allowed
    hm.put(null, "Captain"); // Null key -- Not allowed
    hm.put("Vk", "Captain"); //Duplicate Key --- Not Allowed
    hm.put(null, null); // null Key and values --- allowed
    System.out.println("Created Hash map is :"+hm);
   
    // To get only  Keys fro HashMAp
    for(Map.Entry m : hm.entrySet()){    
        System.out.println("Key from Hash map is :"+m.getKey() + " value from Hash map is :"+m.getValue());      
      }        
    hm.replace("Pant", "KL");
    System.out.println("Created Hash map is :"+hm);
    
    hm.remove("Pant");
    System.out.println("Created Hash map is :"+hm);
    hm.put("Ravi", "Coach");
    System.out.println("Created Hash map is :"+hm);
   // hm.replaceAll(k,v)-> "Indian");
    //hm.replaceAll((k,v) -> "Indian"); 
   // System.out.println("Created Hash map is :"+hm);
    TreeMap<String,String> tm=new  TreeMap<String,String> (hm); 
    
    for(Map.Entry m:tm.entrySet())
    {
    	System.out.println(m.getKey()+" "+m.getValue()); 
    }
    
	}

}
