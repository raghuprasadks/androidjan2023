package javabasics;

public class TestInheritance_12 {

	public static void main(String[] args) {
		
		Parent_10 parent = new Parent_10();
		parent.name="Ravi";
		parent.age = 60;
		parent.address="Bengaluru";
		parent.Occupation();
		
		Child_11 child = new Child_11();
		child.name="Gagan";
		child.age = 20;
		child.address="Bengaluru";
		child.Occupation();
		}

}
