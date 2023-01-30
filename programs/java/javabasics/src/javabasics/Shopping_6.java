package javabasics;
public class Shopping_6 {
	public static void main(String[] args) {
		GenerateBill(10000);
	}
	
	public static void GenerateBill(int purchase_amt) {
		double discount_rate;
		double discount;
		double net_amount;
		
		if (purchase_amt <=10000) {
			discount_rate = .1;
		}else if (purchase_amt > 10000 && purchase_amt<=20000) {
			discount_rate = .2;
		}else {
			discount_rate = .3;
		}
		discount = purchase_amt*discount_rate;
		net_amount = purchase_amt-discount;
		System.out.println("Discount on this bill is "+discount);
		System.out.println("You have to pay "+net_amount);
	}
}
