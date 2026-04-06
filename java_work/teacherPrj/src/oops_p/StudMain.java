package oops_p;

import java.util.Arrays;

class ClaStud{
	String name;
	int [] jum;
	int tot;
	double avg;
}

public class StudMain {

	public static void main(String[] args) {
		/*
		ClaStud st1 = new ClaStud();
		ClaStud st2 = new ClaStud();
		
		st1.name = "정우성";
		st1.jum = new int[] {78,72,79};
		st1.tot = 0;
		for (int j : st1.jum) {
			st1.tot += j;
		}
		st1.avg = (double)st1.tot/st1.jum.length;
		
		
		String ttt = st1.name+"\t"+
					Arrays.toString(st1.jum)+"\t"+
					 st1.tot+"\t"+
					 st1.avg;
		
		System.out.println(ttt);
		
		
		st2.name = "정좌성";
		st2.jum = new int[] {88,82,89};
		st2.tot = 0;
		for (int j : st2.jum) {
			st2.tot += j;
		}
		st2.avg = (double)st2.tot/st2.jum.length;
		
		
		ttt = st2.name+"\t"+
					Arrays.toString(st2.jum)+"\t"+
					 st2.tot+"\t"+
					 st2.avg;
		
		System.out.println(ttt);
		*/
		ClaStud [] studs = {
				new ClaStud(),
				new ClaStud(),
				new ClaStud()
		};
		
		studs[0].name = "정우성";
		studs[0].jum = new int[] {78,72,79};
		studs[0].tot = 0;
		
		studs[1].name = "정좌성";
		studs[1].jum = new int[] {88,82,89};
		studs[1].tot = 0;
		
		studs[2].name = "정남성";
		studs[2].jum = new int[] {68,62,69};
		studs[2].tot = 0;
		
		//int i =0;
		/*
		for (int i = 0; i < studs.length; i++) {
			for (int j : studs[i].jum) {
				studs[i].tot += j;
			}
			studs[i].avg = (double)studs[i].tot/studs[i].jum.length;
			String ttt = studs[i].name+"\t"+
					Arrays.toString(studs[i].jum)+"\t"+
					studs[i].tot+"\t"+
					studs[i].avg;
			System.out.println(ttt);
		}
		
		
		for (int i = 0; i < studs.length; i++) {
			ClaStud cst = studs[i];
			for (int j : cst.jum) {
				cst.tot += j;
			}
			cst.avg = (double)cst.tot/cst.jum.length;
			String ttt = cst.name+"\t"+
					Arrays.toString(cst.jum)+"\t"+
					cst.tot+"\t"+
					cst.avg;
			System.out.println(ttt);
		}
		*/
		
		
		for (ClaStud cst : studs) {

			for (int j : cst.jum) {
				cst.tot += j;
			}
			cst.avg = (double)cst.tot/cst.jum.length;
			String ttt = cst.name+"\t"+
					Arrays.toString(cst.jum)+"\t"+
					cst.tot+"\t"+
					cst.avg;
			System.out.println(ttt);
		}
		
	}

}

/* 
SoccerPlayerMain
 * 
 * 축구선수를 구현하세요

 * 포지션, 이름, 등번호

 * 

 * 공격하기, 패쓰하기, 수비하기

 * */





