package Vector_QueueAnd_Set;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
      Vector<String> vec=new Vector<String>();
      System.out.println("Elements are: "+vec.capacity());
      vec.add("Tiger");
      vec.add("Lion");
      vec.add("Dog");
      vec.add("Elephant");
      vec.add("Cat");
      vec.add("Tiger");
      vec.add("Lion");
      vec.add("Dog");
      vec.add("Elephant");
      vec.add("Cat");
      System.out.println("Elementa are: "+vec);
      vec.addElement("mat");
      System.out.println("Elements are: "+vec.capacity());
      System.out.println("Elements are: "+vec);
      for(String str:vec) {
      System.out.println(str);
      }
	}

}
