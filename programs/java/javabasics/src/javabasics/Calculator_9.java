package javabasics;
public class Calculator_9 implements ICalculator{

	public static void main(String[] args) {
		ICalculator iCalculator = new Calculator_9();
		int result;
		result = iCalculator.add(100, 200);
		System.out.println("Addition "+result);
	}
	@Override
	public int add(int n1, int n2) {
		return n1+n2;
	}
	@Override
	public int subtract(int n1, int n2) {
		return n1-n2;
	}

}
