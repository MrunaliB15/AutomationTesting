package Vector_QueueAnd_Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet<String> al= new TreeSet<String>();
		al.add("Ravi");
		al.add("Ajay");
		al.add("Ravi");
		al.add("Vijay");
		System.out.println("Tree Set elements are: "+al);
		// Traversing elements
		Iterator<String> itr= al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Traversing element through  iterator in decending order..");
		Iterator i= al.descendingIterator();
		while(i.hasNext()) {
		  System.out.println(i.next());
		}
		System.out.println("*************************");
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(66);
		set.add(24);
		set.add(12);
		set.add(15);
		System.out.println("Tree Set elements are: "+set);
		System.out.println("First element value: "+set.pollFirst());
		System.out.println("After pollfirst(), Tree Set element value: "+set);
		System.out.println("Last element value: "+set.pollLast());
		System.out.println("After pollLast(), Tree Set element value: "+set);
		
		TreeSet<String> set2= new TreeSet<String>();
		set2.add("A");
		set2.add("B");
		set2.add("C");
		set2.add("D");
		set2.add("E");
		System.out.println("Initial set: "+set);
		
		System.out.println("Reverse Set: "+set2.descendingIterator());
		System.out.println("head set: "+set2.headSet("C"));
		System.out.println("head set: "+set2.headSet("C", true));
		
		System.out.println("sub set: "+set2.subSet("A", "E"));
		System.out.println("sub set: "+set2.subSet("A", false, "E", true));
		
		System.out.println("tail set: "+set2.tailSet("C"));
		System.out.println("tail set: "+set2.tailSet("C", false));
	}
}
