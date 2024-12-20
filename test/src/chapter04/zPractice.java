package chapter04;

public class zPractice {}

//	01. 다음 연산자들의 의미를 설명하시오.
//	a) += : 더하기 결과 대입.
//	b) -= : 빼기 결과 대입.
//	c) %= : 나머지 결과 대입.


//	02. 다음 코드의 실행 결과를 작성하시오.
//
//	public static void main(String[] args) {
//		int var = 7 - 1 * 20 / 5;
//		
//		System.out.println(var)
//	}
//
//	정답 : ((-1 * 20) / 5) + 7 = 3


//	03. 한 반에 27명인 학급이 있다. 미술 수업을 위해 색연필을 5다스를 받았다면,
//	각 학생에게 나누어 줄 수 있는 색연필 수와 나눠주고 남은 색연필 수를 출력하는
//	프로그램을 작성하고자 한다. 아래 코드에서 빈 칸에 들어갈 내용을 작성하시오.
//	
//	public static void main(String[] args) {
//		int colorPen = 5 * ___ [1] ___ ;
//		int studentCount = 27;
//
//		int divColorPen = ___ [2] ___ ;
//		System.out.println("학생당 나눠가지는 색연필 수 : " + divColorPen);
//
//		int remainColorPen = ___ [3] ___ ;
//		System.out.println("똑같이 나눠가지고 남은 색연필 수 : " + remainColorPen);
//	}
//
//	정답 : [1] - 12(색연필 한 다스 = 12자루)
//		   [2] - colorPen / studentCount = 60 / 27 = 2.22...
//		   [3] - colorPen % studentCount = 60 % 27 = 6
//	나눠가지는 색연필 수 : 2개, 남은 색연필 수 : 6개


//	04. 아이와 함께 놀이동산에 놀러가서 롤러코스터를 타려고 하는데,
//	안내 문구가 아래와 같이 적혀 있다.
//	1) 6세 이상 탑승 가능.(단, 키가 120cm 이상이면 보호자 동반하에 탑승 가능)
//	2) 키 120cm 이상 탑승 가능.
//	3) 심장관련 질환자 탑승 불가.
//	나이변수는 age, 키는 height, 보호자 동반여부는 parent, 심장질환여부는
//	heartDease 라고 지정하고 조건식을 작성하시오.
//
//	정답 : ((age >= 6 && height >= 120) || (height >= 120 && parent == true)) && heartDease == false


//	05. 다음 코드는 입력된 연도가 윤년인지 아니지 판단하는 코드이다.
//	빈칸에 들어갈 조건식을 작성하시오.
//	[윤년조건]
//	1. 연도를 4로 나누어 떨어지면 윤년.
//	2. 100으로 나누어 떨어지는 연도는 윤년이 아님.
//	3. 400으로 나누어 떨어지면 윤년.
//
//	public static void main(String[] args) {	
//		int year = 2020;
//		boolean leapYear = __________;
//		// 윤년이면 true, 윤년이 아니면 false.
//		System.out.println(leapYear);
//	}
//
// 정답 : (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)


// 	06. 가게에서 물건을 구매하고 금액을 지불하려고 한다. 지불해야할 금액이
//	187,000원인데, 5만원권과 1만원권, 5천원권, 1천원권 지폐를 가장 적은
//	지폐수량으로 지불하는 코드를 작성하시오.
//
//	public static void main(String[] args) {
//		int price = 187000;
//		int oman = ___; - 1
//		int ilman = ___; - 2
//		int ochun = ___; - 3
//		int ilchun = ___; - 4
//		System.out.println("5만원권 : " + oman + "장");
//		System.out.println("1만원권 : " + ilman + "장");
//		System.out.println("5천원권 : " + ochun + "장");
//		System.out.println("1천원권 : " + ilchun + "장");
//	}
//	[실행 결과]
//	5만원권 : 3장
//	1만원권 : 3장
//	5천원권 : 1장
//	1천원권 : 2장
//
//	정답 : 1 - price / 50000; , 2 - price % 50000 / 10000;
//		3 - price % 10000 / 5000; , 4 - price % 5000 / 1000;


// 	07. 아래 코드에서 정수 타입 변수 number 에서 십의 자리 이하를
//	버리는 코드를 작성하려고 한다. 빈 칸에 들어갈 코드를 작성하시오.
//	예) 1234 -> 1200, 123 -> 100
//
//	public static void main(String[] args) {
//		int number = 1234;
//		int result = ___;
//		System.out.println(result);
//	}
//
//	정답 : number / 100 * 100; or number - number % 100;