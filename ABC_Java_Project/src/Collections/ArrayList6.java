package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ArrayList6 {

	public static void main(String[] args) {
		ArrayList<Integer> l2=new ArrayList<Integer>();   //Generic
        l2.add(10);
        l2.add(12);
        l2.add(8);
        l2.add(15);
        l2.add(18);
        System.out.println("size: "+l2.size());
        System.out.println(" element of collection : "+l2);
        Collections.sort(l2);
        System.out.println("After sorting element of collection: "+l2);
        Collections.reverse(l2);
        System.out.println("Reverse sorting element of collection: "+l2);
	}

}
