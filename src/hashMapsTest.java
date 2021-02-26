import java.util.HashMap;
import java.util.Map;
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
    System.out.println("Created Hash map is :"+hm);
    
    // To get only  Keys fro HashMAp
    for(Map.Entry m : hm.entrySet()){    
        System.out.println("Key value from Hash map is :"+m.getKey());    
       }  
 // To get only Values from HashMAp
    for(Map.Entry m : hm.entrySet()){    
        System.out.println("value from Hash map is :"+m.getValue());    
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
    
    for(Map.Entry m:hm.entrySet())
    {
    	System.out.println(m.getKey()+" "+m.getValue()); 
    }
    
	}

}
