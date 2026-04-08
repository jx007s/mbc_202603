package extends_p;

class ExPar{
	String a = "부모a",b = "부모b";
	
	void meth_1() {
		System.out.println("부모 meth_1() 실행");
	}
	void meth_2() {
		System.out.println("부모 meth_2() 실행");
	}
}

class Uncle{}

/*
상속관계 정의
class 자식클래스명 extends 부모클래스명{}

자식클래스 : 부모클래스의 멤버접근가능
부모클래스 : 자식클래스의 멤버접근불가

1부모-> 다자식 : O
다부모-> 자식 : X
 * */

class ExChild1 extends ExPar { //, Uncle{ 다중상속 불가
	String c = "자식c";
	
	void meth_3() {
		System.out.println("자식 meth_3() 실행");
	}
}

class ExChild2 extends ExPar{
	String d = "자식2d";
	
	void meth_4() {
		System.out.println("자식2 meth_4() 실행");
	}
}

public class ExtendsMain {

	public static void main(String[] args) {
		ExPar pp = new ExPar();
		ExChild1 cc11 = new ExChild1();
		ExChild1 cc12 = new ExChild1();
		ExChild2 cc2 = new ExChild2();

		System.out.println("pp : "+pp.a+","+pp.b);
		//System.out.println("pp : "+pp.c);
		pp.meth_1();
		pp.meth_2();
		//pp.meth_3();
		
		
		cc11.a = "에이";
		System.out.println("cc11 : "+cc11.a+","+cc11.b);
		System.out.println("cc11 : "+cc11.c);
		//System.out.println("cc11 : "+cc11.d); 형제클래스 멤버 접근 불가
		cc11.meth_1();
		cc11.meth_2();
		cc11.meth_3();
		//cc11.meth_4(); 형제클래스 멤버 접근 불가
		System.out.println("cc12 : "+cc12.a+","+cc12.b+","+cc12.c);
		
		System.out.println("cc2 : "+cc2.a+","+cc2.b+","+cc2.d);
		//System.out.println("cc2 : "+cc2.c); 형제클래스 멤버 접근 불가
		cc2.meth_1();
		cc2.meth_2();
		//cc2.meth_3(); 형제클래스 멤버 접근 불가
		cc2.meth_4();
		
		
	}

}


/*
oops.ConShapeMain

도형 클래스를 구현하세요
인수의 갯수로 도형을 구분할 것
도형 : 사각형, 원
출력 : 도형(원, 사각형)의 넓이, 둘레
-----------------------------------------
사각형의 넓이 : 30, 둘레 : 22
원의 넓이 : ? , 둘레 : ?




oops.StaticCoffeeMain
커피 전문점을 구현하세요
        
 스타벅스,       커피빈

아메리카노:	2000    2100
아시아노:		2300    2500
아프리카노:	2700    2200


 지역별로 커피전문점이 존재

 스타벅스 - 서면,해운대,자살치

 커피빈 - 서면,광안리,가야
 
 
구현메소드 : 판매, 출력
 판매 : 메뉴,수량
 
 출력(지점별, 총판)
 각 커피판매수량

* */



