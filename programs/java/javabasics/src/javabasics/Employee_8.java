package javabasics;

public class Employee_8 {
	// properties
	int code;
	String name;
	String dept;
	int salary;

	public static void main(String[] args) {
		Employee_8 emp1 = new Employee_8();
		emp1.code = 3;
		emp1.name="Ramesh";
		emp1.dept="CSE";
		emp1.salary=12233;
		String info=emp1.info();		
		System.out.println("emp1 information: " +info);		
		
		Employee_8 emp2 = new Employee_8(1,"Ravi","ISE",39393);
		String information  = emp2.info();
		System.out.println("emp2 information: " +information);

		Employee_8 emp3 = new Employee_8(2,"Ramya","ISE",39393);
		information  = emp3.info();
		System.out.println("emp3 information: " +information);		
	}
	//default constructor
	public Employee_8() {
		
	}
	// Constructor
	public Employee_8(int code,String name,String dept,int salary) {
		this.code = code;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	// method
	public String info() {
		return "Code "+this.code + "Name "+this.name +" Dept "+this.dept;
	}

}
