package extends_p;

//추상메소드 정의시 클래스에 abstract 필수
abstract class AbsPar{
	String a = "부모a";
	String b = "부모b";
	
	void meth_1() {
		System.out.println("부모 meth_1()");
	}
	//추상메소드 - 메소드의 선언만 존재
	//			메소드 정의부 작성 불가
	abstract void meth_2();
	
	//abstract void meth_3() {}
}


class AbsChild extends AbsPar{

	//abstract(추상)클래스 상속시 abstract(추상)메소드 overriding 필수
	@Override
	void meth_2() {
		System.out.println("자식 meth_2()");
	}
	
	
	
}
public class AbstractMain {

	public static void main(String[] args) {
		AbsPar pp = new AbsPar() {
			
			void meth_2() {
				System.out.println("생성시 meth_2() 재정의");
			}
			
			void meth_3() {
				System.out.println("생성시 meth_3() 정의");
			}
		};
		
		System.out.println("pp : "+pp.a+" , "+pp.b);
		pp.meth_1();
		pp.meth_2();
		//pp.meth_3();
	}

}

// DyShapeMain --> AbsShapeMain 새로 구현하세요
// abstract로 사용하고자 하는 요소를 찾아 넣으세요
