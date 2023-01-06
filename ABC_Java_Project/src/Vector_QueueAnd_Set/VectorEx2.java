package Vector_QueueAnd_Set;

import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
		Vector<String> vec= new Vector<String>();
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");
        vec.add("Tiger2");
        vec.add("Lion2");
        vec.add("Dog2");
        System.out.println("Vector Elements are: "+vec);
        System.out.println("Vector capasity are: "+vec.capacity());
        vec.addElement("Rat");
        System.out.println("After 1st element added vector element are: "+vec);
        System.out.println("After 1st element added vector capacity are: "+vec.capacity());
        vec.addElement("Cat");
        System.out.println("After 2nd element added vector element are: "+vec);
        System.out.println("After 2nd element added vector capacity are: "+vec.capacity());
        for(String str: vec) {
        	System.out.println(str);
        }
	}

}
