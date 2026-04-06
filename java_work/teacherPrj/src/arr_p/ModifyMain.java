package arr_p;

import java.util.Arrays;

public class ModifyMain {

	public static void main(String[] args) {
		int [] arr1 = {100,200,300,400};

		// 추가
		int [] addArr = new int[arr1.length+1];
		
		for (int i = 0; i < arr1.length; i++) {
			addArr[i] = arr1[i];
		}
		addArr[arr1.length] = 999;  //마지막 원소 대입
		System.out.println("arr1 : "+arr1+","+Arrays.toString(arr1));
		System.out.println("addArr : "+addArr+","+Arrays.toString(addArr));
		arr1 = addArr;
		System.out.println("arr1 : "+arr1+","+Arrays.toString(arr1));
		
		// 삭제
		
		int [] delArr = new int[arr1.length-1];
		
		for (int i = 0; i < delArr.length; i++) {
			delArr[i] = arr1[i];
		}
		
		System.out.println("arr1 : "+arr1+","+Arrays.toString(arr1));
		System.out.println("delArr : "+delArr+","+Arrays.toString(delArr));
		arr1 = delArr;
		System.out.println("arr1 : "+arr1+","+Arrays.toString(arr1));
		
		
		// 중간추가 - 2번째
		int pos = 2;
		int value = 888;
		addArr = new int[arr1.length+1];
		
		for (int i = 0; i < pos; i++) {
			addArr[i] = arr1[i];
		}
		addArr[pos] = value;
		
		for (int i =  pos; i < arr1.length; i++) {
			addArr[i+1] = arr1[i];
			//원본+1 위치  =   원본위치
		}
		System.out.println("arr1 : "+arr1+","+Arrays.toString(arr1));
		System.out.println("addArr : "+addArr+","+Arrays.toString(addArr));
		arr1 = addArr;
		System.out.println("arr1 : "+arr1+","+Arrays.toString(arr1));
		
		// 중간삭제 - 1번째  [100, 888, 300, 400]
		pos = 1;
		delArr = new int[arr1.length-1];
		for (int i = 0; i < pos; i++) {
			delArr[i] = arr1[i];
		}
		for (int i = pos+1; i <arr1.length; i++) {
			delArr[i-1] = arr1[i];
		}
		System.out.println("arr1 : "+arr1+","+Arrays.toString(arr1));
		System.out.println("delArr : "+delArr+","+Arrays.toString(delArr));
	}

}
