package Collections;

import java.util.ArrayList;

public class ArrayListEx3 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
       System.out.println("Initial list of element: "+al);
       System.out.println("list of element status: "+al.isEmpty());
       al.add("Ajay");
       al.add("Ravi");
       al.add("Vijay");
       System.out.println("After invoking add(E e) method: "+al);
       // Add element at specific position
       al.add(1,"Gaurav");
       System.out.println("After invoking add(int Index. element E) method: "+al);
       System.out.println("*****************");
       ArrayList al2=new ArrayList();
       al2.add("Sonu");
       al2.add("Hemant");
       System.out.println("al2, member: "+al2);
       System.out.println("list al element before adding al2 element: "+al);
       al.addAll(al2);
       System.out.println("list of al element after adding al2 element: "+al);
       System.out.println("********************");
       ArrayList al3= new ArrayList();
       al3.add("John");
       al3.add("Sayli");
       System.out.println("Element of al2: "+al2);
       System.out.println("Element of al3: "+al3);
       al2.addAll(al3);
       System.out.println("After adding al3 in al2: "+al2);
	}

}
