package chapter13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorEx {

	public static void main(String[] args) {
		// Iterator 객체 선언
		Iterator it = null;
		
		// List 객체와 Set 객체 생성
		List list = new ArrayList();
		Set set = new HashSet();
		
		// list 와 set 에 5개의 값 추가
		for (int i=0; i<=5; i++) {
			list.add(i);
			set.add(i+5);
		}
		
		System.out.println(list);
		System.out.println(set);
		
		// list 에서 Iterator 객체로 생성
		it = list.iterator();
		
		// list 의 Iterator 객체 출력
		System.out.println("List Iterator 출력");
		iteratorPrint(it);
		
		// set 에서 Iterator 객체로 생성
		it = set.iterator();
		
		// set 의 Iterator 객체 추력
		System.out.println("set Iterator 출력");
		iteratorPrint(it);
		
		System.out.println(list);
		System.out.println(set);
	}
	
	private static void iteratorPrint(Iterator it) {
		// Iterator 객체 반복 (다음 요소가 있으면 반복)
		while (it.hasNext()) {
			// Iterator 객체의 다음 요소 읽어와 출력
			System.out.println(it.next());
			// 현재 요소 삭제
			it.remove();
		}
	}

}
