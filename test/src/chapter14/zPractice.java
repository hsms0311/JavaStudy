package chapter14;

public class zPractice {}

//	01. 제네릭에 대한 설명으로 올바르지 않은 것은?
//	1. 자동으로 현변환을 해준다.
//	2. 컴파일러가 타입 체크를 해준다.
//	3. 제네릭을 지정하면 해당 타입 파라미터로 재정의 된다.
//	4. T 는 타입을 의미한다.
//
//	정답 : 1
//	자동으로 현변환을 해주는게 아니고 내부적으로 재정의 되는
//	것이기 때문에 형변환이 필요 없음.


//	02. 아래 예제의 List 인터페이스와 ArrayList 클래스를 Member
//	타입으로 제네릭을 선언하고, 전체 회원을 출력하는 코드를 작성하시오.
//
//	import java.util.ArrayList;
//	import java.util.List;
//	
//	public class Ex {
//		
//		public static void main(String[] args) {
//			MemberEx m1 = new MemberEx("kim", "김기동", 20);
//			MemberEx m2 = new MemberEx("lee", "이기동", 30);
//			MemberEx m3 = new MemberEx("park", "박기동", 40);
//			
//			List<MemberEx> mamberList = new ArrayList<MemberEx>();
//			memberList.add(m1);
//			memberList.add(m2);
//			memberList.add(m3);
//			
//			// 전체 회원 출력
//			
//		}
//		
//	}
//
//	class MemberEx {
//		private String id;
//		private String name;
//		private int age;
//		
//		MemberEx(String id, String name, int age) {
//			this.id = id;
//			this.name = name;
//			this.age = age;
//		}
//		
//		public String getId() {
//			return id;
//		}
//		
//		public void setId(String id) {
//			this.id = id;
//		}
//		
//		public String getName() {
//			return name;
//		}
//		
//		public void setName(String name) {
//			this.name = name;
//		}
//		
//		public int getAge() {
//			return age;
//		}
//		
//		public void setAge(int age) {
//			this.age = age;
//		}
//	}
//	[실행 결과]
//	kim, 김기동, 20
//	lee, 이기동, 30
//	park, 박기동, 40
//
//	정답 :
//	for (int i=0; i<memberList.size(); i++) {
//		MemberEx m = MemberList.get(i);
//		System.out.println(m.getId() + ", " + m.getName() + ", " + m.getAge());
//	}