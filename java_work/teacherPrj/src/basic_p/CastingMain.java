package basic_p;

public class CastingMain {

	public static void main(String[] args) {
		System.out.println("정수<-->정수");
		byte bb = 123;
		short sh = bb; // 묵시적 형변환 (자동 형변환, up casting)
		int i = sh;
		long ll = i;
		System.out.println(bb+","+sh+","+i+","+ll);
		
		sh = 100;
		sh = 129;
		bb = (byte)sh;	// 명시적 형변환 (강제 형변환, down casting)
/*
 * 			byte(1byte)				short(2byte)
            0000 0000   0       0   0000 0000 0000 0000
            0000 0001   1       1   0000 0000 0000 0001
            0000 0010   2       2   0000 0000 0000 0010
            0000 0011   3       3   0000 0000 0000 0011
                        ......
            0111 1110   126     126 0000 0000 0111 1110   
            0111 1111   127     127 0000 0000 0111 1111
            1000 0000   -128    128 0000 0000 1000 0000
            1000 0001   -127    129 0000 0000 1000 0001
            1000 0010   -126    130 0000 0000 1000 0010
            1111 1101   -3      253 0000 0000 1111 1101
            1111 1110   -2      254 0000 0000 1111 1110
            1111 1111   -1      255 0000 0000 1111 1111
          1 0000 0000   0       256 0000 0001 0000 0000
 * */		
		
		ll = 12345;
		i = (int)ll;
		System.out.println(bb+","+sh+","+i+","+ll);
		
		System.out.println("정수<-->실수");
		i = 1357;
		double dd = i;	// 묵시적 형변환 : dd 대입시 .0 자동처리
		System.out.println(i+","+dd);
		dd = 123.456;
		i = (int)dd;	//명시적 형변환 : i 대입시 소숫점 이하 절삭
		System.out.println(i+","+dd);// 123
		dd = 123.987;
		i = (int)dd;	// 반올림 하지 않음 
		System.out.println(i+","+dd);//123
		dd = -123.456;
		i = (int)dd;	// 내림이나 올림 하지 않음
		System.out.println(i+","+dd);//123
		dd = -123.987;
		i = (int)dd;	//
		System.out.println(i+","+dd);//123
		
		System.out.println("숫자,문자,문자열<-->boolean  형변환 불가");
		boolean bo = true;
		//i = (int)bo;
		i = 0;
		//bo = (boolean)i;
		//String ttt = (String)bo;
		
		System.out.println("정수<-->문자");
		char ch = '나';
		i = ch;	//묵시적 형변환 (문자 -> 정수: byte, short 제외)
		System.out.println(i+","+ch);
		bb = (byte)ch;	//명시적 형변환 (문자 -> 정수: byte, short 제외)
		System.out.println(bb+","+ch);
		sh = (short)ch;	//명시적 형변환 (문자 -> 정수: byte, short 제외)
		System.out.println(sh+","+ch);
		i = 100;		
		ch = (char)i;	// 명시적 형변환  (정수 -> 문자)
		System.out.println(i+","+ch);
		bb = 103;
		ch = (char)bb;
		System.out.println(bb+","+ch);
		
	}

}
