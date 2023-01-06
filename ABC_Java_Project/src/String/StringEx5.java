package String;

import java.util.Scanner;

public class StringEx5 {

	public static void main(String[] args) {
		String str= "Yavtmal";
        //print one by one char 
		for(int i=0; i<str.length();i++) {
		System.out.println(str.charAt(i));
		}
		System.out.println("**************");
		// print reverse
		for(int i=str.length()-1; i>=0; i--) {
		System.out.println(str.charAt(i));
		}
		System.out.println("******************");
		String temp="";
		for(int i=str.length()-1; i>=0; i--) {
		 temp=temp+str.charAt(i);
		}
		System.out.println("str: "+str);
		System.out.println("temp: "+temp);
		System.out.println(reverseString("Yavtmal"));
	
		String s1= "Bangalour";
		System.out.println(reverseString(s1));
		
		Scanner scn= new Scanner(System.in);
		String s2;
		System.out.println("Enter String to be reverse: ");
		s2=scn.next();
		System.out.println("reverse String is: "+reverseString(s2));
		
		//System.out.println(palinString(abcd));
		String s3;
		System.out.println("Enter String to check to palindrome: ");
		s3=scn.next();
		palinString(s3);
	}
	 
	static String reverseString(String str) {
	  String temp="";
	  for(int i=str.length()-1; i>=0; i--) {
		  temp=temp+str.charAt(i);;
	  }
	  return temp;
	 }
	  static void palinString(String str) {
	  String s1=str;
	  String temp="";
	  for(int i=str.length()-1; i>=0; i--) {
		  temp=temp+str.charAt(i);
	  }
	  if (temp.equals(s1)) {
		  System.out.println("given string is palindrome: "+str);
	  }
	  else {
		  System.out.println("given string is not palindrome: "+str);
	  }
	  }
}
