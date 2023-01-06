package Vector_QueueAnd_Set;

import java.util.Vector;

public class VectorCapacity {

	public static void main(String[] args) {
		Vector<String> VcTr= new Vector<String>();
		System.out.println("Vector capacity: "+VcTr.capacity());
		System.out.println("Vector size: "+VcTr.size());
		VcTr.setSize(2);
		System.out.println("Vector size: "+VcTr.size());
		System.out.println("Vector element: "+VcTr);
		VcTr.addElement("Monday");
		VcTr.addElement("Tuesday");
		System.out.println("After Addition vector element: "+VcTr);
		System.out.println("After addition vector size is: "+VcTr.size());
		VcTr.addElement("Wednesday");
		System.out.println("After add Element, vector Element: "+VcTr);
		System.out.println("After add Element, vector size is: "+VcTr.size());
		System.out.println("Vector Cacity: "+VcTr.capacity());
	}

}
