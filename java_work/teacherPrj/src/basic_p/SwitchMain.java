package basic_p;

public class SwitchMain {

	public static void main(String[] args) {
		//switch 값 - 정수, 문자열, 문자
		//  boolean, 실수 사용불가
		switch("아기상어") {	}
		switch(1234) {	}
		//switch(true) {	}
		//switch(123.456) {	}
		
		switch(60) {	
			case 5:
				System.out.println("5 이지롱");
				break;
			case 30:
				System.out.println("30 이지롱");
				break;
			case 10:
				System.out.println("10 이지롱");
				break;
			case 40, 60:  // 40 or 60 진입
				System.out.println("40,60 이지롱");
				break;
			case 80:
				System.out.println("80 이지롱");
			break;
			//case 5:  같은 값 불가
		}
		
		System.out.println();	//줄바꿈
		System.out.println();
		System.out.println("나는무너");
		
		System.out.print("나는상어"); //줄바꿈하지 않음
		System.out.print("나는고래");
		System.out.print("나는날치");
		//System.out.print();  에러발생 

		/*
		 TSNMain
		 3.6.9 게임을 구현하세요
1-> 20
1
2
짝
4
5
짝
7
8
짝
10
11
12
짝
14
15
짝
17
18
짝
20
* */
		
	}

}
