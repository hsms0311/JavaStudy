package chapter04;

public class OpEx4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;

		System.out.println(a > b); // T
		System.out.println(a >= b); // T
		System.out.println(a < b); // F
		System.out.println(a <= b); // F
		System.out.println(a == b); // F
		System.out.println(a != b); // T

		boolean c = a == b;
		System.out.println("c = " + c);

		boolean d = a != b;
		System.out.println("d = " + d);
	}

}
