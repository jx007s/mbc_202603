package lang_p;

import java.util.Arrays;

public class StringMain {

	public static void main(String[] args) {
		//   "나는무너"   문자열 인스턴스를 생성하여 주소를 리턴한다. 
		String s1 = "나는무너";
		String s2 = "나는무너";
		String s3 = s1;
		String s4 = new String(s1);
		char [] arr = {'나','는','무','너'};
		String s5 = new String(arr);

		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		System.out.println("s4 : "+s4);
		System.out.println("s5 : "+s5);
		
		System.out.println("s1.toString() : "+s1.toString());
		System.out.println("s1.length() : "+s1.length()); //글자길이
		System.out.println("s1.equals(s2) : "+s1.equals(s2));
		System.out.println("s1==s2 : "+(s1==s2));
		System.out.println("s1.equals(s4) : "+s1.equals(s4));
		System.out.println("s1==s4 : "+(s1==s4));
		
		System.out.println("\"나는무너\".toString() : "+"나는무너".toString());
		
		System.out.println("\"나는무너\".length() : "+"나는무너".length()); //글자길이
		System.out.println("\"나는무너\".equals(s2) : "+"나는무너".equals(s2));
		System.out.println("\"나는무너\"==s2 : "+("나는무너"==s2));
		
		String a = "선생님은 귀여워요 aBcD eF JavA 만세 12a3a4";
		//          0 12 345 67 8901234567890123 45678901
		System.out.println(a);
		
		//정보추출
		System.out.println(a.length());
		//System.out.println(a[0]);
		char ch = a.charAt(31);
		System.out.println(ch);
		//ch = a.charAt(32);
		String sub = a.substring(7);  // 7~> 끝
		System.out.println(sub);
		sub = a.substring(7,12);  // 7~> 12-1
		System.out.println(sub);
		
		//검색
		// 누가 어디에 있는가?
		int pos = a.indexOf("a");	//앞에서부터 처음 나오는 "a" 위치
		System.out.println(pos);
		pos = a.indexOf("아기상어");	//존재하지 않을 경우 -1
		System.out.println(pos);
		pos = a.indexOf("a",11);  //11 위치부터 검색
		System.out.println(pos);
		pos = a.lastIndexOf("a");	//뒤에서부터 처음 나오는 "a" 위치
		System.out.println(pos);
		/*
		 내사진.jpg
         숙제.java
         aasseedd.파일.최종.진짜.마지막.끝.수정.1.ppt
		 * */
		String fname = "aaaa.bbb.cccccc.dd.eee.txt";
		pos = fname.lastIndexOf(".");
		System.out.println(pos);
		String ext = fname.substring(pos+1);
		System.out.println(ext);
		
		System.out.println(a.contains("Bc"));
		System.out.println(a.contains("아기상어")); 
		System.out.println(a.startsWith("선생님"));
		System.out.println(a.startsWith("귀여워요"));
		System.out.println(a.endsWith("3a4"));
		System.out.println(a.endsWith("선생님"));
		
		
		/// 문자열 -> 문자열배열
		String c = "피카츄,라이츄.파이리,._꼬부기_버터풀,야도란,피존또";
		String [] arr2 = c.split(","); //, 를 기준으로 나누어 배열
		System.out.println("----------------------------");
		for (String tt : arr2) {
			System.out.println(tt);
		}
		System.out.println("----------------------------");
		arr2 = c.split(",._"); // ,._ 로 묶인 부분만 나누기
		for (String tt : arr2) {
			System.out.println(tt);
		}
		System.out.println("----------------------------");
		
		arr2 = c.split("[,._]"); // , or . or _ 기준으로 나누어 배열
		for (String tt : arr2) {
			System.out.println(tt);
		}
		System.out.println("----------------------------");
		/// 문자열배열 -> 문자열
		String [] arr3 = {"광안리","자갈치","송정","해운대","이기대"};
		String d = String.join("&&", arr3);
		System.out.println(d);
		
		System.out.println(a);
		d = a.replaceAll("a", "에이");
		System.out.println(d);
		d = a.replaceFirst("a", "에이");
		System.out.println(d);
		d = "나는무너".repeat(5);
		System.out.println(d);
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		// 문자열 --> char 배열
		char [] arr4 = a.toCharArray();
		System.out.println(Arrays.toString(arr4));
		
		a = "     MBC 아카데미     ";
		System.out.println(a+": "+a.length());
		System.out.println(a.trim()+": "+a.trim().length());
		
		
		
		//"aBcd Efg HIJk lMn opQR" -> Abcd Efg Hijk Lmn Opqr  로 변경해 주세요
		//"lMn aBcd HIJk opQR  Efg" -> GFe rqPO Kjih DCbA NmL  로 변경해 주세요
		
		c = "aBcd Efg HIJk lMn opQR";
		arr2 = c.toLowerCase().split(" ");
		for (int i =0; i<arr2.length;i++) {
			String tt = arr2[i];
			System.out.println(tt);
			arr2[i] = tt.substring(0,1).toUpperCase()+tt.substring(1);
		}
		d = String.join(" " ,arr2);
		System.out.println(d);
		System.out.println("----------------------------");
		c = "lMn aBcd HIJk opQR  Efg";
		arr4 = c.toCharArray();
		System.out.println(c);
		System.out.println(Arrays.toString(arr4));
		int gap ='a'-'A';
		String res = "";
		for (int i = arr4.length-1; i >=0; i--) {
			char hh = arr4[i];
			char nhh = hh;
			if(hh>='A') {
				
				if(hh>='a') {
					nhh -= gap;
				}else {
					nhh += gap;
				}
				
			}
			res += nhh;
		}
		System.out.println(res);
	}

}
