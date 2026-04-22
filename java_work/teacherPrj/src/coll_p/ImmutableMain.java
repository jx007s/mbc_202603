package coll_p;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableMain {

	public static void main(String[] args) {

		List<String> arr1 = new ArrayList<String>();
		arr1.add("아기상어");
		arr1.add("엄마상어");
		arr1.add("아빠상어");
		arr1.add("할머니상어");

		System.out.println("arr1:"+arr1);

		// 변경불가 : Immutable 형태의 열거형으로 생성
		// List.of()
		List<String> arr2 = List.of();

//		arr2.add("아기상어");
//		arr2.add("엄마상어");
//		arr2.add("아빠상어");
//		arr2.add("할머니상어");

		System.out.println("arr2:"+arr2);
		
		List<String> arr3 = List.of("티라노","브라키오","벨로시랩터","안킬로사우루스");
		System.out.println("arr3:"+arr3);
		
		List<Integer> arr4 = List.of(10,20,30,40,50,60,70,80,90,100);
		System.out.println("arr4:"+arr4);
		
		List<Integer> arr5 = List.of(
				10,20,30,40,50,60,70,80,90,
				100,110,120,130,140,150,160,170,180,190,200,210,220);
		System.out.println("arr5:"+arr5);
		
		//duplicate element: 사자
		//Set<String> ss1 = Set.of("사자","호랑이","사자","고양이","칡");
		//System.out.println("ss1:"+ss1);
		
		Set<String> ss2 = Set.of("사자","호랑이","고양이","칡");
		System.out.println("ss2:"+ss2);
		
		Set<Integer> ss3 = Set.of(
				10,20,30,40,50,60,70,80,90,
				100,110,120,130,140,150,160,170,180,190,200,210,220);
		System.out.println("ss3:"+ss3);
		
		Map<String, String> mm1 = Map.of(
				"아메리카노","커피",
				"아빠는외국인","아이스크림",
				"돼지국밥","전설");
		
		System.out.println("mm1:"+mm1);
		
		// key, value 쌍을 맞추어 대입해야 함
		//Map<String, String> mm2 = Map.of("아메리카노","아프리카노","아시아노");
		
		Map<String, Integer> mm3 = Map.of(
				"아메리카노",2000,
				"아빠는외국인",1500,
				"돼지국밥",9000);
		
		System.out.println("mm3:"+mm3);
		
		// Map.of : key=value 10개 까지만 가능
		Map<String, Integer> mm4 = Map.of(
				"롯데",9,
				"LG",2,
				"SSG",4,
				"삼성",3,
				"두산",8,
				"기아",3,
				"키움",6,
				"한화",7,
				"NC",5,
				"KT",1
				// ,"시민",11
				);
		
		System.out.println("mm4:"+mm4);
	}

}
