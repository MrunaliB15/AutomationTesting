package Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList5 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();  //generic way
		System.out.println("Is ArrayList Empty: "+al.isEmpty());
		al.add("Vijay");
		al.add("Ajay");
		al.add("Ravi");
		al.add("Hemant");
		ArrayList<String> al2 = new ArrayList<String>();
		al.add("sonu");
		al.add("Ajay");
		al.add("Raj");
		System.out.println("al list element: "+al);
		System.out.println("al2 list element: "+al2);
		al.retainAll(al2);
		System.out.println("al list after retainAll(): "+al);
		System.out.println("iterating the element after rataining the element of al2: ");
		Iterator itr= al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ArrayList l1= new ArrayList();
		l1.add("Mumbai");
		l1.add("Mumbai");
		l1.add(234);
		l1.add("Mumbai");
		l1.add("null");
		System.out.println(l1);
	}

}
