package coll_p;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetMain {

	public static void main(String[] args) {
		int [] data = {300,200,900,300,100,800,400,100,200,300};

		ArrayList arr = new ArrayList();
		HashSet hs = new HashSet();					//중복X, 순서없음
		LinkedHashSet ls = new LinkedHashSet();		//중복X, 추가순서
		TreeSet ts = new TreeSet();					//중복X, 오름차순정렬
		
		
		TreeSet ts1 = new TreeSet(new ArrCom());
		TreeSet ts2 = new TreeSet(new LinkCom());
		TreeSet ts3 = new TreeSet(new MyCom());
		
		for (int d : data) {
			arr.add(d);
			hs.add(d);
			ls.add(d);
			ts.add(d);
			
			ts1.add(d);
			ts2.add(d);
			ts3.add(d);
			System.out.println("---------");
		}
		
		System.out.println("arr:"+arr); 
		System.out.println("hs:"+hs);
		System.out.println("ls:"+ls);
		System.out.println("ts:"+ts);
		System.out.println("ts1:"+ts1);
		System.out.println("ts2:"+ts2);
		System.out.println("ts3:"+ts3);
	
	}
}

// Comparator : TreeSet, TreeMap 에서 정렬순서 설정하는 인터페이스
// compare() 메소드의 리턴값으로 위치지정
class ArrCom implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		//System.out.println(o1+","+o2);
		
		// 0 생략
		// 1 오른쪽(다음)
		// -1 왼쪽(이전)
		return -1;  //생략
	}	
}


class LinkCom implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		//System.out.println(o1+","+o2);
		int me = (int)o1;
		int you = (int)o2;
		if(me == you) { //같을 경우만 생략
			return 0;
		}
		return 1;
	}	
}

class MyCom implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		System.out.println(o1+","+o2);
		int me = (int)o1;
		int you = (int)o2;
		return you-me;
	}	
}


