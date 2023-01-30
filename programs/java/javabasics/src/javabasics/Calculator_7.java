package javabasics;
public class Calculator_7 {
	public static void main(String[] args) {
		// Object
		Calculator_7 calci1 = new Calculator_7();
		int result=0;
		result = calci1.add(100, 50);
		System.out.println("result of addition "+result);
		result = calci1.subtract(100, 50);
		System.out.println("result of subtraction "+result);
	}
	
	public int add(int n1,int n2) {
		return n1+n2;
	}
	
	public int subtract(int n1,int n2) {
		return n1-n2;
	}
}
