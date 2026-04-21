package coll_p;

// Generic :  타입 추상화
// T1, T2, T3 :: Object 형태의 타입을 지정
//               기본자료형 불가
//               객체변수 선언 , 생성시 지정하여 반영 --> 지정하지 않을 경우 Object
class GenAAA<T1, T2, T3>{
	
	String a;
	int b;
	T1 tt11, tt12;
	T2 tt2;
	T3 tt3;
	GenAAA(String a, int b, T1 tt11, T1 tt12, T2 tt2, T3 tt3) {

		this.a = a;
		this.b = b;
		this.tt11 = tt11;
		this.tt12 = tt12;
		this.tt2 = tt2;
		this.tt3 = tt3;
	}
	@Override
	public String toString() {
		return "GenAAA [a=" + a + ", b=" + b + ", tt11=" + tt11 + ", tt12=" + tt12 + ", tt2=" + tt2 + ", tt3=" + tt3
				+ "]";
	}
	
	
}

public class GenericMain {

	public static void main(String[] args) {
		GenAAA a1 = new GenAAA("아기상어", 10, "엄마상어", 123, true, 789.456);
		GenAAA<String, String, Integer> a2 = new GenAAA("아기상어", 10, "엄마상어", 123, true, 789.456);
		GenAAA<String, String, Integer> a3 = 
				new GenAAA<String, String, Integer>("아빠상어", 20, "할머니상어", "할아버지상어", "삼촌상어", 9012);
		System.out.println(a1);
		System.out.println(a2);
		a1.a = "나는무너";
		a1.b = 1122;
		a1.tt11 = true;
		a1.tt12 = new int[3];
		a1.tt2 = 123.456;
		a1.tt3 = new MapStud(1, "정우성", "남",67,78,89);
		
		a2.a = "나는무너";
		a2.b = 1122;
		//Generic 에 따라 선언시 지정한 자료형으로 사용해야 한다.
//		a2.tt11 = true;
//		a2.tt12 = new int[3];
//		a2.tt2 = 123.456;
//		a2.tt3 = new MapStud(1, "정우성", "남",67,78,89);
		
		a2.tt11 = "나는상어";
		a2.tt12 = "나는고래";
		a2.tt2 = "나는징어";
		a2.tt3 = 5678;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}

}
