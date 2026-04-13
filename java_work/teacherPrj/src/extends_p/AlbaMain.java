package extends_p;

import java.util.Arrays;

/*
AlbaMain
식당을 구현해주세요
카운터 - 계산(몇번테이블에 얼마를), 인사
홀 - 음식나르기(몇번테이블에 뭐를), 인사
주방 - 설겆이(그릇몇개를)
-> 구현객체 : 알바생
 * */

interface Hall{
	void serving(int no, String menu);
	void hello();
}
interface Counter{
	void cash(int no, int money);
	void hello();
}
interface Kitchen{
	void wash(int dish);
}

interface Restaurant extends Hall, Counter, Kitchen{}
class AlbaData{
	String name;
	//serving, hello,cash, wash 
	int [] cnt = new int[4];
		
	AlbaData(String name) {
;
		this.name = name;
	}



	void ppp() {
		System.out.println(name+Arrays.toString(cnt));
	}
}
class Alba implements Restaurant{
	AlbaData data;

	Alba(String name) {
		
		this.data = new AlbaData(name);
	}

	@Override
	public void serving(int no, String menu) {
		data.cnt[0]++;
		System.out.println(data.name+" "+no+"테이블에 "+menu+" 서빙해요");
	}

	@Override
	public void hello() {
		data.cnt[1]++;
		System.out.println(data.name+" 인사해요");
	}

	@Override
	public void cash(int no, int money) {
		data.cnt[2]++;
		System.out.println(data.name+" "+no+"테이블 "+money+" 계산해요");
	}

	@Override
	public void wash(int dish) {
		data.cnt[3]++;
		System.out.println(data.name+" "+dish+" 설거지해요");
	}
	
	
	
}

public class AlbaMain {

	public static void main(String[] args) {
		Hall hh;
		Counter cc;
		Kitchen kk;
		
		Alba [] albas = {
			new Alba("조보아"),
			new Alba("정인선"),
			new Alba("차은우")
		};
		
		hh = albas[0];
		cc = albas[1];
		kk = albas[2];
		
		hh.hello();
		cc.hello();
		hh.serving(1, "김치찌개");
		cc.cash(1, 7500);
		kk.wash(3);
		cc = albas[2];
		kk = albas[0];
		cc.hello();
		hh.serving(3, "된장찌개");
		kk.wash(5);
		for (Alba alba : albas) {
			alba.data.ppp();
		}
	}

}
