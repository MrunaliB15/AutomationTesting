package ExceptionHandling;

public class ExceptionHandling11 {

	public static void main(String[] args) throws InterruptedException, UserDefineException
		{ 
			System.out.println("program start..");
			setSleep(2000);
			checkNumber(-5);
			System.out.println("hello");
		}
		static void setSleep(long time) throws InterruptedException{
			 Thread.sleep(time);
		}
		static void checkNumber(int num) throws UserDefineException{
			if(num<0) {
				throw new UserDefineException("no. is less than zero ");
			}
			else {
				System.out.println("Number is: "+num);
			}
		}
		

	}


