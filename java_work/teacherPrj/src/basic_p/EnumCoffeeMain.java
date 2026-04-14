package basic_p;

import java.util.Arrays;

enum ECoffee{
	
	아메리카노(2000), 아프리카노(2100), 아시아노(2400);
	
	int cnt=0;
	final int price;
	
	private ECoffee(int price) {
		this.price = price;
	}
	
	void ppp() {
		System.out.println(name()+"\t"+price+"\t"+cnt+"\t"+price*cnt);
	}
	
}
public class EnumCoffeeMain {
	
	static void order(String ...menus) {
		int tot = 0;
		for (String menu : menus) {
			ECoffee cf = ECoffee.valueOf(menu);
			tot += cf.price;
			cf.cnt++;
		}
		System.out.println(Arrays.toString(menus)+tot);
	}

	public static void main(String[] args) {
		order("아메리카노","아메리카노","아프리카노");
		order("아프리카노","아메리카노","아프리카노");
		order("아시아노","아시아노");
		order("아시아노","아메리카노","아프리카노");
		
		
		for (ECoffee cf : ECoffee.values()) {
			cf.ppp();
		}
	}

}

/*
EnumSawonMain
직급별 상여율
사장(100), 부장(170), 과장(150), 대리(200), 사원(120)
이름 직급 기본급 

장동건 사원 300
장서건 과장 300
장남건 사장 300
장중건 대리 300
북두신건 부장 300
이효리 과장 400
삼효리 대리 500
사효리 사원 200
오효리 부장 500


출력
직급 이름 기본급 월급
 * */


