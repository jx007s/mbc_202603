package coll_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		List arr1 = new ArrayList();
		System.out.println("arr1 : "+arr1);
		
		// List는 배열이 아님
		//List arr2  = {10,20,30,40,50};
		//ArrayList arr3  = {10,20,30,40,50};
		//ArrayList arr4  = new int[]{10,20,30,40,50};
		
		//List arr5 = new ArrayList(new int[]{10,20,30,40,50});
		System.out.println("add");
		arr1.add(10);
		arr1.add(20);
		arr1.add(new int[] {11,22,33,44});
		arr1.add(123.456);
		arr1.add(50);
		arr1.add(10);
		arr1.add(true);
		arr1.add(20);
		arr1.add("아기상어");
		System.out.println("add 끝에 추가 : "+arr1);
		System.out.println("get(0) : "+arr1.get(0));
		//System.out.println("arr1[0] : "+arr1[0]);
		System.out.println("get(1) : "+arr1.get(1));
		
		Object o2 = arr1.get(2);
		System.out.println("get(2) : "+o2);
		System.out.println("get(3) : "+arr1.get(3));
		System.out.println("get(4) : "+arr1.get(4));
		System.out.println("getFirst() : "+arr1.getFirst());
		System.out.println("getLast() : "+arr1.getLast());
		System.out.println("size() : "+arr1.size());
		System.out.println("for 시작--------------");
		for (int i = 0; i < arr1.size(); i++) { 
			System.out.println(arr1.get(i));
		}
		System.out.println("for 끝--------------");
		System.out.println("forEach 시작--------------");
		for (Object ob : arr1) {
			System.out.println(ob);
		}
		System.out.println("forEach 끝--------------");
		System.out.println("arr1 : "+arr1);
		System.out.println("add2");
		// 인덱스, 원소
		arr1.add(3,999);
		System.out.println("add 중간에 추가 : "+arr1);
		//arr1.add(20,888);  index 에러
		
		arr1.set(2, "점심엔뭐먹지?");		//원소대입
		System.out.println("set : "+arr1);
		
		boolean bb = arr1.remove(123.456);		//원소 삭제(Object) - 삭제성공유무
		System.out.println("remove(123.456) : "+arr1);
		System.out.println("bb : "+bb);
		bb = arr1.remove("정우성");		//원소 삭제(Object) - 삭제원소가 없으므로 false 리턴
		System.out.println("remove(\"정우성\") : "+arr1);
		System.out.println("bb : "+bb);	
		//arr1.remove(10);			//int - index 삭제
		arr1.remove((Object)10);	//Object - 원소 삭제
									//같은 값이 있을 경우 최초 원소 삭제
		System.out.println("remove((Object)10) : "+arr1);
		//bb = arr1.remove(3);		
		Object rr = arr1.remove(3);		// int - index 삭제 : 3번째 원소 삭제
										// 리턴 : 삭제한 원소값
		System.out.println("remove(3) : "+arr1);
		System.out.println("rr : "+rr);
		arr1.add(0,1234);
		arr1.add(20);
		arr1.add(20);
		arr1.add(20);
		arr1.add(5678);
		System.out.println("arr1 : "+arr1);
		rr = arr1.removeFirst();//0번째 제거
		System.out.println("removeFirst() : "+arr1);
		System.out.println("rr : "+rr);
		
		rr = arr1.removeLast(); //마지막 제거
		System.out.println("removeLast() : "+arr1);
		System.out.println("rr : "+rr);
		
		
		System.out.println("[[검색]]");
		
		System.out.println("contains(20) : "+arr1.contains(20));
		System.out.println("contains(1357) : "+arr1.contains(1357));
		System.out.println("indexOf(20) : "+arr1.indexOf(20));
		System.out.println("indexOf(1357) : "+arr1.indexOf(1357));
		//System.out.println("indexOf(20, 3) : "+arr1.indexOf(20,3));
		System.out.println("[[추출]]");
		Object [] arr2 = arr1.toArray();
		System.out.println("toArray() : "+arr2);
		System.out.println("toArray() : "+Arrays.toString(arr2));
		List arr3 = arr1.subList(2, 8);					//shallow copy
		List arr4 = new ArrayList(arr1.subList(2, 8));	//deep copy
		
		System.out.println("subList(2, 8) :"+arr3);
		System.out.println("arr4 :"+arr4);
		System.out.println("sublist 에서 추가");
		arr3.add(777);	
		System.out.println("arr1 :"+arr1);  //원본추가
		System.out.println("arr3 :"+arr3);	//자신추가
		System.out.println("arr4 :"+arr4);	//새로생성 영향없음
		
		System.out.println("원본 에서 추가");
		arr1.add(4, "프테라노돈");
		System.out.println("arr1 :"+arr1);  //원본추가
		//System.out.println("arr3 :"+arr3);	//에러발생
		System.out.println("arr4 :"+arr4);	//새로생성 영향없음
		
		
		List arr5 = new ArrayList();
		arr5.add(30);
		arr5.add(20);
		arr5.add(60);
		arr5.add(10);
		arr5.add(40);

		List arr6 = new ArrayList();
		arr6.add(135);
		arr6.add(246);
		arr6.add(60);
		
		System.out.println("[[All]]");
		System.out.println("arr5 : "+arr5);
		System.out.println("arr6 : "+arr6);
		arr5.addAll(arr6);
		System.out.println("addAll(arr6) : "+arr5);
		// containsAll : 모든 원소가 존재하는지
		System.out.println("containsAll(arr6) : "+arr5.containsAll(arr6));
		arr6.add(70);
		System.out.println("containsAll(arr6) : "+arr5.containsAll(arr6));
		
		System.out.println("arr1 : "+arr1);
		System.out.println("arr5 : "+arr5);
		arr1.removeAll(arr5);
		System.out.println("removeAll(arr5) : "+arr1);
		arr5.retainAll(arr6);
		System.out.println("retainAll(arr6) : "+arr5);
		
		System.out.println("[[Collections]]");
		Collections.replaceAll(arr5, 60, "육십");
		System.out.println("replaceAll(arr5, 60, \"육십\") : "+arr5);
		System.out.println("arr1 : "+arr1);
		Collections.reverse(arr1);
		System.out.println("reverse(arr1) : "+arr1);
		Collections.swap(arr1,1,3);
		System.out.println("swap(arr1,1,3) : "+arr1);
		Collections.shuffle(arr1);
		System.out.println("shuffle(arr1) : "+arr1);
		//Collections.sort(arr1); 원소가 모두 비교가능해야 정렬가능
		arr6.add(246);
		arr6.add(80);
		arr6.add(30);
		arr6.add(80);
		arr6.add(90);
		System.out.println("arr6 : "+arr6);
		Collections.sort(arr6);		//오름차순 정렬
		System.out.println("sort(arr6) : "+arr6);
		
		List arr7 = arr6;							//shallow copy
		List arr8 = new ArrayList(arr6);			//deep copy
		List arr9 = (List)((ArrayList)arr6).clone();//deep copy
		
		System.out.println("arr6:"+arr6);
		System.out.println("arr7:"+arr7);
		System.out.println("arr8:"+arr8);
		System.out.println("arr9:"+arr9);
		
		System.out.println("arr6==arr7 : "+(arr6==arr7));
		System.out.println("arr6==arr8 : "+(arr6==arr8));
		System.out.println("arr6==arr9 : "+(arr6==arr9));
		
		arr6.set(2, 777);
		System.out.println("arr6:"+arr6);
		System.out.println("arr7:"+arr7);
		System.out.println("arr8:"+arr8);
		System.out.println("arr9:"+arr9);
		
		System.out.println("isEmpty() : "+arr6.isEmpty());
		arr6.clear();
		System.out.println("clear() : "+arr6);
		System.out.println("isEmpty() : "+arr6.isEmpty());
		
		
	}
	

}
