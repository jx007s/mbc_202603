package coll_p;

import java.util.Comparator;
import java.util.TreeSet;

enum TreeGrade{
	사장 , 부장 , 과장 , 대리 , 사원
}
class TreeSawon{
	String  name;
	TreeGrade grade;

	TreeSawon(String ttt) {
		String [] arr = ttt.split("_");
		this.grade = TreeGrade.valueOf(arr[0]);
		this.name = arr[1];
	}

	@Override
	public String toString() {
		return grade + "\t" + name;
	}
}

public class TreeSawonMain {

	public static void main(String[] args) {
		TreeSet sws = new TreeSet(
				new Comparator() {
					@Override
					public int compare(Object o1, Object o2) {
						TreeSawon me = (TreeSawon)o1;
						TreeSawon you = (TreeSawon)o2;
						
						int res = me.grade.ordinal() - you.grade.ordinal();
						
						if(res==0) {
							res = me.name.compareTo(you.name);
						}
						return res;
					}
				}
			);
		for (String str : "사원_정우성,과장_현빈,부장_원빈,과장_장동건,사원_장서건,대리_정남성,대리_정좌성,부장_이효리,사원_삼효리,과장_한가인,대리_두가인".split(",")) {
			sws.add(new TreeSawon(str));
		}

		for (Object sw : sws) {
			System.out.println(sw);
		}
	}

}
