package util_p;

import java.util.Date;

public class CalendarMain {

	public static void main(String[] args) {
		Date now = new Date();
//		Date lastDay = new Date();
//		// 이번달 마지막 날 ==> 다음달 0일
//		lastDay.setMonth(now.getMonth()+1);
//		lastDay.setDate(0);
		
		int nn = now.getDate();
		
		int last = new Date(now.getYear(), now.getMonth()+1,0).getDate();
		System.out.println(last);
		//날짜 1일로 변경
		now.setDate(1);
		
		for (int i = 0; i < now.getDay(); i++) {
			System.out.print("\t");
		}
		
		for (int i = 1; i <=last; i++) {
			now.setDate(i);	//날짜 변경
			//System.out.print(i+" "+now.getDay()+"\t");
			String pre = "";
			String sur = "";
			if(i<10) {
				pre = " ";
			}
			if(nn==i) {
				pre+="[";
				sur = "]";
			}else {
				pre+=" ";
			}
			System.out.print(pre+i+sur+"\t");
			if(now.getDay()==6) {//토요일 확인
				System.out.println();
			}
		}

	}

}
