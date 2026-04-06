package arr_p;

import java.util.Arrays;

public class MulArrMain {

	public static void main(String[] args) {
		int [] arr = {11,22,33,44};
		int [][] arr1 = {
				{123,456},
				{999,888}
		};
		
		int [][] arr2 = {				// 1차원 원소는 1차원배열 주소
				{100,200,300},			//각 원소배열의 길이가 다르더라도 정상
				arr,
				arr1[1],
				{101,202,303,404,505}
		};
		
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		System.out.println(arr2[1].length);
		System.out.println(arr2[2].length);
		System.out.println(arr2[3].length);
		System.out.println(arr == arr2[1]);
		System.out.println(arr1[1] == arr2[2]);
		
		// 모든 합계
		int [][] cnts = {
				{3,6,2,1},
				{10,20,3},
				{11,22}
		};
		
		int tot = 0;
		for (int[] cc : cnts) {
			System.out.println(Arrays.toString(cc));
			for (int i : cc) {
				System.out.println(i);
				tot += i;
			}
		}
		System.out.println("----------------");
		System.out.println(tot);
		
		
		/*
		 * MulCoffeeMain
		 * 1일 : 아시아노,아프리카노,아메리카노
		 * 2일 : 아프리카노,아시아노
		 * 3일 : 아메리카노,아프리카노,아프리카노,아시아노
		 * 
		 * 메뉴별 갯수를 출력하세요
		 * */
		

	}

}
