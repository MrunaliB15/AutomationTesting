package LinkedList_HashMap;

import java.util.HashMap;
import java.util.Map;

public class MapEX {

	public static void main(String[] args) {
		Map m1= new HashMap();
        m1.put("key1", "admin");
        m1.put("key2", "admin");
        m1.put(null, "admin123");
        System.out.println("map elements are: "+m1);
        System.out.println("map element count: "+m1.size());
        m1.put("key2", "maneger");
        m1.put(458, "maneger");
        m1.put(null, 1234);
        System.out.println("map elements are: "+m1);
        System.out.println("map element count: "+m1.size());
        
        System.out.println("get the key value: "+m1.get("key2"));
        System.out.println("key set of map: "+m1.keySet());
        System.out.println("key set value: "+m1.values());
	}

}
