package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList7 {

	public static void main(String[] args) {
		ArrayList list1= new ArrayList();
		      //Or
		ArrayList ls1=new ArrayList();
		ls1.add("java");
		ls1.add(new ArrayList7());
		ls1.add(25);
		System.out.println("list of member: "+ls1);
          
		ls1.add("pune");
		System.out.println("updated list: "+ls1);
		System.out.println("1st index element is: "+ls1.get(1));
		System.out.println("list of member: "+ls1);
		
		for(int i=0; i<ls1.size(); i++) {
			System.out.println("list of element "+i+":"+ls1.get(i));
		}
		System.out.println("******using for each loop*********");
		for(Object obj: ls1) {
			System.out.println(obj);
		}
	}

}
