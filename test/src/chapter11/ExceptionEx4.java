package chapter11;

public class ExceptionEx4 {

	public static void main(String[] args) {
		try {
			int[] arr = {1, 2, 3};
			System.out.println(arr[3]);
			System.out.println(3/0);
			Integer.parseInt("a");
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위 초과");
		} catch(Exception e) {
			System.out.println("예외 발생");
		}
	}

}
