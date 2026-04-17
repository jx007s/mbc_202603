package coll_p;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
	
	void add1(String title, List list) {
		long start = System.currentTimeMillis();  //현재시각 타임스탬프
		for (int i = 0; i <3000000; i++) {
			list.add("아기상어");  // 리스트 끝에 순차 추가
		}
		long time = System.currentTimeMillis()-start;
		System.out.println("순차 추가 "+title+" : "+time);
	}
	
	void add2(String title, List list) {
		long start = System.currentTimeMillis();  //현재시각 타임스탬프
		for (int i = 0; i <50000; i++) {
			list.add(100,"아기상어");  // 리스트 100 위치에 비순차 추가
		}
		long time = System.currentTimeMillis()-start;
		System.out.println("비순차 추가 "+title+" : "+time);
	}
	
	void remove2(String title, List list) {
		long start = System.currentTimeMillis();  //현재시각 타임스탬프
		for (int i = 0; i <50000; i++) {
			list.remove(100);  // 리스트 100 위치에 비순차 삭제
		}
		long time = System.currentTimeMillis()-start;
		System.out.println("비순차 삭제 "+title+" : "+time);
	}
	
	void remove1(String title, List list) {
		long start = System.currentTimeMillis();  //현재시각 타임스탬프
		for (int i = list.size()-1; i >=0; i--) {
			list.remove(i);  // 리스트 순차 삭제
		}
		long time = System.currentTimeMillis()-start;
		System.out.println("순차 삭제 "+title+" : "+time);
	}
	
	LinkedListMain() {
		//System.out.println("생성자 이지롱");
		ArrayList arr = new ArrayList();
		LinkedList link = new LinkedList();
		
		add1("arr",arr);
		add1("link",link);
		
		add2("arr",arr);
		add2("link",link);
		
		remove2("arr",arr);
		remove2("link",link);
		
		remove1("arr",arr);
		remove1("link",link);
	}

	public static void main(String[] args) {
		new LinkedListMain();  //자신의 생성자 호출

	}

}
