package basic_p;

// enum 정의
// enum enum명{}
enum EAAA{
	aa,bb,cc,dd  //열거 상수
//  0   1  2  3
}


enum EBB{
	//열거원소를 생성자 정의에 맞게 처리
	// 마지막 ; 필수
	OH("오수민",27,"여"), KKS("김광수",32,"남"), KSM("김승민",26,"남"), PJH("박준희",33,"남");
	
	
	//클래스처럼 멤버변수와 메소드 정의
	// toString() 생성자도 정의
	String pname;
	int age;
	final String gender;
	
	void meth() {
		System.out.println(name()+" "+pname+" meth() 실행");
	}

	EBB(String pname, int age, String gender) {
		this.pname = pname;
		this.age = age;
		this.gender = gender;
		System.out.println(name()+" 생성");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "EBB ["+name()+" , "+pname+" , "+age+" , "+gender+"]";
	}
}

public class EnumMain {

	public static void main(String[] args) {

		//System.out.println(EAAA);
		System.out.println(EAAA.aa);
		System.out.println(EAAA.bb);
		System.out.println(EAAA.cc);
		System.out.println(EAAA.dd);
		//System.out.println(EAAA.ee);
		
		EAAA a1; // enum 변수 선언
		a1 = EAAA.aa;
		System.out.println(a1);
		//EAAA a2 = new EAAA();  동적할당 불가
		
		String tt = a1.name(); //리턴이 String
		//tt = a1;
		System.out.println(tt);
		System.out.println(a1.ordinal()); //열거원소의 순서
		a1 = EAAA.valueOf("bb"); //문자열로 열거원소 호출
		System.out.println(a1);
		System.out.println("--------------------");
		EAAA [] arr = EAAA.values();
		for (EAAA ea : arr) {
			System.out.println(ea+","+ea.ordinal());
		}
		System.out.println("--------------------");
		
		// compareTo(대상체) : 대상체와 순서 비교
		// 음수 < 0 < 양수
		System.out.println(EAAA.bb.compareTo(EAAA.aa));  // 1 : bb가 aa 보다 뒤에  aa < bb
		System.out.println(EAAA.bb.compareTo(EAAA.bb));  // 0 : bb가 bb 와 같음
		System.out.println(EAAA.bb.compareTo(EAAA.cc));  // -1 : bb가 cc 보다 앞에 bb < cc
		System.out.println(EAAA.bb.compareTo(EAAA.dd));  // -2 : bb가 cc 보다 앞에 bb < dd

		System.out.println("EBB--------------------");
		System.out.println(EBB.OH); //toString() 호출
		System.out.println(EBB.KKS);
		System.out.println(EBB.KSM);
		System.out.println(EBB.PJH);
		System.out.println("--------------------");
		EBB.OH.pname = "육수민";
		//EBB.OH.gender = "IT";
		System.out.println(EBB.OH); 
		EBB.OH.meth();
		System.out.println(EBB.OH.ordinal()); //열거원소의 순서
		System.out.println(EBB.OH.name());
		EBB b1 = EBB.valueOf("KKS"); //문자열로 열거원소 호출
		System.out.println(b1);
	}

}
