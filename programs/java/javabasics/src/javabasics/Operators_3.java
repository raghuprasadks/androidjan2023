package javabasics;

public class Operators_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Operators
		// Arithemetic operators - +,-,*,/,%.++,--
		// Relational operators - >,<,>=,<=,==,!=
		// Logic operators - &&,||,!
		
		int n1=100;
		int n2 = 50;
		int total = n1+n2;		
		System.out.println(n1 +" + "+n2+ " = "+total );	
		int n3=200;
		boolean isgreater = (n1>n2) && (n3>n2);		
		System.out.println("(n1>n2) && (n3>n2) "+isgreater);
	}
}
