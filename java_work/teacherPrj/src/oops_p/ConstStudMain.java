package oops_p;

import java.util.Arrays;

class ConstStud{
	String kind, name;
	int [] jum;
	int tot;
	double avg;
	ConstStud(String kind, String name, int... jum) {
		
		this.kind = kind;
		this.name = name;
		this.jum = jum;
		calcTot();
	}
	
	void calcTot() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
	}
	
	void ppp() {
		String ttt = kind+"\t"+name+"\t"+Arrays.toString(jum)+"\t";
		if(kind=="일반") {
			ttt+="\t";
		}
		ttt+=tot+"\t"+avg;
		System.out.println(ttt);
	}
	
	ConstStud(String name, int kor, int eng, int mat) {
		this(          "일반",        name,    kor, eng, mat);
		//ConstStud(String kind, String name, int... jum     ) 
		
		avg = tot/jum.length;
	}
	
	ConstStud(String name, int kor, int eng, int mat, int art) {
		this(          "예체능",      name,     kor, eng, mat,art);
		//ConstStud(String kind, String name,  int... jum       ) 
		artCalc();
	}
	
	
	void artCalc() {
		double [] rate = {0.05,0.1,0.15,0.7};
		avg = 0;
		for (int i = 0; i < rate.length; i++) {
			
			avg += rate[i]*jum[i];
		}
	}
}

public class ConstStudMain {

	public static void main(String[] args) {
		ConstStud [] studs = {
				new ConstStud("정우성", 77,78,71),
				new ConstStud("정중성", 57,78,91),
				new ConstStud("북두신성", 97,78,51),
				new ConstStud("정좌성", 67,68,61,68),
				new ConstStud("정남성", 37,58,71,98),
				new ConstStud("정북성", 97,78,51,38)
		};

		for (ConstStud st : studs) {
			st.ppp();
		}
	}

}
