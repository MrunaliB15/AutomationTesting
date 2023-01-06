package Vector_QueueAnd_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx2 {

	public static void main(String[] args) {
		Set<String> set= new HashSet<String>();
        set.add("Ravi");
        set.add("Ajay");
        set.add("Ravi"); // neglating duplicate element
        set.add("Vijay");
        System.out.println("after invoking remove(object) method: "+set);
        System.out.println("set size: "+set.size());
        //traversing element
        Iterator<String> itr= set.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        System.out.println(" removing Ravi from set: "+set);
        System.out.println("after invoking remove(object) method: "+set);
        HashSet<String> set1= new HashSet<String>();
        set1.add("Ajay");
        set1.add("Gaurav");
        System.out.println("set1 element: "+set1);
        set.addAll(set1);
        System.out.println("Updated list: "+set);
        set.removeAll(set1);
        System.out.println("after invoking removeAll() method (set1): "+set);
        set.removeIf(str ->str.contains("Vijay"));
        set.clear();
        System.out.println("After invoking clear() method: "+set);
	}

}
