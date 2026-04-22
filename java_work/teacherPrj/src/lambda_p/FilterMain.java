package lambda_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterMain {

	public static void main(String[] args) {
		List<String> arr1 = List.of(
				"전","찌개","우갈찜","우갈탕","찌개","전","돌솥비빔밥","우갈탕"
				);
		
		System.out.println("arr1 : "+arr1);
		System.out.println("distinct()---------------");
//		Stream<String> str1 = arr1.stream();
//		str1 = str1.distinct();  //중복제거
		Stream<String> str1 = arr1.stream().distinct();  //중복제거
		str1.forEach(tt->System.out.println(tt));
		str1.close();
		
		System.out.println("filter()---------------");
		//filter : 조건에 맞는 원소만 사용
		str1 = arr1.stream().filter(tt->tt.length()>=3); //3글자이상
		str1.forEach(tt->System.out.println(tt));
		str1.close();
		
		System.out.println("distinct()+filter()---------------");
		str1 = arr1
				.stream()
				.distinct()	//중복제거
				.filter(tt->tt.length()>=3); //3글자이상 
		
		str1.forEach(tt->System.out.println(tt));
		str1.close();
		
		
		int [] arr2 = {11,22,33,44,55,66};
		System.out.println("map()---------------");
		IntStream istr = Arrays
				.stream(arr2)
				.map(i->i*100); //map : 각 원소들을 변경하여 사용
		istr.forEach(i->System.out.println(i));
		istr.close();
		
		ArrayList<String> arr3 = new ArrayList<String>();
		arr3.add("배구,농구");
		arr3.add("축구,야구,탁구");
		arr3.add("왜이러구,배고프구");
		arr3.add("구로구,부산진구,맹구");
		
		str1 = arr3.stream();
		str1.forEach(tt->System.out.println(tt));
		str1.close();
		
		System.out.println("flatMap()---------------");
		str1 = arr3.stream().flatMap(tt->Arrays.stream(tt.split(",")));
		//flatMap(tt->Arrays.stream(tt.split(",")))
		// tt.split(",") : , 을 기준으로 String[] 생성
		// Arrays.stream : String[] -> Stream<String> 생성
		// flatMap : Stream<String>들을 하나의 Stream으로 결합
		str1.forEach(tt->System.out.println(tt));
		str1.close();

		System.out.println("flatMap() + IntStream.of()---------------");
		int [] arr4 = {5,7,9};
		istr = Arrays.stream(arr4)
				.flatMap(i->IntStream.of(i, i*10, i*100));
		//IntStream.of(i, i*10, i*100) : 5 인경우 5,50,500 으로 IntStream 생성
		// flatMap : IntStream 들을 하나의 Stream으로 결합
		// IntStream(5,50,500) , IntStream(7,70,700) , IntStream(9,90,900)  ==> IntStream(5,50,500,7,70,700,9,90,900)
		istr.forEach(tt->System.out.println(tt));
		istr.close();
		
		System.out.println("mapToInt()---------------");
		List<String> arr5 = Arrays.asList("12,34,56".split(","));
		//asList : 배열을 대입받아 List 생성
		
		str1 = arr5.stream();
		istr = str1.mapToInt(tt->Integer.parseInt(tt));
		//		mapToInt : String -> Integer 로 변경 ::IntStream 생성
		istr.forEach(tt->System.out.println(tt));
		istr.close();
		str1.close();
		
		
		System.out.println("flatMapToInt()---------------");
		List<String> arr6 = Arrays.asList("13,46,79","321,654,987","900");
		
		istr = arr6.stream()
				.flatMapToInt(tt->
				Arrays.stream(tt.split(","))
				.mapToInt(s->Integer.parseInt(s)));
		istr.forEach(tt->System.out.println(tt));
		istr.close();
		
		
		//exam.txt 에서 평균이 70점 인상인 정보를 출력하세요
	}

}
