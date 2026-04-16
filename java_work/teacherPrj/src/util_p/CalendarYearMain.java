package util_p;

import java.util.Date;

public class CalendarYearMain {

	static void monthGo(int year, int month) {
		
		System.out.println("[["+year+"년 "+month+"월]]");
		Date mmDay = new Date(year-1900, month-1,1);
		Date now = new Date();

		
		int nn = mmDay.getDate();
		
		int last = new Date(mmDay.getYear(), mmDay.getMonth()+1,0).getDate();

		//날짜 1일로 변경
		mmDay.setDate(1);
		
		for (int i = 0; i < mmDay.getDay(); i++) {
			System.out.print("\t");
		}
		
		for (int i = 1; i <=last; i++) {
			mmDay.setDate(i);	//날짜 변경
			//System.out.print(i+" "+mmDay.getDay()+"\t");
			String pre = "";
			String sur = "";
			if(i<10) {
				pre = " ";
			}
			if(now.getMonth()==mmDay.getMonth() &&  now.getDate()==i) {
				pre+="[";
				sur = "]";
			}else {
				pre+=" ";
			}
			System.out.print(pre+i+sur+"\t");
			if(mmDay.getDay()==6) {//토요일 확인
				System.out.println();
			}
		}
		System.out.println();

	}
	public static void main(String[] args) {
		for (int i = 1; i <=12; i++) {
			monthGo(2026,i);
		}
		
	}

}
