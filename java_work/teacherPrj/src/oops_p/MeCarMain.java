package oops_p;
//자동차 성능 테스트 클래스를 완성하세요
//성능 : 속도(60%) + 연비(30%) + 안정성(10%)
//결과 : 평점 80 이상 -  우수, 70이상 - 보통 , 나머지 - 불량

import java.util.Arrays;

//메소드를 이용하여 계산하세요 - 입력부, 연산부, 출력부
//차종, 속도, 연비, 안정성, 성능, 결과
//차종 5개 이상

class MeCarProvider{
	MeCar make(String title, int speed, int fuel, int safe) {
		MeCar ret = new MeCar();
		ret.input(title, speed, fuel, safe);
		return ret;
	}
}

class MeCar{
	String title;
	int [] jum;
	int performance;
	String res;
	
	void input(String title, int speed, int fuel, int safe) {
		this.title = title;
		jum = new int [] { speed, fuel, safe};
		calc();
	}
	
	void calc() {
		double [] rate = {0.6, 0.3, 0.1};
		
		double tot = 0;
		for (int i = 0; i < rate.length; i++) {
			tot += rate[i] * jum[i];
		}
		
		performance = (int)tot;
		if(performance >= 80) {
			res = "우수";
		}else if(performance >= 70) {
			res = "보통";
		}else {
			res = "불량";
		}	
	}
	
	//3. 출력부
	void ppp() {
		String ttt = title+"\t"+
				Arrays.toString(jum)+"\t"+
				performance+"\t"+res;
		System.out.println(ttt);
	}
}

public class MeCarMain {

	public static void main(String[] args) {
		/*
		MeCar [] cars = new MeCar[5];
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new MeCar();
		}
		cars[0].input("아반떼", 96, 71, 52);
		cars[1].input("삼각떼", 56, 73, 99);
		cars[2].input("왜그랬때", 77,78,76);
		cars[3].input("그랜져", 87,89,85);
		cars[4].input("안그랜져", 65,67,62);
		*/
		
		MeCarProvider provider = new MeCarProvider();
		MeCar [] cars = {
			provider.make("아반떼", 96, 71, 52),
			provider.make("삼각떼", 56, 73, 99),
			provider.make("왜그랬때", 77,78,76),
			provider.make("그랜져", 87,89,85),
			provider.make("안그랜져", 65,67,62)	
		};
		
		for (MeCar car : cars) {
			car.ppp();
		}

	}

}
