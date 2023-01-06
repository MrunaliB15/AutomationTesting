package Collections;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		list.add("mango");
		list.add(1234);
		list.add("banana");
		list.add("null");
		list.add(15.26);
		list.add("true");
		list.add(new ArrayListEx1());
		list.add("banana");   //duplicate
		//printing ArrayList
		System.out.println("size of list: "+list.size());
		System.out.println("Elements of list: "+list);
		System.out.println("Traversing list through for loop: ");
			for(int i=0; i<list.size();i++) {
				System.out.println(list.get(i));
			}
			System.out.println("*******************");
			System.out.println("Traversing list through for each loop: ");
			for(Object fruit:list) {
				System.out.println(fruit);
			}
			System.out.println("*****************");
			//accessing element
			System.out.println("Returning element: "+list.get(1));
			System.out.println("*****************");
			// changing existing element
			list.set(1,"Date");
			System.out.println("size of list: "+list.size());
			System.out.println("Element of list: "+list);
		}

}
