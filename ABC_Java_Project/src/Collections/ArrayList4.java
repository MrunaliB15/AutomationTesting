package Collections;

import java.util.ArrayList;

public class ArrayList4 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
         al.add("Ajay");
         al.add("Vijay");
         al.add("Ravi");
         al.add("Sayli");
         al.add("Manmeet");
         System.out.println("Initial list of element: "+al);
         //Removing specific element from Array list
         System.out.println("Removing 'Sayli' from Collection: "+al.remove("Sayli"));
         System.out.println("After removing(Object) method: "+al);
         //removing element specific position
         System.out.println("Removing Index 0 from Collection: "+al.remove(0));
         System.out.println("After removing(Index) method: "+al);
         System.out.println("*********************");
         ArrayList<String> al2= new ArrayList<String>();
         al2.add("Shastri");
         al2.add("Hemant");
         al.addAll(al2);
         System.out.println("Updated List: "+al);
         al.removeAll(al2);
         System.out.println("After invoking removeAll() Methpd: "+al);
                             //OR
         al.removeIf(str -> str.contains("Ajay"));
         System.out.println("After invoking removeIf() method: "+al);
          //remove all the elements involve in the list
         al.clear();
         System.out.println("After invoking clear() method: "+al);
         }

}
