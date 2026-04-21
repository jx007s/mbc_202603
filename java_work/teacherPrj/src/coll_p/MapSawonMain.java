package coll_p;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

enum MapGrade{
	사장 , 부장 , 과장 , 대리 , 사원
}
class MapSawon{
	String  name;
	MapGrade grade;

	MapSawon(String ttt) {
		String [] arr = ttt.split("_");
		this.grade = MapGrade.valueOf(arr[0]);
		this.name = arr[1];
	}

	@Override
	public String toString() {
		return grade + "\t" + name;
	}
}
public class MapSawonMain {

	public static void main(String[] args) {
		
		TreeMap<MapGrade, TreeSet<MapSawon>> total = new TreeMap();
		
		for (String str : "사원_정우성,과장_현빈,부장_원빈,과장_장동건,사원_장서건,대리_정남성,대리_정좌성,부장_이효리,사원_삼효리,과장_한가인,대리_두가인".split(",")) {
			
			
			MapSawon sw = new MapSawon(str);
			
			TreeSet<MapSawon> set;
			
			if(total.containsKey(sw.grade)) {
				set = total.get(sw.grade);
			}else {
				set = new TreeSet(
						new Comparator<MapSawon>() {
							@Override
							public int compare(MapSawon me, MapSawon you) {
								
								return me.name.compareTo(you.name);
							}
						});
			}
			set.add(sw);
			total.put(sw.grade, set);
		}

		//System.out.println(total);
		for (Map.Entry<MapGrade, TreeSet<MapSawon>> grade : total.entrySet()) {
			//Map.Entry<MapGrade, TreeSet<MapSawon>> grade = (Map.Entry)oo;
			System.out.println(grade.getKey()+" >>>");
			for (MapSawon sw : grade.getValue()) {
				System.out.println(sw);
			}
		}
	}

}
