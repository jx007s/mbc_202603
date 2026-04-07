package oops_p;

import java.util.Arrays;

class OverStud{
	String kind, name;
	int [] jum;
	int tot;
	double avg;
	
	void input(String name, int kor, int eng, int mat) {
		kind = "일반";
		this.name = name;
		jum = new int[] {kor, eng,mat};
		genCalc();
	}
	
	void genCalc() {
		tot = 0;
		for (int i : jum) {
			tot+=i;
		}
		avg = tot/jum.length;
	}
	
	void artCalc() {
		double [] rate = {0.05,0.1,0.15,0.7};
		avg = 0;
		for (int i = 0; i < rate.length; i++) {
			
			avg += rate[i]*jum[i];
		}
	}
	
	
	
	void input(String name, int kor, int eng, int mat, int art) {
		kind = "예체능";
		this.name = name;
		jum = new int[] {kor, eng,mat,art};
		genCalc();
		artCalc();
	}
	
	void ppp() {
		String ttt = kind+"\t"+name+"\t"+Arrays.toString(jum)+"\t"+tot+"\t"+avg;
		System.out.println(ttt);
	}
}

public class OverStudMain {

	public static void main(String[] args) {
		OverStud ost = new OverStud();
		ost.input("정우성", 77,78,71);
		ost.ppp();
		ost.input("정중성", 57,78,91);
		ost.ppp();
		ost.input("북두신성", 97,78,51);
		ost.ppp();
		ost.input("정좌성", 67,68,61,68);
		ost.ppp();
		ost.input("정남성", 37,58,71,98);
		ost.ppp();
		ost.input("정북성", 97,78,51,38);
		ost.ppp();
	}

}

// OverShapeMain
///// 도형클래스를 제작하고 input() 의 인수에 따라 
////원, 사각형을 구분하여넓이, 둘레길이를  출력하세요


