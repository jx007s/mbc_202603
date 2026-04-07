package oops_p;

import java.util.Arrays;

class ClaRetMem{
	String name;
	int age;
	boolean marriage;
	
	void input(String name,	int age, boolean marriage) {
		this.name = name;
		this.age = age;
		this.marriage = marriage;
	}
	
	void ppp() {
		System.out.println(name+","+age+","+marriage);
	}
}

class ClaRet{
	void meth_1() {
		System.out.println("meth_1 실행 1");
		System.out.println("meth_1 실행 2");
		return;
		// return 뒤에 실행 구문 불가
		//System.out.println("meth_1 실행 3");
	}
	
	void meth_2(int a) {
		System.out.println("meth_2 실행 1");
		if(a >= 100) {
			return;		//메소드 탈출 시점으로 사용
		}
		System.out.println("meth_2 실행 2");
		if(a >= 50) {
			return;
		}
		System.out.println("meth_2 실행 3");
	}
	
	int meth_3() {
		System.out.println("meth_3 실행");
		return 1234;
	}
	int [] meth_4() {
		System.out.println("meth_4 실행");
		int [] ret = {11,22,33,44};
		return ret;
	}
	
	ClaRetMem meth_5() {
		System.out.println("meth_5 실행");
		ClaRetMem ret = new ClaRetMem();
		ret.input("진양철", 65, true);
		return ret;
	}
	
}

public class ReturnMain {

	public static void main(String[] args) {
		ClaRet cr = new ClaRet();
		cr.meth_1();
		System.out.println("--------");
		cr.meth_2(120);
		System.out.println("--------");
		cr.meth_2(80);
		System.out.println("--------");
		cr.meth_2(30);
		int r3 = cr.meth_3();
		System.out.println("r3 : "+r3);
		int [] r4 = cr.meth_4();	//배열생성1
		System.out.println("r4 : "+Arrays.toString(r4));
		r4[1] = 2345;
		System.out.println("r4 : "+Arrays.toString(r4));
		
		// 메소드 호출 및 리턴 마다 배열 생성
		//배열생성2
		System.out.println("cr.meth_4() : "+Arrays.toString(cr.meth_4()));
		//배열생성3
		System.out.println("cr.meth_4()[2] : "+cr.meth_4()[2]);
		//배열생성4
		cr.meth_4()[2] = 3456;
		//배열생성5
		System.out.println("cr.meth_4()[2] : "+cr.meth_4()[2]);
		
		ClaRetMem r5 = cr.meth_5();
		r5.ppp();
	}

}
