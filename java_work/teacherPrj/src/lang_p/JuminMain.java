package lang_p;

import java.util.Arrays;

public class JuminMain {

	public static void main(String[] args) {
		String jumin = "970320-8234567";

		//int num = Integer.parseInt("235");
		//System.out.println(num);
		int [] birth = {
				Integer.parseInt(jumin.substring(0,2)),
				Integer.parseInt(jumin.substring(2,4)),
				Integer.parseInt(jumin.substring(4,6))
		};
		
		int p = jumin.charAt(7)-'0';
		System.out.println(p);
		
/*
			-1	%4	/2	+19	*100
1900	1	0	0	0	19
		2	1	1	0
2000	3	2	2	1	20
		4	3	3	1
----------------------------------------------		
1900	5	4	0
		6	5	1
2000	7	6	2
		8 	7	3
 * */		
		//int year = ((p-1)	%4	/2	+19)	*100;
		//System.out.println(year);
		birth[0]+= ((p-1)	%4	/2	+19)	*100;
		System.out.println(Arrays.toString(birth));
		String title = "년월일";
		String ttt = "";
		for (int i = 0; i < title.length(); i++) {
			ttt+=birth[i]+""+title.charAt(i);
		}
		System.out.println(ttt);
		
		
	}

}
/*
성별, 국적, 생년월일, 한국나이, 만나이, 올해생일, 다가올 생일, 생일파티 DDay를

 출력하세요


1. 1900 년대 내국인 남성
2. 1900 년대 내국인 여성
########################
3. 2000 년대 내국인 남성
4. 2000 년대 내국인 여성
########################
-----------------------------------------------------
5. 1900 년대 외국인 남성
6. 1900 년대 외국인 여성
########################
7. 2000 년대 외국인 남성
8. 2000 년대 외국인 여성

 * */
