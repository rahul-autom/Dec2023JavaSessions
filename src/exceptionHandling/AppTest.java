package exceptionHandling;

public class AppTest {
	public static void main(String args[]) {
		String browser="ie";
		if(browser.equals("chrome")) {
			System.out.println("open chrome ");
		}
		else if(browser.equals("firefox")) {
			System.out.println("Open FF");
		}
		else if(browser.equals("safari")) {
			System.out.println("open safari");
		}
		else {
			System.out.println("Please pass the right browser...");
			throw new MyException("WRONGBROWSEREXCEPTION");
		}
		System.out.println("Launch URL");
	}
}
