package chapter06;

public class zPractice {}

//	01. 다음 배열 선언 초기화 코드 중 잘못된 것을 고르시오.
//	1. int[] arr = {1, 2, 3};
//	2. int arr[3];
//	3. int[] arr = new int[3];
//	4. int arr[3] = new int[3];
//
//	정답 : 2, 4
//	2. 배열 선언 시 크기를 명시적으로 지정할 수 없음.
//		(C / C++ 에서 사용하는 배열 선언 방식)
//	4. 배열 선언과 동시에 대괄호 안에 크기를 지정하는 것을 허용하지 않음.


//	02. 다음 2차원 배열의 길이와 2번 인덱스의 길이를 작성하시오.
//
//	public static void main(String[] args) {
//		int[][] arr = {
//				{1},
//				{1, 2},
//				{1, 2, 3},
//				{1, 2, 3, 4}
//		};
//		System.out.println("arr의 길이 : " + arr.length);
//		System.out.println("arr2의 길이 : " + arr[2].length);
//	}
//
//	정답 : arr의 길이 : 4  /  arr2의 길이 : 3


//	03. 다음 배열에 담긴 점수들의 합계 정수와 평균점수를
//	출력하는 코드를 완성하시오.
//
//	public static void main(String[] args) {
//		int[] score = {90, 80, 60, 100};
//		
//		int totalScore = 0;
//		
//		double avgScore = 0;
//		
//		// 코드 작성.
//		
//		System.out.println("합계 점수 : " + totalScore);
//		System.out.println("평균 점수 : " + avgScore);
//	}
//
//	정답 : 
//	for (int i=0; i<score.length; i++) 
//	{
//		totalScore += score[i];
//	}
//	avgScore = (double)totalScore / score.length;


//	04. 하나의 배열엔 1부터 10까지 10개의 정수가 저장되어 있다.
//	각각의 값을 다른 배열의 해당 인덱스 값에 제곱값을 대입하는
//	코드를 완성하시오.
//	예) num1 = {1, 2, 3};
//		num2 = {1, 4, 9};
//
//	public static void main(String[] args) {
//		int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int[] num2 = new int[10];
//		
//		// 코드 작성.
//		
//		// num2 출력
//		for (int i=0; i<num2.length; i++) 
//		{
//			System.out.println(num2[i]);
//		}
//	}
//	[실행 결과]
//	1
//	4
//	9
//	16
//	25
//	36
//	49
//	64
//	81
//	100
//
//	정답 : 
//	for (int i=0; i<num1.length; i++) {
//		num2[i] += num1[i] * num1[i];
//	}