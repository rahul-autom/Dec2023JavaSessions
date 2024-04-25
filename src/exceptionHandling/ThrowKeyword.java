package exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String data=null;
		try {
		if(data==null) {
			throw new Exception("DATANOTFOUND");
		}
	}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}
