package coll_p;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

class CPBStud implements Comparable{

	int ban, tot ,avg;
	String gender, name;
	int [] jum;
	
	CPBStud(int ban, String name, String gender, int ... jum) {
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
		CPBStud you = (CPBStud)o;
		
		//반
		int res = ban - you.ban;
		
		//성별
		if(res==0) {
			res = gender.compareTo(you.gender);
		}
		//평균
		if(res==0) {
			res = you.avg-avg;
		}
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



public class TreeCPBMain {

	public static void main(String[] args) {
		TreeSet studs = new TreeSet();
		
		studs.add(new CPBStud(1, "현빈", "남",78,74,76));
		studs.add(new CPBStud(2, "원빈", "남",68,64,66));
		studs.add(new CPBStud(1, "투빈", "여",78,74,76));
		studs.add(new CPBStud(2, "커피빈", "남",98,94,96));
		studs.add(new CPBStud(1, "장희빈", "여",88,84,86));
		studs.add(new CPBStud(1, "현빈", "남",98,74,56));
		studs.add(new CPBStud(2, "젤리빈", "여",58,54,56));
		studs.add(new CPBStud(2, "숙빈", "여",78,84,86));
		studs.add(new CPBStud(1, "속빈", "남",78,74,76));
		
		
		for (Object oo : studs) {
			System.out.println(oo);
		}

	}

}

/*
 * 
SPBShapeMain - Comparable 사용

도형을 생성하고 도형의 정보대로 정렬하여 출력하세요

도형 정보 : 이름, 넓이, 둘레



정렬순서 : 이름 >  넓이 > 둘레
 * */

