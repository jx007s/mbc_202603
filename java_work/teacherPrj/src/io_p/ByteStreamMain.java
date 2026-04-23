package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteStreamMain {

	public static void main(String[] args) throws Exception {
		byte [] arr = {3,20,127,3,-128,-3,-2,-1,10,50};
		
		System.out.println(Arrays.toString(arr));
		
		// 1. byte 배열에서 데이터를 읽어오는 스트림 생성
		ByteArrayInputStream bis = new ByteArrayInputStream(arr);
		
		// bis.available() : 스트림에 남아있는 데이터 갯수
		//System.out.println(bis.available());
		// read() 데이터 읽어오기 : 1개씩 읽어오기
		//int i = bis.read();  // int로 리턴함
		//System.out.println(i);
		//System.out.println(bis.available());
		
		// 2. 데이터 읽어오기
		while(bis.available()>0) {
			int i = bis.read();
			System.out.println(i+":"+(byte)i);
		}
		System.out.println(bis.available());
		int i = bis.read();  
		// 스트림에 남은 데이터가 없을 경우 read() 의 리턴은 -1
		
		System.out.println(i);
		
		//3. 스트림 종료
		bis.close();
		
		System.out.println("-------------------------");
		// 1. byte 배열에 데이터를 작성할 스트림생성
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		//2. 데이터 쓰기
		bos.write(100);
		bos.write(20);
		bos.write(0);
		bos.write(127);
		bos.write(128); // -128
		bos.write(129); // -127
		bos.write(-128);
		bos.write(-127);
		bos.write(-3);
		bos.write(-2);
		bos.write(-1);
		bos.write(254);//-2
		bos.write(255);//-1
		bos.write(0);
		
		//3. 스트림에서 배열 생성
		byte [] arr2 = bos.toByteArray();
		
		//4. 스트림 종료
		bos.close();
		
		System.out.println(Arrays.toString(arr2));

	}

}
