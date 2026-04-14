package lang_p;

import java.util.Scanner;

public class MathMain {

	public static void main(String[] args) {
		// Math.random() : 난수  :: 0< x < 1
		System.out.println(Math.random()*5);
		int no = (int)(Math.random()*5); // 0,1,2,3,4 
		System.out.println(no);
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println("ceil(올림)----------------");
		System.out.println(Math.ceil(123.456));
		System.out.println(Math.ceil(-123.456));
		System.out.println(Math.ceil(987.654));
		System.out.println(Math.ceil(-987.654));
		
		System.out.println("floor(내림)----------------");
		System.out.println(Math.floor(123.456));
		System.out.println(Math.floor(-123.456));
		System.out.println(Math.floor(987.654));
		System.out.println(Math.floor(-987.654));

		System.out.println("round(반올림)----------------");
		System.out.println(Math.round(123.456));
		System.out.println(Math.round(-123.456));
		System.out.println(Math.round(987.654));
		System.out.println(Math.round(-987.654));
		
		System.out.println("abs(절대값)----------------");
		System.out.println(Math.abs(123.456));
		System.out.println(Math.abs(-123.456));
		
		System.out.println("max_min----------------");
		System.out.println(Math.max(10,20));
		System.out.println(Math.min(10,20));
		
		System.out.println("sin_cos_tan_atan2----------------");
		System.out.println(Math.sin(30));
		System.out.println(Math.sin(30*Math.PI/180));
		System.out.println(Math.cos(30*Math.PI/180));
		System.out.println(Math.tan(30*Math.PI/180));
		
		System.out.println(Math.atan2(1,1));
		System.out.println(180*Math.atan2(1,1)/Math.PI);
		
		System.out.println("지수,로그,pow,sqrt----------------");
		System.out.println(Math.exp(1));
		System.out.println(Math.log(10));
		System.out.println(Math.pow(2,4));
		System.out.println(Math.sqrt(2));
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력:");
		String tt;
//		tt = sc.next();  엔터 or 공백으로 문자열 자름
//		System.out.println("tt : "+tt);
//		tt = sc.next();
//		System.out.println("tt : "+tt);
//		tt = sc.next();
//		System.out.println("tt : "+tt);
//		tt = sc.nextLine();   //엔터만 종결 구분 (공백을 글자로 처리)
//		System.out.println("tt : "+tt);
//		tt = sc.nextLine();
//		System.out.println("tt : "+tt);
//		tt = sc.nextLine();
//		System.out.println("tt : "+tt);
		
//		int i = sc.nextInt();
//		System.out.println(i);
		double dd = sc.nextDouble(); //입력시 엔터를 제외한 내용만 변수에 대입
		// 입력버퍼에 엔터가 남아있음
		System.out.println(dd);
		tt = sc.nextLine();   //남은 엔터 버퍼를 받음(실제 입력이 안됨)
		System.out.println("tt : "+tt);
	}

}
