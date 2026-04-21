package coll_p;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		
		// Map : key = value 를 원소로 하는 열거데이터
		// key 중복 X, 순서 없음
		// value 중복가능
		Map mm1 = new HashMap();
		//mm1.add(100);
		//mm1.add(0, 100);
		
		
		// put(key, value) : 추가 , 대입
		mm1.put("사자", "포유류"); // Map에 존재하지 않을 경우 추가
		mm1.put("상어", "어류");
		mm1.put("악어", "파충류");
		mm1.put("곰", "포유류");
		mm1.put("독수리", "조류");
		mm1.put("오타니", "이도류");
		mm1.put("호랑이", "포유류");
		mm1.put("사자", "고양이과"); // Map에 key 가존재할 경우 대입
		mm1.put("상어", "뚜루루뚜류");
		
		System.out.println("mm1 : "+mm1);
		//get(key) : 호출
		System.out.println("get : "+mm1.get("상어"));
		System.out.println("get : "+mm1.get(0)); 
		//0 : 원소번호가 아닌 key 로 인식
		// 존재하지 않는 key : null 리턴
		
		System.out.println("size : "+mm1.size()); //원소 갯수
		//remove(key) : 삭제 - 삭제한 value 리턴
		Object oo = mm1.remove("독수리");	
		System.out.println("remove : "+mm1);
		System.out.println("oo : "+oo);
		
		// 존재하지 않는 key 삭제 - 에러안남 : null 리턴
		oo = mm1.remove("토끼"); 	
		System.out.println("remove : "+mm1);
		System.out.println("oo : "+oo);
		
		Map mm2 = new HashMap();
		mm2.put("돼지국밥", "부산");
		mm2.put("비빔밥", "전주");
		mm2.put("떡갈비", "경주");
		
		mm1.putAll(mm2);
		System.out.println("putAll : "+mm1);
		
		//없음
		//System.out.println("contains() : "+mm1.contains());
		//System.out.println("containsAll() : "+mm1.containsAll());
		//mm1.removeAll()
		
		//존재유무
		System.out.println("containsKey() : "+mm1.containsKey("오타니"));
		System.out.println("containsKey() : "+mm1.containsKey("육타니"));
		System.out.println("containsValue() : "+mm1.containsValue("뚜루루뚜류"));
		System.out.println("containsValue() : "+mm1.containsValue("조류"));
		
		Map mm3 = new HashMap(mm1); //Map 을 매개변수로 가져옴  ,List, Set 불가
		Map mm4 = mm1;
		Map mm5 = (Map)((HashMap)mm1).clone();
		
		//직접 forEach 불가
		//for (Object oo : mm1) {	}
		//직접 iterator 불가
		//Iterator it = mm1.iterator(); 
		
		// entrySet() : Map.Entry 를 원소로 하는 Set 리턴
		// Map.Entry : key=value 를 하나의 데이터로 하는 객체
		//[ key1=value1, key2=value2, key3=value3, ... ]
		Set ss1 = mm1.entrySet();
		System.out.println("entrySet() : "+ss1);
		
		for (Object obj : ss1) {
			//System.out.println(obj);
			Map.Entry men = (Map.Entry)obj;
			//System.out.println(men);
			System.out.println(men.getKey()+" : "+men.getValue());
		}
	}

}
