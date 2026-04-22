package lambda_p;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
	}

}
