package extends_p;

class DyPar{
	String a = "부모a", b="부모b";
	void meth_1() {
		System.out.println("부모meth_1 : "+a+","+b);
	}
	void meth_2() {
		System.out.println("부모meth_2 : "+a+","+b);
	}
}
class DyChild extends DyPar{
	String c = "자식c", b="자식b";
	void meth_3() {
		System.out.println("자식meth_3 : "+a+","+b+","+c);
	}
	void meth_2() {
		System.out.println("자식meth_2 : "+a+","+b+","+c);
	}
}

class DyUncle{
	
}


public class DynamicMain {

	public static void main(String[] args) {
		
		//자료형 변수명;  
		//자료형: 자료형으로 인식하겠다
		//클래스명 변수명 = 생성된 인스턴스
		// 생성된인스턴스의 주소 --> 변수 --> 변수는 클래스 형태로 보겠다
		DyPar pp = new DyPar();
		DyPar pc = new DyChild();
		//DyChild cp = new DyPar();
		DyChild cc = new DyChild();
		
		//System.out.println("pp : "+pp.a+","+pp.b+","+pp.c);
		System.out.println("pp : "+pp.a+","+pp.b);
		pp.meth_1();
		pp.meth_2();
		//pp.meth_3();
		
		//System.out.println("pc : "+pc.a+","+pc.b+","+pc.c);
		System.out.println("pc : "+pc.a+","+pc.b);
		pc.meth_1();
		pc.meth_2();//자식에서 overriding 된 메소드 호출
		//pc.meth_3();
		
		cc.a="아기상어";
		cc.b="엄마상어";
		cc.c="아빠상어";
		System.out.println("cc : "+cc.a+","+cc.b+","+cc.c);
		cc.meth_1();
		cc.meth_2();//자식에서 overriding 된 메소드 호출
		cc.meth_3();
		
		DyPar pcc = cc;	//형변환  upcasting
		//System.out.println("pcc : "+pcc.a+","+pcc.b+","+pcc.c);
		System.out.println("pcc : "+pcc.a+","+pcc.b);
		pcc.meth_1();
		pcc.meth_2();
		//pcc.meth_3();
		
		DyChild cpcc = (DyChild)pcc;  //down casting
		System.out.println("cpcc : "+cpcc.a+","+cpcc.b+","+cpcc.c);
		cpcc.meth_1();
		cpcc.meth_2();
		cpcc.meth_3();
		
		//DyChild cpp = (DyChild)pp;  생성된 인스턴스가 형변환이 가능해야 한다.
		
		// instanceof 형변환가능여부
		System.out.println(pp instanceof DyPar);
		System.out.println(pp instanceof DyChild);
		System.out.println(cc instanceof DyPar);
		System.out.println(cc instanceof DyChild);
		// 상속관계에서만 확인 가능
		//System.out.println(pp instanceof DyUncle);
	}

}
