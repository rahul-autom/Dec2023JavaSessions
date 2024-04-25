package oopEncapsulation;

public class Employee {
	private String name;
	private int age;
	private double salary; 
	private boolean isActive;
	
	public Employee() {
		
	}
	
	
	//below constructor is behaving like setter. It's helping in initializing the window	
	//Giving the value while creating the object itself
	//setter
	public Employee(String name, int age, double salary, boolean isActive) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isActive = isActive;
		
	}
	//below constructor is behaving like setter. It's helping in initializing the window
	//below constructor is behaving like setter. It's helping in initializing the window
	//setter
	
	public Employee(String name, int age) {
		this.name=name;
		this.age=age;
	}
	

	
   //public getter/setter:
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
		
}
