package coll_p;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class MapStud implements Comparable{

	int ban, tot ,avg;
	String gender, name;
	int [] jum;
	
	MapStud(int ban, String name, String gender, int ... jum) {
		this.ban = ban;
		this.name = name;
		this.gender = gender;
		this.jum = jum;
		calc();
	}
	
	void calc() {
		tot = 0;
		for (int i : jum) {
			tot+= i;
		}
		avg = tot/jum.length;
	}

	@Override
	public String toString() {
		return ban + "\t" + gender + "\t" + name + "\t" + Arrays.toString(jum)
				+ "\t" + tot + "\t" + avg;
	}

	@Override
	public int compareTo(Object o) {
		MapStud you = (MapStud)o;
		
		//평균
		int res = you.avg-avg;
		
		//이름
		if(res==0) {
			res = name.compareTo(you.name);
		}
		//이름마저 같은 경우 생략하지 않고 다음에 위치
		if(res==0) {
			res = 1;
		}
		return res;
	}	
}


public class MapStudMain {

	public static void main(String[] args) {
		
		MapStud [] data = {
			new MapStud(1, "현빈", "남",78,74,76),
			new MapStud(2, "원빈", "남",68,64,66),
			new MapStud(1, "투빈", "여",78,74,76),
			new MapStud(2, "커피빈", "남",98,94,96),
			new MapStud(1, "장희빈", "여",88,84,86),
			new MapStud(1, "현빈", "남",98,74,56),
			new MapStud(2, "젤리빈", "여",58,54,56),
			new MapStud(2, "숙빈", "여",78,84,86),
			new MapStud(1, "속빈", "남",78,74,76)	
		};
		
		//System.out.println(Arrays.toString(data));
		
		/*
		 total<반 : <성별 : 학생들(Set)> >  
		 * 
			total
			Key : value
			 1 	Map 
				   Key : value
				   남 : 남자들(Set)
				   여 : 여자들(Set)
			
			 Key : value
			 2  Map
				   Key : value
				   남 : 남자들(Set)
				   여 : 여자들(Set)
		 * */
		Map total = new HashMap();
		
		Map ban1 = new HashMap();
		TreeSet b1m = new TreeSet();
		b1m.add(data[0]);
		b1m.add(data[5]);
		b1m.add(data[8]);
		TreeSet b1f = new TreeSet();
		b1f.add(data[2]);
		b1f.add(data[4]);
		Map ban2 = new HashMap();
		TreeSet b2m = new TreeSet();
		b2m.add(data[1]);
		b2m.add(data[3]);
		TreeSet b2f = new TreeSet();
		b2f.add(data[6]);
		b2f.add(data[7]);
		
		
		
		total.put(1, ban1);
		total.put(2, ban2);
		
		ban1.put("남", b1m);
		ban1.put("여", b1f);
		
		ban2.put("남", b2m);
		ban2.put("여", b2f);
		
		//전체 -> 반
		for (Object obj1 : total.entrySet()) {
			Map.Entry banEnt = (Map.Entry)obj1;
			//System.out.println(totEnt);
			System.out.println("[[ "+banEnt.getKey()+" 반 ]]");
			
			// 반 -> 성별
			for (Object obj2 : ((HashMap)banEnt.getValue()).entrySet()) {
				//System.out.println(obj2);
				Map.Entry genEnt = (Map.Entry)obj2;
				System.out.println(genEnt.getKey()+" >>>");
				
				// 성별 -> 학생
				for (Object st : (TreeSet)genEnt.getValue()) {
					System.out.println(st);
				}
			}
		}
	}

}
