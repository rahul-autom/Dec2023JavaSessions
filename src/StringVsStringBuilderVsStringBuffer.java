
public class StringVsStringBuilderVsStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//immutable
		String tr="Hello";
		tr.concat("selenium");
		tr.concat("testing");
		System.out.println(tr);
		
		//mutable
		StringBuilder sb=new StringBuilder("Hello");
		sb.append("selenium");
		sb.append("testing");
		System.out.println(sb);
		
	}

}
