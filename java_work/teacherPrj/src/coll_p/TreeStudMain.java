package coll_p;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

class TreeStud{

	int ban, tot ,avg;
	String gender, name;
	int [] jum;
	
	TreeStud(int ban, String name, String gender, int ... jum) {
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
}



public class TreeStudMain {

	public static void main(String[] args) {
		TreeSet studs = new TreeSet(
			new Comparator() {

				@Override
				public int compare(Object o1, Object o2) {
					TreeStud me = (TreeStud)o1;
					TreeStud you = (TreeStud)o2;
					
					//반
					int res = me.ban - you.ban;
					
					//성별
					if(res==0) {
						res = me.gender.compareTo(you.gender);
					}
					//평균
					if(res==0) {
						res = you.avg-me.avg;
					}
					//이름
					if(res==0) {
						res = me.name.compareTo(you.name);
					}
					//이름마저 같은 경우 생략하지 않고 다음에 위치
					if(res==0) {
						res = 1;
					}
					return res;
				}
			}
		);
		studs.add(new TreeStud(1, "현빈", "남",78,74,76));
		studs.add(new TreeStud(2, "원빈", "남",68,64,66));
		studs.add(new TreeStud(1, "투빈", "여",78,74,76));
		studs.add(new TreeStud(2, "커피빈", "남",98,94,96));
		studs.add(new TreeStud(1, "장희빈", "여",88,84,86));
		studs.add(new TreeStud(1, "현빈", "남",98,74,56));
		studs.add(new TreeStud(2, "젤리빈", "여",58,54,56));
		studs.add(new TreeStud(2, "숙빈", "여",78,84,86));
		studs.add(new TreeStud(1, "속빈", "남",78,74,76));
		
		
		for (Object oo : studs) {
			System.out.println(oo);
		}

	}

}

/*
 * 
TreeSawonMain
직급, 이름순으로 정렬해 주세요 

직급 : 사장 > 부장 > 과장 > 대리 > 사원

이름 : 오름차순

사원_정우성,과장_현빈,부장_원빈,과장_장동건,사원_장서건,대리_정남성,대리_정좌성,부장_이효리,사원_삼효리,과장_한가인,대리_두가인
 * */

