package Vector_QueueAnd_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
        list.add("Ajay");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ravi");
        System.out.println("List Elements: "+list);
        
        HashSet<String> set= new HashSet<String>(list);
        System.out.println("initial set element: "+set);
        System.out.println("*****Added Gaurav******");
        set.add("Gaurav");
        System.out.println("set element: "+set);
        Iterator<String> i= set.iterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
        //using lambda expression
        System.out.println("*********************");
        set.forEach(s1 ->{
        	System.out.println(s1);
        });
        System.out.println("*********************");
        set.removeIf(s1 ->s1.contains("Ravi"));
        System.out.println("set element: "+set);
	}

}
