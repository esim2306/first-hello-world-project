package practice;

public class Calculator {
	
	public static void main(String[] args) {
		
		addition(2, 2);
		subt(2, 2);
		division(2, 2);
		multiplication(2 ,2);
		
	
	}
	public static void addition(int a, int b) {
		int z = a + b;
		System.out.println(z);
	} 
	public static void subt(int a, int b) {
		int z = a - b;
		System.out.println(z);
	}
	public static void division(int a, int b) {
		int z = a / b;
		System.out.println(z);
	}
	public static void multiplication(int a, int b) {
		int z = a * b;
		System.out.println(z);
	}

}
