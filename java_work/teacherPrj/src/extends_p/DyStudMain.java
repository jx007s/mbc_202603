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
}

class DyArt extends DyStud{
	
	public DyArt(String name, int kor, int eng, int mat, int art) {
		super("예체능",name);
		jum = new int[] {kor, eng, mat, art};
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
			st.ppp();
		}

	}

}
