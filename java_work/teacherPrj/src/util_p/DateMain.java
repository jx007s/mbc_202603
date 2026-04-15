package util_p;

import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		Date today = new Date();//현재 컴퓨터 시각
		
		System.out.println(today);
		today = new Date("Wed Feb 15 02:40:38 2023"); //문자열 시각
		System.out.println(today);
		
		// 1-12
		// 0-11
		today = new Date(2020-1900,5-1,12);//년-1900,월-1,일
		System.out.println(today);
		today = new Date(2020-1900,5-1,12,23,45);//년-1900,월-1,일,시,분
		System.out.println(today);
		today = new Date(2020-1900,5-1,12,23,45,17);//년-1900,월-1,일,시,분,초
		System.out.println(today);
		today = new Date(2020-1900,-200-1,980,2003,-45,200);//날짜의 범주를 넘어서도 연산처리
		System.out.println(today);
		
		today.setYear(1999-1900);
		System.out.println(today);
		today.setMonth(7-1);
		System.out.println(today);
		today.setDate(15);
		System.out.println(today);
		today.setHours(17);
		System.out.println(today);
		today.setMinutes(26);
		System.out.println(today);
		today.setSeconds(39);
		System.out.println(today);
		
		today = new Date();
		 System.out.println(today.getYear()+1900);
		 System.out.println(today.getMonth()+1);
		 System.out.println(today.getDate());
		 System.out.println(today.getDay());
		 /*
		  일 월 화 수 목 금 토
		  0  1 2  3  4 5 6 
		  * */
		 System.out.println(today.getHours());
		 System.out.println(today.getMinutes());
		 System.out.println(today.getSeconds());
		 System.out.println(today.getTime()); 
		 //타임스탬프 1970-1-1 0:0:0  1/1000 1씩 증가
		 System.out.println(today.getTime()/1000/60/60/24/365+1970);
		 
		 //today = new Date(0);
		 today.setTime(0);
		 System.out.println(today);
	}

}
