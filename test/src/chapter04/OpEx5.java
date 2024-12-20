package chapter04;

public class OpEx5 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;

		// AND
		System.out.println(a > b && a == 10); // T
		System.out.println(a > b && a == b); // F

		// OR
		System.out.println(a > b || a == b); // T
		System.out.println(a < b || a == b); // F

		// XOR
		System.out.println(a > b ^ a == 10); // F
		System.out.println(a > b ^ a == b); // T

		// NOT
		System.out.println(!(a > b)); // F
		System.out.println(!(a < b)); // T
	}

}
