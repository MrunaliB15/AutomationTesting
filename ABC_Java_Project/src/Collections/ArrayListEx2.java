package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx2 {                  //ex1
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        // printing Array list object
        System.out.println("size of list: "+list.size());
        System.out.println("Elements of list: "+list);
        System.out.println("Traversing list through for loop: ");
        for(int i=0; i<list.size(); i++) {
        	System.out.println(list.get(i));
        }
        System.out.println("Traversing list through for each loop: ");
        for(Object fruit: list) {
        	System.out.println(fruit);
        }
        System.out.println("returning Element: "+list.get(1));
        // changing the element
        list.set(1,"Date");
        System.out.println("size of list: "+list.size());
        System.out.println("Element of list: "+list);
        //sorting the list
        Collections.sort(list);
        System.out.println("size of list: "+list.size());
        System.out.println("Element of list: "+list);
        System.out.println("Traversing list through forEach() loop: ");
        list.forEach(a -> {
        System.out.println(a);
	});
        System.out.println("Traversing through Iterator interface: ");
        Iterator itr= list.iterator();
        while (itr.hasNext()) {
        	System.out.println(itr.next());
        }
        System.out.println(itr.hasNext());
        System.out.println("*******with used iterator object*********");
        while(itr.hasNext()) {
        System.out.println(itr.next());
	}
	System.out.println("Traversing list through Iterator interface: ");
	Iterator itr2= list.iterator();
	while( itr2.hasNext()) {
	System.out.println(itr2.next());
	}
	}
}
	



