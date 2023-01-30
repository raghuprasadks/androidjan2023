package javabasics;

public class Functions_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition(100,200);
		int result = multiplication(4,12);
		System.out.println("Result of multiplication "+result);
	}
	
	public static void addition(int n1,int n2) {
		
		System.out.println("Addition " +(n1+n2));
	}
	
	public static int multiplication(int n1,int n2) {
		return n1+n2;
	}
}
