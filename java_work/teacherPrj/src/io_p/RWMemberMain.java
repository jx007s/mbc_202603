package io_p;

import java.io.FileReader;
import java.io.FileWriter;

enum RWBonus{
	
	부장(50), 과장(30), 대리(20),사원(10);
	
	final double BONUS;

	private RWBonus(double bonus) {
		this.BONUS = bonus/100;
	}
	
}

class RWMember{
	RWBonus bonus;
	String name;
	int basic, money;
	RWMember(String ttt) {
		String [] arr = ttt.trim().split(",");
		bonus = RWBonus.valueOf(arr[0]);
		this.name = arr[1];
		this.basic = Integer.parseInt(arr[2]);
		this.money = (int)(basic+basic*bonus.BONUS);
	}
	@Override
	public String toString() {
		return bonus + "," + name + "," + basic + "," + money;
	}
}

public class RWMemberMain {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("fff/member.txt");
		char [] buf = new char[20];
		String data = "";
		while(true) {
			int len = fr.read(buf);
			if(len<0) {
				break;
			}
			//String str = new String(buf,0,len);
			//System.out.println(len+":"+str);
			data += new String(buf,0,len);
		}
		fr.close();
		//System.out.println(data);
		
		
		FileWriter fw = new FileWriter("dst/memberRes.txt"); // 생략 , false : 덮어쓰기
		//new FileWriter("dst/memberRes.txt", true); 				// true : 뒤에 이어쓰기
		
		for (String dd : data.split("\n")) {
			//System.out.println(new RWMember(dd));
			fw.write(new RWMember(dd).toString()+"\n");
		}
		
		fw.close();
	}

}


/*
 * RWExamMain 
 * fff/exam.txt -> dst/examRes.txt
장동건,78,79,72		장동건,78,79,72,총점,평균      
장서건,68,69,62		장서건,68,69,62,총점,평균
장남건,98,99,92		장남건,98,99,92,총점,평균
장중건,88,89,82		장중건,88,89,82,총점,평균
북두신건,58,59,52		북두신건,58,59,52,총점,평균
 * */
