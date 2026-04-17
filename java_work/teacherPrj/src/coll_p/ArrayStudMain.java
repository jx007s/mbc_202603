package coll_p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayStud{
	int ban, tot, avg;
	String name;
	int [] jum;
	
	ArrayStud(int ban, String name, int kor, int eng, int mat) {

		this.ban = ban;
		this.name = name;
		this.jum = new int[] {kor, eng, mat};
		calc();
	}
	void calc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot / jum.length;
	}
	@Override
	public String toString() {
		return ban + "\t" + name +"\t"
				+ Arrays.toString(jum)+"\t"+ tot + "\t" + avg +"\t" ;
	}
}

public class ArrayStudMain {

	public static void main(String[] args) {
		ArrayStud [] arr = {
			new ArrayStud(1, "차은우", 57, 58, 52),
			new ArrayStud(2, "안유진", 97, 98, 92),
			new ArrayStud(1, "장원영", 67, 68, 62),
			new ArrayStud(2, "카리나", 87, 18, 82),
			new ArrayStud(1, "윈터", 77, 78, 72),
			new ArrayStud(1, "전정국", 74, 68, 82),
			new ArrayStud(2, "창있어요", 48, 82, 62),
			new ArrayStud(2, "채원", 57, 78, 92),
			new ArrayStud(1, "한로로", 76, 82, 94),
			new ArrayStud(2, "케로로", 75, 84, 73),
			new ArrayStud(1, "기로로", 53, 85, 52)
		};
		
		//70점
		ArrayList team1 = new ArrayList();
		team1.add(new ArrayList());	//0번째 - 1반
		team1.add(new ArrayList());	//1번째 - 2반
		ArrayList team2 = new ArrayList();
		team2.add(new ArrayList());	//1반
		team2.add(new ArrayList());	//2반

		
		for (ArrayStud st : arr) {
			List curr;
			if(st.avg>=70) {
				curr = team1;
			}else {
				curr = team2;
			}
			curr.add(st);
		}
		
		//System.out.println(team1);
		//System.out.println(team2);
		/*
		System.out.println("team1 >>>");
		for (Object st : team1) {
			System.out.println(st);
		}
		System.out.println("team2 >>>");
		for (Object st : team2) {
			System.out.println(st);
		}*/
		
		listppp("team1", team1); 
		listppp("team2", team2); 
	}
	static void listppp(String title, List list) {
		System.out.println(title+" >>>");
		for (Object st : list) {
			System.out.println(st);
		}
	}

}
