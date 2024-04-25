package oopEncapsulation;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//e1.dob="01-01-1990";
		System.out.println("--------");
		//POST - REG FORM		
		Employee e1=new Employee("Gurav", 20, 1000, true);
		
		//GET --get the user info
		System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.getSalary()+" "+e1.isActive());
		
		//PUT -- Update the info		
		e1.setAge(30);
		e1.setSalary(3000);
		
		//GET -- GET THE USER INFO
				
		System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.getSalary()+" "+e1.isActive());
		
		Employee e2=new Employee("Shiva", 30);
		System.out.println(e2.getName() +""+e2.getAge()+" "+e2.getSalary()+""+e2.isActive());
		e2.setSalary(5000);
		e2.setActive(true);
		System.out.println(e2.getName()+""+e2.getAge()+""+e2.getSalary()+""+e2.isActive());
		
	
	}

}
