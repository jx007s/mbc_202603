package lambda_p;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

class SortAct implements Comparable<SortAct>{
	String name;
	int age;
	SortAct(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + "\t" + age;
	}
	@Override
	public int compareTo(SortAct o) {
		int res = age - o.age;
		if(res==0) {
			res = name.compareTo(o.name);
		}
		return res;
	}	
}

class MyCom implements Comparator<SortAct> {
	public int compare(SortAct o1, SortAct o2) {
		int res = o1.age%10 - o2.age%10; //일의 자리로 정렬
		if(res==0) {
			res = o1.name.compareTo(o2.name);
		}
		return res;	
	}
}

public class StatisticsMain {

	public static void main(String[] args) {
		int [] arr1 = {55,22,77,11,99,33,88,66};
		
		Arrays.stream(arr1)
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("----------------------------");
		List<SortAct>arr2 = Arrays.asList(
				new SortAct("서강준", 27),
				new SortAct("안보현", 30),
				new SortAct("손석구", 32),
				new SortAct("고윤정", 27),
				new SortAct("배소영", 29),
				new SortAct("오수민", 27)
			);
		arr2.stream()
			.forEach(System.out::println);
		System.out.println("Comparable----------------------------");
		arr2.stream()
			.sorted()
			.forEach(System.out::println);
		System.out.println("Comparator.reverseOrder---------------");
		arr2.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
		System.out.println("Comparator 재정의 ----------------------");
		arr2.stream()
			.sorted((me, you)->{
					return -1;
				})
			.forEach(System.out::println);
		System.out.println("Comparator 재정의2 ---------------------");
		arr2.stream()
		.sorted(new MyCom())
		.forEach(System.out::println);
		
		System.out.println("Comparator 재정의 reversed()------------");
		arr2.stream()
		.sorted(new MyCom().reversed())
		.forEach(System.out::println);
		
		System.out.println("arr1------------");
		Arrays.stream(arr1)
		.forEach(System.out::println);
		
		System.out.println("peek 끝에 위치------------");
		Arrays.stream(arr1)
		.filter(i->i%2==0)
		.peek(System.out::println); //peek 마지막일 경우 실행 안함
		
		System.out.println("peek 중간에 위치------------");
		int tot = Arrays.stream(arr1)
		.peek(System.out::println) //peek 중간일 경우 실행함 - 주로 확인용
		.filter(i->i%2==0)
		.sum();
		System.out.println("tot : "+tot);
		
		System.out.println("forEach 끝에 위치------------");
		Arrays.stream(arr1)
		.filter(i->i%2==0)
		.forEach(System.out::println);//forEach 마지막일 경우 실행 함
		
		System.out.println("forEach 중간에 위치------------");
		tot = Arrays.stream(arr1)
		//.forEach(System.out::println) //forEach 중간일 경우 에러발생
		.filter(i->i%2==0)
		.sum();
		System.out.println("tot : "+tot);
		
		
		System.out.println("Match ------------");
		int [] arr3 = {2,4,6,8,10};
		//allMatch : 모든 원소가 조건에 충족
		System.out.println("all 2의배수"+Arrays.stream(arr3).allMatch(a->a%2==0));
		System.out.println("all 3의배수"+Arrays.stream(arr3).allMatch(a->a%3==0));
		//anyMatch : 원소 1개만이라도 충족
		System.out.println("any 3의배수"+Arrays.stream(arr3).anyMatch(a->a%3==0));
		System.out.println("any 7의배수"+Arrays.stream(arr3).anyMatch(a->a%7==0));
		//noneMatch : 모든 원소가 조건 부적합
		System.out.println("none 3의배수"+Arrays.stream(arr3).noneMatch(a->a%3==0));
		System.out.println("none 7의배수"+Arrays.stream(arr3).noneMatch(a->a%7==0));
		
		System.out.println("집계 ------------");
		System.out.println(Arrays.toString(arr1));
		System.out.println("count : "+Arrays.stream(arr1).count());
		System.out.println("findFirst : "+Arrays.stream(arr1).findFirst());
		OptionalInt oo1 = Arrays.stream(arr1).findFirst();
		int i = oo1.getAsInt();
		System.out.println("getAsInt : "+i);
		
		int [] arr4 = {};
		System.out.println(Arrays.toString(arr4));
		System.out.println("count : "+Arrays.stream(arr4).count());
		System.out.println("findFirst : "+Arrays.stream(arr4).findFirst());  
		// OptionalInt.empty : 데이터가 없는 경우
		oo1 = Arrays.stream(arr1).findFirst();
		System.out.println(oo1.isPresent());  //값이 존재 true
		OptionalInt oo4 = Arrays.stream(arr4).findFirst();
		System.out.println(oo4.isPresent());  //값이 없음 false

		i = oo1.orElse(0);  // 값이 있으면 자신 , 없으면 0
		System.out.println("55-orElse(0) : "+i);
		//i = oo4.getAsInt(); 에러발생
		i = oo4.orElse(0);	// 값이 있으면 자신 , 없으면 0
		System.out.println("empty-orElse(0) : "+i);
		
		System.out.println("max : "+Arrays.stream(arr1).max().getAsInt());
		System.out.println("min : "+Arrays.stream(arr1).min().getAsInt());
		System.out.println("sum : "+Arrays.stream(arr1).sum());
		System.out.println("average : "+Arrays.stream(arr1).average());
		
		
		/* 45,123,67,890,23,45,22,132,56,7,62 : 2의 배수들의 합계를 구하세요*/
		
	}

}
