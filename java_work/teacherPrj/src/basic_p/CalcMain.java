package basic_p;

public class CalcMain {

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println(a >  b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a <  b);
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println("---------------------");
		char a2 = 'a', b2 = 'b';
		System.out.println(a2 >  b2);
		System.out.println(a2 >= b2);
		System.out.println(a2 <= b2);
		System.out.println(a2 <  b2);
		System.out.println(a2 == b2);
		System.out.println(a2 != b2);
		System.out.println("---------------------");
		
		double a3 = 123.456, b3 = 456.321;
		System.out.println(a3 >  b3);
		System.out.println(a3 >= b3);
		System.out.println(a3 <= b3);
		System.out.println(a3 <  b3);
		System.out.println(a3 == b3);
		System.out.println(a3 != b3);
		System.out.println("---------------------");
		
		String a4 = "아기상어", b4 = "엄마상어";
//		System.out.println(a4 >  b4);  String 크기 비교 불가
//		System.out.println(a4 >= b4);
//		System.out.println(a4 <= b4);
//		System.out.println(a4 <  b4);
		System.out.println(a4 == b4);
		System.out.println(a4 != b4);
		System.out.println("---------------------");
		
		boolean a5 = true, b5 = false;
//		System.out.println(a5 >  b5); boolean 크기 비교 불가
//		System.out.println(a5 >= b5);
//		System.out.println(a5 <= b5);
//		System.out.println(a5 <  b5);
		System.out.println(a5 == b5);
		System.out.println(a5 != b5);
		System.out.println("---------------------");
		// 숫자 - 다른 자료형과 크기비교 가능
		// 정수, 실수, 문자 모두 크기비교 가능
		// String, boolean 다른 자료형과 비교 불가
		//System.out.println(a >  b4);
		//System.out.println(a >= b4);
		//System.out.println(a <= b4);
		//System.out.println(a <  b4);
		//System.out.println(a == b4);
		//System.out.println(a != b4);

	}

}
