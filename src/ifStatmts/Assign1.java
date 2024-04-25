package ifStatmts;

public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100, b=102,c=87;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+" is the highest number ");
			}
			else
			{
				System.out.println(c+" is the highest number");
			}
		}
		else
			if(b>c)
			{
				System.out.println(b+" is the highest number");
			}
			else
			{
				System.out.println(c+" is the highest number");
			}
		
	}

}
