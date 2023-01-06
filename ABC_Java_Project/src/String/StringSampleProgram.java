package String;

public class StringSampleProgram {

	public static void main(String[] args) {
		String s1="CoreJavaBasic";
		System.out.println("SubString from Index 3: "+s1.substring(3));
		System.out.println("********************");
		//return the substring from i to j-1
		System.out.println("subString from index 2,5: "+s1.substring(2,5));
		System.out.println("subString from index 4,8: "+s1.substring(4,8));
		//concatenate string2 to end of string1
		System.out.println("***********************");
		String s2="Core";
		String s3="JavaBasic";
		System.out.println("first value of s2: "+s2);
		System.out.println("first value of s3: "+s3);
		System.out.println("Concatenate string: "+s2.concat(s3));
		System.out.println(" after concat value s2: "+s2);
		System.out.println(" after concat value s3: "+s3);
		System.out.println("*************************");
		String p1="Pune";
		String p2="Mumbai";
		
		String x1=s2.concat(s2);
		String x2=p1.concat(p2);
		String x3=p1+p2;
		String x4=x1.concat(x2);
		System.out.println("*********************");
		String s5="Learn Share Learn Share";
		System.out.println("s5 size: "+s5.length());
		System.out.println("Index of 'Share' start from: "+s5.indexOf("Share"));
		System.out.println("Index of a: "+s5.indexOf('e', 3));
		System.out.println("Index of e: "+s5.indexOf('e', 11));
		
		System.out.println("last index of 'Learn': "+s5.lastIndexOf("Learn",18));
		System.out.println("last index of e: "+s5.lastIndexOf('e', 11));
		System.out.println("************************");
		// checking equality
		String s6="Selenium";
		String s7="Selenium";
		String s8="Selenium";
		System.out.println("checking equality of s6 and s7: "+s6.equals(s7));
		System.out.println("checking equality of s6 and s8: "+s6.equals(s8));
		System.out.println("checking equality of s6 and s7 with ignore case: "+s6.equalsIgnoreCase(s7));
		System.out.println("**********************");
	   //converting lower and UPPER case
		String word1="CoreJava";
		System.out.println("converting lower case: "+word1.toLowerCase());
		System.out.println("converting UPPER case: "+word1.toUpperCase());
		System.out.println("************************");
		//trimming the
		String word3="   Learn Share Learn   ";
		System.out.println("Actual word: "+word3);
		System.out.println("Actual length: "+word3.length());
		System.out.println("After trim: "+word3.trim());
		System.out.println("length after trim: "+word3.trim().length());
		System.out.println("************************");
		//replacing
		String str="CoreJavaBasic";
		System.out.println("Original String: "+str);
		String str1=str.replace('a', 'x');
		System.out.println("replace a with x:  "+str1);
		
		String str2=str.replace("java", "Net");
		System.out.println("replace java with Net:  "+str2);
		
		String str3=str.replaceFirst("a","w");
		System.out.println("replace first a with w:  "+str3);
		
		String str4=" ";
		System.out.println("String is empty or not:  "+str4.isEmpty());
		String str5=new String();
		System.out.println("String is empty or not:  "+str5.isEmpty());
	}

}
