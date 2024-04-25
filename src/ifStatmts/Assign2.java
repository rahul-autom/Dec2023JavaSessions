package ifStatmts;

public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 97, b=25, c=78, d=87;
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println(a+" is the highest number");
				}
				else
					System.out.println(d+" is the highest number");
					
			}
			else
			if(c>d)
			{
				System.out.println(c+" is the highest number");
			}
			
		}
		else if(b>c)
		{
			if(b>d)
			{
				System.out.println(b+" is the highest number");
			}
			else
				System.out.println(d+" is the highest number");
		}
		
		else if(c>d)
		{
			
			System.out.println(c+" is the highest number");
		}
		else
			System.out.println(d+" is the greatest number");

}
}