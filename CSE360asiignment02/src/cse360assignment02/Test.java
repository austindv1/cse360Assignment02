package cse360assignment02;

public class Test {

	public static void main(String[] args) {
		AddingMachine test = new AddingMachine();
		
		System.out.println("Total:" + test.getTotal());
		
		test.add(5);
		test.add(2);
		 
		test.subtract(3);
		test.subtract(1);
		
		System.out.println("Total: " + test.getTotal());
		
		System.out.println("History: " + test.toString());
		
		test.clear();
		
		System.out.println("Total: " + test.getTotal());
		System.out.println("History: " + test.toString());
	}

}
