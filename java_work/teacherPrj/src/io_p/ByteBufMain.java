package io_p;

import java.io.ByteArrayInputStream;
import java.util.Arrays;


public class ByteBufMain {

	public static void main(String[] args) throws Exception {
		byte [] arr = {
				11,22,33,44,55,66,77,88,99,
				12,34,56,78,90,13,24,46,57,79};
		
		ByteArrayInputStream bis = new ByteArrayInputStream(arr);
		System.out.println(bis.available());
		byte [] buf = new byte[7];	//buf 공간
		
				//읽어오기 (buf배열, buf배열위치, 가져올데이터갯수) 
		int cnt = bis.read(buf, 2, 3);
		//cnt : 가져온 데이터 갯수
		System.out.println("buf : "+Arrays.toString(buf));
		System.out.println("cnt : "+cnt);
		System.out.println(bis.available());
		
		//읽어오기 (buf배열) - buf 0번째 부터 buf배열 크기에 맞춰 가져온다
		cnt = bis.read(buf);
		//cnt : 가져온 데이터 갯수
		System.out.println("buf : "+Arrays.toString(buf));
		System.out.println("cnt : "+cnt);
		System.out.println(bis.available());
		
		//             시작위치, 가져올갯수 
		// 에러발생 - 시작위치로부터 가져올 갯수만큼의 buf 배열크기가 크지 않음
		//bis.read(buf, 5, 5);
		
		cnt = bis.read(buf);
		//cnt : 가져온 데이터 갯수
		System.out.println("buf : "+Arrays.toString(buf));
		System.out.println("cnt : "+cnt);
		System.out.println(bis.available());
		
		cnt = bis.read(buf);
		//cnt : 가져온 데이터 갯수
		System.out.println("buf : "+Arrays.toString(buf));
		System.out.println("cnt : "+cnt);
		System.out.println(bis.available());
		
		bis.close();

	}

}
