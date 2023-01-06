package String;

import java.util.Scanner;

public class StringEx3 {

	public static void main(String[] args) {
		String s1="BasicJava";
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(5));
		System.out.println(s1.charAt(7));
		
		for(int i=0; i<s1.length(); i++) {
		System.out.println("char at index: "+i+" "+s1.charAt(i));
		}
		System.out.println("*****************");
		String s2="Hii i am Janvi ";
		for(int i=0; i<s2.length(); i++) {
		System.out.println("char at index: "+i+" "+s2.charAt(i));
		}
           
		String name;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter name: ");
		name=scn.next();
		System.out.println("Name: "+name);
		
		String[] names =new String[3];
		for(int i=0; i<name.length(); i++) {
			System.out.println("Emp name: ");
			names[i]=scn.next();
			
			for(String n: names) {
			System.out.println(n);
			}
		}
	}
}
