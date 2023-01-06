package LinkedList_HashMap;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx1 {

	public static void main(String[] args) {
		LinkedList<String> Ll= new LinkedList<String>();
		System.out.println("Initial list of element: "+Ll);
        Ll.add("Ravi");
        Ll.add("Ajay");
        Ll.add("Vijay");
        System.out.println("after invoking add(E e) method: "+Ll);
        //add element on specific position
        Ll.add(1,"Gaurav");
        System.out.println("After invoking add(int index, E element) method: "+Ll);
         Iterator <String> itr=Ll.iterator();    //hasNext(), next(),remove()
         
         ListIterator<String> litr= Ll.listIterator();  //hasNext() & hasPrevious(), next() & previous(),remove()
         System.out.println("check whether we have any element before 1st element: "+litr.hasPrevious());
         System.out.println("collection has element or not: "+litr.hasNext());
         System.out.println("first element: "+litr.next());
         System.out.println("first element: "+litr.next());
         System.out.println("before first element: "+litr.previous());
         System.out.println("before 1st element: "+litr.previous());
	}

}
