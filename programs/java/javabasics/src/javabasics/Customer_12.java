package javabasics;

public class Customer_12 {
	/**
	public String name;
	public String location;
	**/
	private String name;
	private String location;
	//default
	int zipcode;
	
	public void info() {
		System.out.println("Name :: "+name + " Location "+location);
	}
	
	public static void main(String args[]) {
		Customer_12 cust = new Customer_12();
		cust.name = "Suresh";
		cust.location = "Mysuru";
		cust.info();
	}

}
