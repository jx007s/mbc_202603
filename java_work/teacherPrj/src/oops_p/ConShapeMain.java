package oops_p;
/*
도형 클래스를 구현하세요
인수의 갯수로 도형을 구분할 것
도형 : 사각형, 원
출력 : 도형(원, 사각형)의 넓이, 둘레
-----------------------------------------
사각형의 넓이 : 30, 둘레 : 22
원의 넓이 : ? , 둘레 : ?

 * */
class ConShape{
	// 상수초기화는 상수선언시 초기화 혹은 생성자에서 대입에서 처리
	// 두가지 모두 처리할 경우 에러
	final String KIND;
	int area, border;
	
	ConShape(int w, int h) {
		KIND = "직사각형";
		area = w* h;
		border = (w+h)*2;
	}
	
	ConShape(int r) {
		KIND = "원";
		final double PI = 3.141592;
		area = (int)(PI*r*r);
		border = (int)(PI*r*2);
	}
	
	void ppp() {
		String ttt = KIND+"의 넓이 : "+area+" , 둘레 : "+border;
		System.out.println(ttt);
		
		//void meth() {} 메소드 정의부에서 메소드 정의 불가
	}
}
public class ConShapeMain {

	public static void main(String[] args) {
		ConShape [] arr = {
			new ConShape(5),
			new ConShape(5,6),
			new ConShape(10,20),
			new ConShape(8),
			new ConShape(7),
			new ConShape(6,6)
		};
		
		for (ConShape shape : arr) {
			shape.ppp();
		}

	}

}
