package coll_p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorMain {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		for (int i : new int[] {11,22,33,44,55,66,77}) {
			arr.add(i);
		}
		
		System.out.println("arr : "+arr);
		
		System.out.println("for------");
		for (Object obj : arr) {
			System.out.println(obj);
		}
		System.out.println("for 끝------");
		Iterator it = arr.iterator(); 
		//enumeration 형태의 객체 (enum 과 같은 열거데이터 객체)
		
		Object oo = it.next();  // 열거데이터 1개씩 가져오기
		System.out.println(oo);
		oo = it.next();  // 열거데이터 1개씩 가져오기
		System.out.println(oo);
		System.out.println(it.hasNext());
		System.out.println("arr : "+arr);
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("------");
		System.out.println(it.hasNext());
		
		System.out.println("for------");
		for (Object obj : arr) {
			System.out.println(obj);
			if(obj.equals(33)) {
				//arr.remove(obj); //에러발생
			}
		}
		System.out.println("arr : "+arr);
		
		it = arr.iterator();
		//it.previous();
		//it.hasPrevious();
		while(it.hasNext()) {
			oo = it.next();
			System.out.println(oo);
			if(oo.equals(33)) {
				//arr.remove(oo); //에러발생
				it.remove();	//원본 원소 삭제
			}
		}
		System.out.println("arr : "+arr);
		
		ListIterator lit = arr.listIterator();
		System.out.println("------"); 
		while(lit.hasPrevious()) {//it.next()된 순서없이 후진 불가
			System.out.println(lit.previous());
		}
		System.out.println("------");
		
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("------");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		System.out.println("------");
	}

}
