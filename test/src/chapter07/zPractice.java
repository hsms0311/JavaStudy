package chapter07;

public class zPractice {}

//	01. 다음 중 클래스의 구성 맴버가 아닌 것은?
//	1. 필드
//	2. 생성자
//	3. 로컬 변수
//	4. 메서드
//
//	정답 : 3
//	로컬 변수는 클래스의 멤버가 아니며, 메서드나 블록 내에서만 사용됨.


//	02. 객체에 대한 설명으로 올바르지 않은 것은?
//	1. 클래스를 new 연산자로 생성한다.
//	2. 클래스는 객체를 생성하기 위한 설계도이다.
//	3. 생성자를 통해 객체를 생성한다.
//	4. 하나의 클래스는 하나의 객체만 생성 가능하다.
//
//	정답 : 4
//	클래스는 여러 객체를 생성할 수 있음.


//	03. 다음 표에 나와있는 필드를 갖는 Person 클래스를 작성하시오.
//	--------------------------------
//	|  자료형  |  필드명  |  설명  |
//	--------------------------------
//	|  String  |   name   |  이름  |
//	|  String  |  gender  |  성별  |
//	|   int    |   age    |  나이  |
//	|   int    |  height  |   키   |
//	|   int    |  weight  | 몸무게 |
//	--------------------------------
//
//	정답 :
//	class Person {
//		String name;
//		String gender;
//		int age;
//		int height;
//		int weight;
//	}


//	04. 생성자에 대한 설명으로 올바르지 않은 것은?
//	1. 클래스에는 생성자가 반드시 하나 이상 포함 된다.
//	2. 생성자는 오버로딩할 수 없다.
//	3. 모든 생성자는 클래스와 이름이 동일하다.
//	4. 생성자를 정의하지 않으면 컴파일러가 자동으로
//	   기본 생성자를 추가한다.
//
//	정답 : 2
//	생성자는 오버로딩이 가능.


//	05. 메서드에 대한 설명으로 올바르지 않은 것은?
//	1. 클래스 내에 특정 기능을 수행하는 역할을 한다.
//	2. 리턴값은 있을 수도 있고, 없을 수도 있다.
//	3. 매개변수는 있을 수도 있고, 없을 수도 있다.
//	4. 리턴값이 없는 메서드는 리턴타입을 명시하지 않는다.
//
//	정답 : 4
//	리턴값이 없는 메서드는 반환 타입을 void 로 명시, 
//	리턴 타입을 생략할 수 없음.


//	06. 메서드 오버로딩이 무엇인지 서술하시오.
//
//	정답 : 같은 이름의 메서드를 여러 개 정의하는 것. 
//	메서드의 매개변수 목록이 달라야 함. 즉, 메서드 이름은 동일하지만,
//	매개변수의 개수나 타입이 다를 때 메서드를 오버로딩할 수 있음.


//	07. 다음 코드에서 가장 나중에 실행이 종료되는 메서드는?
//	System.out.println(getTotal(getScore()));
//
//	정답 : System.out.println()


//	08. 다음 예제의 실행 결과를 작성하시오.
//
//	public static void main(String[] args) {
//		String number = "123";
//		System.out.println("출력값 : " + add(number));
//	}
//
//	public static String add(String number) {
//		return number + "456";
//	}
//
//	정답 : 출력값 : 123456


//	09. Excercise 클래스를 싱글톤으로 정의하려고 한다.
//	아래 주어진 코드에 Excercise 의 getInstance() 메서드를
//	호출하면 싱글톤으로 객체가 리턴되도록 코드를 완성하시오.
//
//	public static void main(String[] args) {
//		Excercise ex1 = new Excercise.getInstance();
//		Excercise ex2 = new Excercise.getInstance();
//		
//		System.out.println("ex1 == ex2 : " + (ex1 == ex2));
//	}
//	
//	class Excercise {
//		// 코드 작성
//	}
//
//	정답 :
//	private static Excercise instance = new Excercise();
//	public static Excercise getInstance() {
//		return instance;
//	}
//	private Excercise() {
//
//	}


//	10. 클래스 내부에서 자신의 주소를 참조하는 예약어는 ____이다.
//
//	정답 : this
//	this 는 클래스 내부에서 현재 객체를 참조할 때 사용하는 예약어.


//	11. 다음과 같이 정의된 클래스를 작성하고, 객체를 생성해
//	메서드를 호출하시오.
//	클래스명 : Math
//	메서드명 : max
//		기능 : 매개변수로 입력 받은 배열 값 중 최대값을 리턴
//		매개변수 : 정수타입 배열
//		리턴값 : 정수
//	메서드면 : min
//		기능 : 매개변수로 입력 받은 배열 값 중 최소값을 리턴
//		매개변수 : 정수타입 배열
//		리턴값 : 정수
//
//	public static void main(String[] args) {
//		int[] arr = {9, 5, 24, 13, 3, 21};
//		
//		Math m = new Math();
//		int max = m.max(arr);
//		int min = m.min(arr);
//		
//		System.out.println("최대값 : " + max);
//		System.out.println("최소값 : " + min);
//	}
//	
//	class Math {
//		// 코드 작성
//	}
//	[실행 결과]
//	최대값 : 24
//	최소값 : 3
//
//	정답 : 
//	public int max(int[] max) {
//		int temp = 0;
//		for (int i=0; i<arr.length; i++) {
//			if (arr[i]>temp) {
//				temp = arr[i];
//			}
//		}
//		return temp;
//	}
//	
//	public int min(int[] min) {
//		int temp = arr[0];
//		for (int i=0; i<arr.length; i++) {
//			if (arr[i]<temp) {
//				temp = arr[i];
//			}
//		}
//		return temp;
//	}


//	12. 접근 제하자에 대한 설명으로 올바르지 않은 것은?
//	1. private 은 같은 패키지 내에서 접근할 수 있다.
//	2. public 은 어디서나 접근할 수 있는 접근 제한자이다.
//	3. 접근 제한자는 클래스나 필드, 생성자, 메서드에
//	   지정할 수 있다.
//	4. 프로그램 실행시 시작점인 main 메서드는 반드시
//	   public 으로 선언해야 한다.
//
//	정답 : 1
//	private 는 같은 패키지 내가 아닌, 같은 클래스 내에서만 접근 가능.