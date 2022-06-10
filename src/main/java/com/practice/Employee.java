package com.practice;

public class Employee {
	// variables/fileds
	private static String companyName;
	private int id; // 4 bytes
	private String name; // undefined

	public int getId() {
		return id;
	}

	public void setId(int idFromSetter) {
		this.id = idFromSetter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	static {
//		System.out.println("static block called");
//	}
//	
//	public static void methods() {
//		System.out.println("static method called");
//	}

	// default constructor
	public Employee() {
		System.out.println("constrctor called");
	}
	
	{
		this.name="krishna";
		this.id=100;
	}
	

	// parameterized constructor
	public Employee(int id, String name) {
		super();
		System.out.println("name is changed from " +this.name + " to "+name);
		System.out.println("id is changed from " +this.id + " to "+id);

		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {

//		Employee emp = new Employee();
//		System.out.println(emp.getId());
//		System.out.println(emp.getName());

		Employee e = new Employee(200,"Mahi");
		System.out.println(e.getId());
		System.out.println(e.getName());
		
		
//		
//		Employee e1 = new Employee(5222,"Mahi");
//		System.out.println(e1.getId());
//		System.out.println(e1.getName());

//		e.setId(2);
//		e.setName("krishna");
//		
//		System.out.println(e.getId());
//		System.out.println(e.getName());
//		
//		emp.methods();
	}

	

//static variables, static blocks, static methods, instance blocks, constructors 
}
