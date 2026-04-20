package coll_p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/*
사전적 의미 
개발론적 의미
Network
InterNet
http/html/FTP
OSI7 Layer
IP/ARP
TCP/UDP

동기식/비동기식
프로그램
프로세스
프로그래스
프로시저
프로시드

 * */


public class SetMain {

	public static void main(String[] args) {

		Object [] data = {11,22,33,66,11,33,22,"11",97,'a',22};
		/*
		 List (배열과유사) : 순서(배열원소) , 원소 중복가능
		 ArrayList, LinkedList, Vector, Stack, Queue
		 
		 Set (집합과 유사) : 순서없음, 원소 중복불가
		 HashSet, LinkedHashSet, TreeSet
		 * */
		
		ArrayList arr = new ArrayList();
		HashSet ss1 = new HashSet();
		
		for (Object oo : data) {
			arr.add(oo);
			ss1.add(oo);
		}
		
		// Set 생성시 List, Set 매개변수로 받아 처리
		HashSet ss2 = new HashSet(arr);
		HashSet ss3 = new HashSet(ss1);
		HashSet ss4 = ss1;	//shallow copy
		HashSet ss5 = (HashSet)ss1.clone();	//deep copy
		
		// List 생성시 List, Set 매개변수로 받아 처리
		ArrayList arr2 = new ArrayList(ss1);
		
		System.out.println("arr:"+arr);
		System.out.println("arr2:"+arr2);
		System.out.println("ss1:"+ss1);
		System.out.println("ss2:"+ss2);
		System.out.println("ss3:"+ss3);
		System.out.println("ss4:"+ss4);
		System.out.println("ss5:"+ss5);
		
		System.out.println("변경후");
		ss1.add(300);
		arr2.add(500);
		System.out.println("arr:"+arr);
		System.out.println("arr2:"+arr2);
		System.out.println("ss1:"+ss1);
		System.out.println("ss2:"+ss2);
		System.out.println("ss3:"+ss3);
		System.out.println("ss4:"+ss4);
		System.out.println("ss5:"+ss5);
		
		//System.out.println(ss1.get(0));  원소번호로 원소 호출 불가
		//ss1.set(0,700);	원소번호를 이용한 원소 대입 불가
		//ss1.add(3, 900); 원소 중간 삽입 불가
		
		// 순서 검색 불가
		//ss1.indexOf(100);
		//ss1.lastIndexOf(100);
		// 일부 추출 불가
		//ss1.subSet(2,5);
		
		// 열거데이터 추출 방식 가능
		for (Object obj : ss1) {
			System.out.println(obj);
		}
		System.out.println("------------");
		Iterator it = ss1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		boolean bb = ss1.remove(33);  //원소를 삭제
		System.out.println("ss1:"+ss1);
		System.out.println("bb : "+bb);
		
		HashSet ss6 = new HashSet();
		ss6.add(11);
		ss6.add(22);
		ss6.add(33);
		ss6.add(44);
		ss6.add(55);
		ss6.add(66);
		ss1.removeAll(ss6);
		System.out.println("removeAll:"+ss1);
		
		HashSet ss7 = new HashSet();
		ss7.add(50);
		ss7.add(60);
		ss7.add(70);
		ss7.add(80);
		ss1.addAll(ss7);
		System.out.println("addAll:"+ss1);
		
		HashSet ss8 = new HashSet();
		ss8.add(40);
		ss8.add(50);
		ss8.add(60);
		ss8.add(30);
		
		ss1.retainAll(ss8);
		System.out.println("retainAll:"+ss1);
		System.out.println("size():"+ss1.size());
		System.out.println("isEmpty():"+ss1.isEmpty());
		
		System.out.println("contains(50):"+ss1.contains(50));
		System.out.println("contains(100):"+ss1.contains(100));
		
		HashSet ss9 = (HashSet)ss1.clone();
		System.out.println("containsAll(ss9):"+ss1.containsAll(ss9));
		ss9.add(123);
		ss9.add(456);
		System.out.println("containsAll(ss9):"+ss1.containsAll(ss9));
		ss1.add(123);
		ss1.add(456);
		ss1.add(789);
		System.out.println("containsAll(ss9):"+ss1.containsAll(ss9));
		
		
	}

}
