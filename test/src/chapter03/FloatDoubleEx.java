package chapter03;

public class FloatDoubleEx {

	public static void main(String[] args) {
		float f = 3.14159f;
		double d = 3.14159d;

		System.out.println("float : " + f);
		System.out.println("double : " + d);

		// Java 에서 실수는 기본적으로 double 로 인식함.
//		float f2 = 3.14159; // 따라서 f 는 생략 불가.
		double d2 = 3.14159;
		System.out.println("double : " + d2);
	}

}
