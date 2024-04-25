package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		try {
			int i=9/0;
			System.out.println("selenium");
		} 
//		catch(ArithmeticException e) {
//			System.out.println("some exception is coming....");
//			
//		}
		finally {
			System.out.println("i am in finally block");
		}
		
		
	}

}
