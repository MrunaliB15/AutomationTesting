package LinkedList_HashMap;


import java.util.LinkedList;


public class LinkedListEx2 {

	public static void main(String[] args) {
		LinkedList<String> Ll= new LinkedList<String>();
		System.out.println("Initial list of element: "+Ll);
		Ll.add("Ravi");
        Ll.add("Ajay");
        Ll.add("Vijay");
        System.out.println("After invocking add(E e) method: "+Ll);
        Ll.add(1, "Gaurav");
        System.out.println("After invoking add(int index, E element) method: "+Ll);
        
        LinkedList<String> Ll2= new LinkedList<String>();
        Ll2.add("sonu");
        Ll2.add("Hemant");
        Ll.addAll(Ll2);
        System.out.println("After invoking addAll(Collection<? extend E> C) method: "+Ll);
        
        LinkedList<String> Ll3= new LinkedList<String>();
        Ll3.add("john");
        Ll3.add("Rahul");
        // Adding third list element to 1st list at specific position
        Ll.addAll(Ll3);
        System.out.println("After invoking addAll(int index Collection<? extends E> c) method: "+Ll);
        // adding element at first position
        Ll.addFirst("Lokesh");
        System.out.println("After invoking addfirst(E e)method: "+Ll);
        Ll.addLast("Surya");
        System.out.println("After invoking addlast(E e) method: "+Ll);
        for(int i=0; i<Ll.size(); i++) {
        	if(Ll.get(i).equals("Gaurav")) {
        		Ll.set(i, "Bhushan");
        		break;
        	}
        }
        System.out.println("After invoking addlast(E e) method: "+Ll);
	}
}


	
