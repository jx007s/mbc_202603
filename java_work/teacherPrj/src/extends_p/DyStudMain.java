package extends_p;

import java.util.Arrays;

class DyStud{
	String kind,name;
	int [] jum;
	int tot,avg;
	
	//부모사용자정의생성자
	DyStud(String kind, String name) {
		this.kind = kind;
		this.name = name;
		
	}
	void calc() {
		totCalc();
		avgCalc();
		ppp();
	}
	
	void totCalc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
	}
	void avgCalc() {
		avg = tot/jum.length;
	}
	void ppp() {
		System.out.println(kind+"\t"+name+"\t"+
				Arrays.toString(jum)+"\t"+tot+"\t"+avg);
	}
}

class DyGen extends DyStud{
	
	public DyGen(String name, int kor, int eng, int mat) {
		super("일반",name); 
		//부모가 사용자정의생성자인 경우 자식생성자에서 반드시호출해야 한다
		// 자신의 생성자 위임보다도 우선처리해야한다.
		
		jum = new int[] {kor, eng, mat};
	}
	
	void ppp() {
		System.out.println(kind+"\t"+name+"\t"+
				Arrays.toString(jum)+"\t\t"+tot+"\t"+avg);
	}
}

class DyArt extends DyStud{
	
	public DyArt(String name, int kor, int eng, int mat, int art) {
		super("예체능",name);
		jum = new int[] {kor, eng, mat, art};
	}
	
	void avgCalc() {
		double [] rate = {0.05, 0.1, 0.15, 0.7};
		avg = 0;
		for (int i = 0; i < rate.length; i++) {
			avg += rate[i]*jum[i];
		}
	}
}


public class DyStudMain {

	public static void main(String[] args) {
		DyStud [] studs = {
			new DyGen("한가인",37,68,92 ),
			new DyArt("두가인",37,58,72,94 ),
			new DyGen("세가인",97,68,32 ),
			new DyArt("네가인",97,78,52,34 ),
			new DyGen("오가인",87,88,82 ),
			new DyArt("육가인",88,82,82,84 )
		};
		
		for (DyStud st : studs) {
			st.calc();
		}

	}

}


/*
DyShapeMain를 구현하세요
부모 : 도형
종류, 넓이, 둘레

자식
   종류        넓이                      둘레
 직사각형      가로 * 세로                (가로 + 세로) * 2
 직각삼각형     가로 * 세로 /2             가로 + 세로 + 빗변
 원          반지름*반지름*PI				반지름*2*PI



* */

