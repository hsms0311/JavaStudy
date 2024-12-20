package chapter07;

public class VarEx {

	public static void main(String[] args) {
		// 클래스 변수 사용.
		System.out.println("Morning 제조사 : " + Morning.company);

		Morning m1 = new Morning();
		Morning m2 = new Morning();

		// 인스턴스 변수의 값 설정.
		m1.color = "레드";
		m2.color = "블루";

		// 인스턴스 변수 출력.
		System.out.println("m1 의 색상 : " + m1.color);
		System.out.println("m2 의 색상 : " + m2.color);

		// 클래스 변수를 인스턴스 객체로 출력.
		System.out.println("m1 의 제조사 : " + m1.company);
		System.out.println("m2 의 제조사 : " + m2.company);

		// 클래스 변수의 값 변경.
		m2.company = "샘숭";

		// 클래스 변수의 값 변경 후 클래스 변수와
		// 인스턴스 변수 출력.
		System.out.println("Morning 제조사 : " + Morning.company);
		System.out.println("m1 제조사 : " + m1.company);
		System.out.println("m2 제조사 : " + m2.company);
	}

}

class Morning {
	String color; // 인스턴스 변수.
	static String company = "기아"; // 클래스 변수.
}