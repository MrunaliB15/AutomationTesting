package LinkedList_HashMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		Map m= new TreeMap();
		m.put("key1", "admin");
        m.put("kay3", "admin");
        m.put("kay5", "admin123");
        m.put("kay0", "admin");
        System.out.println("Map Elements are: "+m);
        System.out.println("Map Element count: "+m.size());
	}

}
