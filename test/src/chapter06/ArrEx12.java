package chapter06;

public class ArrEx12 {

	public static void main(String[] args) {
		int[] arrInt = {1, 2, 3, 4, 5};

		// 기존 for 문을 이용한 배열 값 출력
		for (int i=0; i<arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}

		System.out.println();

		// 향상된 for 문을 이용한 배열 값 출력
		for (int number : arrInt) {
			System.out.println(number);
		}
	}

}
