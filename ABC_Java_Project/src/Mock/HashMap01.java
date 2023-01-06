package Mock;

import java.util.HashMap;
import java.util.Map;

public class HashMap01 {

	public static void main(String[] args) {
	   HashMap<Integer, String> hmap= new HashMap<Integer,String>();
	   hmap.put(1,"Black");
	   hmap.put(2,"Silver");
	   hmap.put(3,"Golden");
	   hmap.put(4,"Yellow");
       
	   System.out.println("Iterating HashMap........");
	   for(Map.Entry m1: hmap.entrySet()) {
		   System.out.println(m1.getKey()+" "+m1.getValue());
	   }
	}

}
