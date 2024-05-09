package TASK4;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
      
	      HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
	      
	      hash_map.put(30,"Guvi");
	      hash_map.put(11,"Tulasi");
	      hash_map.put(20,"Konduru");
	      hash_map.put(9,"Parimi");

	      System.out.println("Initial Mappings are: " + hash_map); 
	      String returned_value = (String)hash_map.remove(9);
	      System.out.println("Returned value is: "+ returned_value);
	      System.out.println("New map is: "+ hash_map);
	   }
}

