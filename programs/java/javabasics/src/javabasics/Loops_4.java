package javabasics;

public class Loops_4 {

	public static void main(String[] args) {
	/**
	 * Print 5's table 5,10...50
	 */
		System.out.println("Print 5 table using while loop");
		int start = 5;
		int end = 50;
		while (start <=end) {
			System.out.println(start);
			start = start +5;
			// start += 5;
		}
		System.out.println("Print 10 table using for loop");
		
		for (int i=10; i <=100;i=i+10) {
			System.out.println(i);
		}
	}

}
