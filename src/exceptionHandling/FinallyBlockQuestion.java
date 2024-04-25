package exceptionHandling;

public class FinallyBlockQuestion {
	public static int getMarks(String studentName) {
		System.out.println("getting marks for:"+studentName);
		if(studentName.equals("rahul")) {
			try {
			int i=9/3;
				return 80;	
		}
			catch(ArithmeticException e) {
				System.out.println("AE is coming....");
				return 70;
			}
			finally {
				System.out.println("finally block");
				return 60;
			}
			
		}else if(studentName.equals("om")) {
			return 95;
		}
		else if(studentName.equals("naveen"))
		{
			return 10;
		}
		else {
			System.out.println("please pass the right student name....");
			return -1;
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=getMarks("rahul");
		System.out.println(m);
	}

}
