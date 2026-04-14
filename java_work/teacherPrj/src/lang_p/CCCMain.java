package lang_p;

import java.util.Scanner;

public class CCCMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[[[추억의 게임 참참참]]]");
		String [] title = {"왼쪽","오른쪽"};

		while(true) {
			System.out.print("0:왼쪽, 1:오른쪽 2:종료 - 입력 :");
			int me = sc.nextInt();
			if(me==2) {
				break;
			}
			
			int com = (int)(Math.random()*2);
			String res = "패";
			if(me==com) {
				res = "승";
			}
			System.out.println("게이머:"+title[me]);
			System.out.println("컴퓨터:"+title[com]);
			System.out.println("결과:"+res);
			
		}
		
		System.out.println("게임종료------");
		
	}
	//가위 바위 보 게임을 만드세요

}
