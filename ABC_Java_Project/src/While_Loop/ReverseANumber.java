package While_Loop;

public class ReverseANumber {

	public static void main(String[] args) {
		int i=243, rev=0;
				System.out.println("the no. is: "+i);
		while (i>0)
		{ 
			rev=(rev*10)+i%10;
			i=i/10;
			{
				System.out.println("reverse no.is: "+rev);
			}
		}
	}
}
		 // rev=(rev*10)+num%10
         //num=num/10


               // int num=123,rev=0,rem=0;
          // while(num!=0) {
		//rem=num%10;//123%10=3 ---> 12%10=2  ----> 1%10=1
        	//rev=rev*10+rem;//10*0+3=3 --->3*10+2=32 ---->32*10+1=321
        	//num=num/10;//123/10=12 ---->12/10=1  -->1/10=0
 //}
  // {
  // System.out.println("Reverse Number: "+rev);
  // }
	//}
//}
