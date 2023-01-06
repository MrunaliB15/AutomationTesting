package ThisKeyword;

public class ThisKeyword2 
{
	    int a;
       int b;
       ThisKeyword2(int a , int b) 
	
       { 
    	   this.a = a;
    	   this.b = b;
       }
       void display()
       {
    	   System.out.println("a= " + a + "\tb= "+ b);
       }
       public static void main(String[] args) {
    	   ThisKeyword2 object= new ThisKeyword2(34,40);
    	   object.display();
    	   System.out.println(object.a+" "+object.b );
    	   ThisKeyword2 object2= new ThisKeyword2(342,213);
		   object2.display();
    	   System.out.println(object2.a+" "+object2.b);
       }

}	   
    	   
       
    	   
       
       

