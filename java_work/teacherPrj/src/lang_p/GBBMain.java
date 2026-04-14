package lang_p;

import java.util.Scanner;

public class GBBMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[[[운명의 데스티니 가위바위보]]]");
		String [] title = {"가위","바위","보"};
		
		String [][]res = {
				"비김,패,승".split(","),
				"승,비김,패".split(","),
				"패,승,비김".split(","),
		}; 

		while(true) {
			System.out.print("0:종료 1.가위, 2.바위, 3.보 : ");
			int me = sc.nextInt();
			if(me==0) {
				break;
			}
			me--;
			
			int com = (int)(Math.random()*3);
			
			System.out.println("게이머:"+title[me]);
			System.out.println("컴퓨터:"+title[com]);
			System.out.println("결과:"+res[me][com]);
			
		}
		
		System.out.println("게임종료------");

	}

}
