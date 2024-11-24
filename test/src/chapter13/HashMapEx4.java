package chapter13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx4 {

	public static void main(String[] args) {
		// Map 객체 생성
		Map map = new HashMap();
		
		// 이름이 담긴 문자열 배열 생성
		String[] names = {"김기동", "이기동", "박기동", "유기동", "고기동"};
		// 숫자가 담긴 정수 배열 생성
		int[] nums = {1234, 5678, 1357, 2468, 3691};
		
		// Map 객체에 두 배열의 값들을 키와 밸류 쌍으로 저장
		for (int i=0; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		
		// Map 객체는 (키, 값) 쌍으로 이루어진 객체들의 모임
		// (키, 값) 쌍으로 조회하기
		Set entry = map.entrySet();
		for (Object o : entry) {
			Map.Entry m = (Map.Entry)o;
			System.out.println("key : " + m.getKey() + ", value : " + m.getValue());
		}
	}

}