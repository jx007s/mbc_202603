package lambda_p;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

class MapMember{
	String id, pname;
	int age;
	boolean marriage;
	MapMember(String id, String pname, int age, boolean marriage) {
		this.id = id;
		this.pname = pname;
		this.age = age;
		this.marriage = marriage;
	}
	@Override
	public String toString() {
		return "MapMember [id=" + id + ", pname=" + pname + ", age=" + age + ", marriage=" + marriage + "]";
	}
	String getId() {  // Collectors.toMap에서 key 대입시 호출할 메소드
		return id;
	}
	MapMember getMe() {  // Collectors.toMap()에서 value 대입시 호출할 메소드
		return this;
	}
	
}

public class CollectMain {

	public static void main(String[] args) {
		int [] arr1 = {55,22,33,77,55,11,99,11,33,88,66};

		List<Integer> list1 = Arrays.stream(arr1) //Stream
				.boxed()	// 자료형에 맞는 Stream 으로 변환 IntStream
				.toList();	// List로 리턴
		
		System.out.println("toList : "+list1);
		
		//HashSet
		Set<Integer> ss1 = Arrays.stream(arr1) //Stream
				.boxed()	// 자료형에 맞는 Stream 으로 변환 IntStream
				.collect(Collectors.toSet());  // set으로 리턴	
		System.out.println("Collectors.toSet() : "+ss1);
		
		//LinkedHashSet
		ss1 = Arrays.stream(arr1) //Stream
				.boxed()	// 자료형에 맞는 Stream 으로 변환 IntStream
				.collect(
						Collectors.toCollection(()-> new LinkedHashSet<Integer>()));	
		System.out.println("LinkedHashSet : "+ss1);
		
		//TreeSet
		ss1 = Arrays.stream(arr1) //Stream
				.boxed()	// 자료형에 맞는 Stream 으로 변환 IntStream
				.collect(
						Collectors.toCollection(()-> new TreeSet<Integer>()));	
		System.out.println("TreeSet : "+ss1);
		
		//TreeSet - Reverse
		ss1 = Arrays.stream(arr1) //Stream
				.boxed()	// 자료형에 맞는 Stream 으로 변환 IntStream
				.collect(
						Collectors.toCollection(()-> new TreeSet<Integer>(Comparator.reverseOrder())));	
		System.out.println("TreeSet-R : "+ss1);
		
		Map<String, List<Integer>> map1 = Arrays.stream(arr1)
				.boxed()
				.collect(Collectors.groupingBy(a->a%2==0 ? "짝수":"홀수"));
		
		System.out.println("groupingBy : "+ map1);
		
		Map<String, Set<Integer>> map2 = Arrays.stream(arr1)
				.boxed()
				.collect(Collectors.groupingBy(a->a%2==0 ? "짝수":"홀수",
						Collectors.toSet()));
		
		System.out.println("groupingBy-toSet : "+ map2);
		
		List<MapMember> members = Arrays.asList(
				new MapMember("aa", "한가인", 43, true),
				new MapMember("bb", "두가인", 39, false),
				new MapMember("cc", "세가인", 27, true),
				new MapMember("dd", "한가인", 19, false),
				new MapMember("ee", "두가인", 52, true),
				new MapMember("ff", "가인", 26, false)
				);
		
		// key 가 중복되지 않음
		// key : id, value: member
		Map<String , MapMember> map3 = members.stream()
				.collect(Collectors.toMap(
						MapMember::getId,  	// key 처리 메소드
						MapMember::getMe	// value 처리 메소드
						));
		
		System.out.println("toMap(키중복없음1) : "+ map3);
		
		
		// 위의 것과 같음
		map3 = members.stream()
				.collect(Collectors.toMap(
						mm->mm.getId(), // key 처리 메소드
						mm->mm.getMe()	// value 처리 메소드
						));
		
		System.out.println("toMap(키중복없음2) : "+ map3);
		
		
		
		List<MapMember> members2 = Arrays.asList(
				new MapMember("cc", "세가인", 27, true),
				new MapMember("ee", "두가인", 52, true),
				new MapMember("aa", "한가인", 43, true),
				new MapMember("bb", "두가인", 39, false),
				new MapMember("ff", "가인", 26, false),
				new MapMember("dd", "한가인", 19, false),
				new MapMember("aa", "사람인", 23, false) //key 중복발생:aa
				);
		
		
		
		/*//키중복으로 인한 에러 발생
		Map<String , MapMember> map4 = members2.stream()
				.collect(Collectors.toMap(
						MapMember::getId, 
						MapMember::getMe
						));
		*/
		
		Map<String , MapMember> map5 = members2.stream()
				.collect(Collectors.toMap(
						MapMember::getId,	// key 처리 메소드
						MapMember::getMe,	// value 처리 메소드
						(old, nnew)-> old 	// 키중복시 어느것으로 사용할 것인 선택
											// 현재는 이전 data 유지
										//new MapMember("aa", "한가인", 43, true) 사용
						));
		System.out.println("toMap(키중복처리)1 : "+ map5);
		
		Map<String , MapMember> map6 = members2.stream()
				.collect(Collectors.toMap(
						MapMember::getId,	// key 처리 메소드
						MapMember::getMe,	// value 처리 메소드
						(old, nnew)-> nnew 	// 키중복시 어느것으로 사용할 것인 선택
											// 현재는 새로운 data로 변경
										//new MapMember("aa", "사람인", 23, false) 사용
						));
		System.out.println("toMap(키중복처리)2 : "+ map6);
		
		
		Map<String , MapMember> map7 = members2.stream()
				.collect(Collectors.toMap(
						MapMember::getId,	// key 처리 메소드
						MapMember::getMe,	// value 처리 메소드
						(old, nnew)-> nnew, 	// 키중복시 어느것으로 사용할 것인 선택
						LinkedHashMap::new		//LinkedHashMap으로처리
						));
		System.out.println("toMap(LinkedHashMap) : "+ map7);
		
		Map<String , MapMember> map8 = members2.stream()
				.collect(Collectors.toMap(
						MapMember::getId,	// key 처리 메소드
						MapMember::getMe,	// value 처리 메소드
						(old, nnew)-> nnew, 	// 키중복시 어느것으로 사용할 것인 선택
						TreeMap::new		//TreeMap으로처리
						));
		System.out.println("toMap(TreeMap) : "+ map8);
		
		Map<String , MapMember> map9 = members2.stream()
				.collect(Collectors.toMap(
						MapMember::getId,	// key 처리 메소드
						MapMember::getMe,	// value 처리 메소드
						(old, nnew)-> nnew, 	// 키중복시 어느것으로 사용할 것인 선택
						()->new TreeMap(Comparator.reverseOrder())	//역정렬
						));
		System.out.println("toMap(TreeMap-R) : "+ map9);
	}

}
