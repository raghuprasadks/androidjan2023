package javabasics;

public class MethodOverload_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverload_10 movld = new MethodOverload_10();
		int result = movld.add(100, 200);
		System.out.println("Result "+result);

	}
	
	public int add(int n1,int n2) {
		return n1+n2;
	}
	
	public double add(double n1,double n2) {
		return n1-n2;
	}
	
	

}
