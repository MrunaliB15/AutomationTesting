package ScannarAndSystemClass;

class Test{
	Test(){
		System.out.println("Test class");	
	}
	void MannualTest() {
		System.out.println("mannual test from Test class");
	}
	void AutomationTest() {
		System.out.println("Automation test from test class");
	}
}
public class SystemEx3 {
    static Test t1=new Test();
	public static void main(String[] args) {
		Test t2=new Test();
		t2.MannualTest();
		t2.AutomationTest();
		//Accessing static member
		SystemEx3.t1.MannualTest();
		SystemEx3.t1.AutomationTest();
		System.out.println("i am Varun..");
		System.out.println("staying in Nashik");
	}

}
