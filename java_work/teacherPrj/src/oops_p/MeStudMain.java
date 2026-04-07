package oops_p;

import java.util.Arrays;

class MeClaStudProvider{
	
	MeClaStud studMake(String name, int kor, int eng, int mat) {
		
		MeClaStud st = new MeClaStud();
		st.input(name, kor, eng, mat);
		return st;
	}
}

class MeClaStud{
	String name;
	int [] jum;
	int tot;
	double avg;
	
	// 1. 입력부
	void input(String name, int ...jum) {
		// 멤버변수 = 매개변수
		this.name = name;
		//jum = new int[] {kor, eng, mat};
		this.jum = jum;
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
		/*
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
		
		
		MeClaStud [] studs = new MeClaStud[]{
			new MeClaStud(),
			new MeClaStud(),
			new MeClaStud()
		};
		
		
		MeClaStud [] studs = new MeClaStud[3];
		for (int i = 0; i < studs.length; i++) {
			studs[i] =new MeClaStud();
		}
		
		studs[0].input("현빈", 78, 73, 79);
		studs[1].input("원빈", 88, 83, 89);
		studs[2].input("투빈", 68, 63, 69);
		*/
		
		MeClaStudProvider provider = new MeClaStudProvider();
		MeClaStud [] studs = {
			provider.studMake("현빈", 78, 73, 79),
			provider.studMake("원빈", 88, 83, 89),
			provider.studMake("투빈", 68, 63, 69),
			provider.studMake("김우빈", 55, 57, 52),
			provider.studMake("젤리빈", 92, 93, 91)
		};
		
		for (MeClaStud st : studs) {
			st.ppp();
		}
		

	}

}


//자동차 성능 테스트 클래스를 완성하세요
//성능 : 속도(60%) + 연비(30%) + 안정성(10%)
//결과 : 평점 80 이상 -  우수, 70이상 - 보통 , 나머지 - 불량

//메소드를 이용하여 계산하세요 - 입력부, 연산부, 출력부
//차종, 속도, 연비, 안정성, 성능, 결과
// 차종 5개 이상







