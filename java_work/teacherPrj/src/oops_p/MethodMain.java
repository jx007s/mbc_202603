package oops_p;

import java.util.Arrays;

class ClaMeth{
	
	void meth_1() {
		System.out.println("meth_1 : param X, ret X");
		return;
	}
	
	void meth_2(String aa, int bb) {
		System.out.println("meth_2 : "+aa+","+bb+", ret X");
		// void 일 경우 return 생략 가능
	}
	
	String meth_3() {
		System.out.println("meth_3 : param X, ret O");
		return "m3리턴값이지롱"; //리턴형 지정시 반드시 return 해야 한다.
	}
	
	String  meth_4(String aa, int bb) {
		System.out.println("meth_4 : "+aa+","+bb+", ret O");
		return "m4리턴값이지롱"; 
	}
	
	String a = "멤버a";
	String c = "멤버c";
	
	String  meth_5(String aa, int bb) {
		String aaa = "지역aaa";
		//String bb = "지역bb"; 지역, 매개 중첩불가
		String c = "지역c";  // 지역변수(매개변수) 와 멤버변수 중첩가능
		// 접근 우선순위 : 지역(매개) > 멤버
		
		System.out.println("meth_5 시작 ----- ");
		System.out.println(a+ " , "+aa+ " , "+aaa+ " , "+c+ " , "+this.c);
		// this : 객체자신을 지칭하는 예약어
		// this.멤버요소
		System.out.println("this : "+this+ " , "+this.a+ " , "+this.c);
		if(true) {
			String inA = "inA";  //내부지역변수 if 문에서만 존재
			//String aaa = "in_aaa";  내부지역변수와 외부지역변수 중첩불가
			System.out.println("if :"+ a+ " , "+aa+ " , "+aaa+ " , "+inA);
		}
		//inA if구간으로 나올때 소멸
		//System.out.println(a+ " , "+aa+ " , "+aaa+ " , "+inA); 
		System.out.println("meth_5 끝 ----- ");
		return "m5리턴값이지롱"; 
	}
	
	
	void  meth_6(String aa, int [] arr) {
		System.out.println("meth_6 : "+aa+","+Arrays.toString(arr));
		 
	}
	
	void  meth_7(String aa, int ... arr) {
		System.out.println("meth_7 : "+aa+","+Arrays.toString(arr));
	}
	/*
	void  meth_8(String aa, int bb = 100) {
		System.out.println("meth_8 : 매개변수 초기값 불가");	 
	}*/
}

public class MethodMain {

	public static void main(String[] args) {
		ClaMeth cm1 = new ClaMeth();
		cm1.meth_1();
		//cm1.meth_1(1234); 인수를 맞추어서 호출해야 한다
		//String rr = cm1.meth_1(); 리턴형에 맞추어 대입해야 한다 
		//cm1.meth_2();
		cm1.meth_2("아기상어", 100);
		String rr = cm1.meth_3();
		System.out.println("rr : "+rr);
		rr = cm1.meth_4("엄마상어", 200);
		System.out.println("rr : "+rr);
		rr = cm1.meth_5("매개aa", 300);
		System.out.println("rr : "+rr);
		// 메소드 내 매개변수, 지역변수 접근 불가
		//System.out.println("main :"+cm1.a+ " , "+cm1.aa+ " , "+cm1.aaa);
		System.out.println("main :"+cm1.a);
		//System.out.println("cm1.this : "+cm1.this); this - 클래스 정의부에서만 사용
		
		int [] qqq = {111,222,333,444};
		cm1.meth_6("아빠상어", qqq);
		cm1.meth_7("할머니상어", qqq);
		//cm1.meth_6("할아버지상어", 999,888,777);  배열매개변수에 직접 입력불가
		cm1.meth_7("삼촌상어", 999,888,777);  // arr = new int[]{999,888,777}
				// 가변매개변수(스프레드연산자) : 매개변수 이후의 값을 모두 배열원소로 처리
		
	}

}
