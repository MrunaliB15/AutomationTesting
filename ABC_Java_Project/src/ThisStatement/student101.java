package ThisStatement;

public class student101 {
        int rollno1;
		float fee;
		student101(int rollno1)
		{
		this.rollno1=rollno1;
		}
	     student101(int rollno,float fee){
			this(rollno);
			this.fee=fee;
		}
		void display()
		{
			System.out.println(rollno1+" "+fee);
		}
	 class ThisStatement1 {
		 public void main(String args[]) {
			System.out.println("******Creating s1 object******");
			student101 s1=new student101(111);
			System.out.println(s1.rollno1+" "+s1.fee);
			System.out.println("******Creating s2 object******");
			student101 s2=new student101(112,6000f);
			System.out.println(s2.rollno1+" "+s2.fee);
			System.out.println("******display******");
			s1.display();
			s2.display();
		}
	}
}
	
			
		
		
	
		
		

	