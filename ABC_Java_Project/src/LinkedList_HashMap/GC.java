package LinkedList_HashMap;

public class GC {

	public static void main(String[] args) {
		GC g1= new GC();
		System.out.println("Object representation of GC: "+g1);
		System.out.println("Address of GC: "+g1.hashCode());
		g1=null;
		System.gc();
	}
	@Override
	protected void finalize() {
	System.out.println("its finalized method..");
	}

}
