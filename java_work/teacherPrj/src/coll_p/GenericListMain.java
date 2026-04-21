package coll_p;

import java.util.ArrayList;
import java.util.Iterator;

class Product{}
class Phone extends Product{}
class HandPhone extends Phone{}
class TV{}

public class GenericListMain {

	public static void main(String[] args) {
		ArrayList arr1 = new ArrayList();
		ArrayList<Phone> arr2 = new ArrayList();
		ArrayList<? super Phone> arr3 = new ArrayList();
		ArrayList<? extends Phone> arr4 = new ArrayList();
		ArrayList<HandPhone> arr5 = new ArrayList();
		
		arr1.add(new Product());
		arr1.add(new Phone());
		arr1.add(new HandPhone());
		arr1.add(new TV());
		
		//<Phone>  본인 --> 자식 가능
		//arr2.add(new Product());
		arr2.add(new Phone());
		arr2.add(new HandPhone());
		//arr2.add(new TV());
		
		// <? super Phone> == <Phone>
		//arr3.add(new Product());
		arr3.add(new Phone());
		arr3.add(new HandPhone());
		//arr3.add(new TV());
		
		//<? extends Phone> 의미없음 , 모두 불가
//		arr4.add(new Product());
//		arr4.add(new Phone());
//		arr4.add(new HandPhone());
//		arr4.add(new TV());
		
		//<HandPhone> 본인 --> 자식 가능
//		arr5.add(new Product());
//		arr5.add(new Phone());
		arr5.add(new HandPhone());
//		arr5.add(new TV());
		
		meth_1(arr1);
		meth_1(arr2);
		meth_1(arr3);
		meth_1(arr5);
		
		//meth_2(arr1);
		meth_2(arr2);
		//meth_2(arr3);
		//meth_2(arr5);
		
		//meth_3(arr1);
		meth_3(arr2);	//부모
		meth_3(arr3);  //자신
		//meth_3(arr5);
		
		//meth_4(arr1);
		meth_4(arr2);
		//meth_4(arr3);
		meth_4(arr5);
		
		//meth_5(arr1);
		//meth_5(arr2);
		//meth_5(arr3);
		meth_5(arr5);
		
		Iterator it1;
		it1 = arr1.iterator();
		it1 = arr2.iterator();
		it1 = arr3.iterator();
		it1 = arr5.iterator();
		
		Iterator<Phone> it2;
		//it2 = arr1.iterator();
		it2 = arr2.iterator();
		//it2 = arr3.iterator();
		//it2 = arr5.iterator();
		
		Iterator<? super Phone> it3;
		//it3 = arr1.iterator();
		it3 = arr2.iterator();
		it3 = arr3.iterator();
		//it3 = arr5.iterator();
		
		Iterator<? extends Phone> it4;
		//it4 = arr1.iterator();
		it4 = arr2.iterator();
		//it4 = arr3.iterator();
		it4 = arr5.iterator();
		
		Iterator<HandPhone> it5;
		//it5 = arr1.iterator();
		//it5 = arr2.iterator();
		//it5 = arr3.iterator();
		it5 = arr5.iterator();
	}
	
	static void meth_1(ArrayList arr) {}
	
	//자신만 가능 : Phone
	static void meth_2(ArrayList<Phone> arr) {
		for (Phone phone : arr) { // Generic 으로 지정된 형태로 형변환
			
		}
	}
	
	//  부모 <--- 자신 : 가능
	static void meth_3(ArrayList<? super Phone> arr) {
		for (Object object : arr) { //부모의 끝이 Object 이므로 Object 로 처리
			
		}
	}
	// 자신 ---> 자손 : 가능
	static void meth_4(ArrayList<? extends Phone> arr) {
		for (Phone phone : arr) {}
	}
	
	// 자신만 가능 : HandPhone
	static void meth_5(ArrayList<HandPhone> arr) {}

}
