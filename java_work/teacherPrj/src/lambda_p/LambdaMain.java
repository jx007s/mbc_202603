package lambda_p;

interface QQ1{
	void zxcv(int a, int b);
}
/*
람다식 불가
* 인터페이스의 메소드가 2개이기때문에 어느것을 정의 및 호출하는지 알수 없음
* */
interface QQ2{
	void zxcv(int a, int b);
	void asdf(int a, int b);
}

interface QQ3{
	void zxcv(int a);
}
interface QQ4{
	void zxcv();
}
interface QQ5{
	String zxcv();
}

public class LambdaMain {
	
	void p2r0(QQ1 qq1) {
		System.out.println("p2r0 시작---");
		qq1.zxcv(10, 20);
		System.out.println("p2r0 끝---");
	}
	
	void notLambda(QQ2 qq2) {
		System.out.println("notLambda 시작---");
		qq2.zxcv(10, 20);
		System.out.println("notLambda 끝---");
	}
	
	void p1r0(QQ3 qq3) {
		System.out.println("p1r0 시작---");
		qq3.zxcv(10);
		System.out.println("p1r0 끝---");
	}
	
	void p0r0(QQ4 qq4) {
		System.out.println("p0r0 시작---");
		qq4.zxcv();
		System.out.println("p0r0 끝---");
	}
	
	void p0rStr(QQ5 qq5) {
		System.out.println("p0rStr 시작---");
		String res = qq5.zxcv();
		System.out.println("p0rStr 끝---"+res);
	}
	
	LambdaMain() {
		System.out.println("LambdaMain 생성자");
		
		p2r0(new QQ1() {
			@Override
			public void zxcv(int a, int b) {
				System.out.println("인터페이스 생성시재정의 메소드 :"+a+","+b);
			}
		});
		
		p2r0((a,b)->{ 
				System.out.println("람다식 정의 메소드 : "+a+","+b);
			}
		);
		p2r0((a,b)-> System.out.println("람다식 {} 생략 : "+a+","+b) );
		
		notLambda(new QQ2() {

			@Override
			public void zxcv(int a, int b) {
				System.out.println("QQ2 생성시재정의 zxcv :"+a+","+b);
			}

			@Override
			public void asdf(int a, int b) {
				System.out.println("QQ2 생성시재정의 asdf :"+a+","+b);
			}
			
		});
		
		/* 
		 * 람다식 불가
		 * 인터페이스의 메소드가 2개이기때문에 어느것을 정의 및 호출하는지 알수 없음
		notLambda((a,b)->{ 
			System.out.println("람다식 정의 메소드 : "+a+","+b);
		});*/
		
		p1r0(a -> System.out.println("매개변수 1개 () 생략 : "+a) );
		
		p0r0(() -> System.out.println("매개변수 없음 ") );
		
		p0rStr(() -> {
			System.out.println("리턴 존재");
			return "아기상어";
		});
		
		// 다른 실행문없이 바로 리턴인 경우 {}  return  ; 모두 동시생략
		p0rStr(() -> "엄마상어");
	}

	public static void main(String[] args) {
		new LambdaMain();
	}

}
