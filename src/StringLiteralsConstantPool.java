
public class StringLiteralsConstantPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tr="Hello";//immutable-cannot be changed
		tr=tr.concat("selenium");
		System.out.println(tr);
		
		int i=10;//mutable
		i=i+20;
		System.out.println(i);
		
		String s1="Hello";
		String s2="Hello";
		String s3=new String("world");//1-heap, 1-scp
		String s4="world";//scp
		String s5="Hello";
		
		String s6=new String("selenium");//1-heap, 1-scp
		String s7="selenium";
		String s8=new String("selenium");// 1 heap
		
		System.out.println(s1==s2);//scp==scp--true
		System.out.println(s4==s3);//scp==heap --false
		System.out.println(s6==s8);//heap==heap -- false
		System.out.println(s6.equals(s8));//true-- it compares values
		System.out.println(s4.equals(s3));//true-- it compares values
		//
		String obj=new String("testing");//1-heap, 1-scp=2
		String ob=new String("testing");//1-heap, scp=0
		System.out.println(obj==ob);
		System.out.println(obj.equals(ob));//true
		String o="Testing";
		System.out.println(obj==o);
		
	}

}
