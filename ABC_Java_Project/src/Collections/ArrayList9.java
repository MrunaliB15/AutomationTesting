package Collections;

import java.util.ArrayList;
import java.util.List;
 class Book {
	int id;
	String name, author, publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id=101;
		this.name="Devid";
		this.author="P.K.Sharma";
		this.publisher="My Books";
		this.quantity=10;
	}
}
   public class ArrayList9{
	public static void main(String[] args) {
		List<Book> list = new ArrayList<Book>();//Generic
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications and Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(new Book(104, "Let us code it","xyz","pqr",8));
		System.out.println("List of book class element: "+list);
		System.out.println(list.get(0).name);
		System.out.println(b1.name);
		for(Book b: list) {
         System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}

}
