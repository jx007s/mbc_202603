package oops_p;

import java.util.Arrays;

class MeClaStud{
	String name;
	int [] jum;
	int tot;
	double avg;
	
	// 1. 입력부
	void input(String name, int kor, int eng, int mat) {
		// 멤버변수 = 매개변수
		this.name = name;
		jum = new int[] {kor, eng, mat};
		//메소드 내 메소드 호출
		calc();
		//ppp();
	}
	
	//2. 연산부
	void calc() {
		tot = 0;
		for (int j : jum) {
			tot += j;
		}
		avg = (double)tot/jum.length;
	}
	
	//3. 출력부
	void ppp() {
		String ttt = name+"\t"+
				Arrays.toString(jum)+"\t"+
				tot+"\t"+avg;
		System.out.println(ttt);
	}
}

public class MeStudMain {

	public static void main(String[] args) {
		MeClaStud st1 = new MeClaStud();
		MeClaStud st2 = new MeClaStud();
		MeClaStud st3 = new MeClaStud();
		st1.input("현빈", 78, 73, 79);
		st2.input("원빈", 88, 83, 89);
		st3.input("투빈", 68, 63, 69);
		//st1.calc();
		st1.ppp();
		st2.ppp();
		st3.ppp();

	}

}
