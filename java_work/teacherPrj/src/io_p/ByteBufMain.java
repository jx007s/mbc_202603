package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;


public class ByteBufMain {

	public static void main(String[] args) throws Exception {
		byte [] arr = {
				11,22,33,44,55,66,77,88,99,
				12,34,56,78,90,13,24,46,57,79};
		
		ByteArrayInputStream bis = new ByteArrayInputStream(arr);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		System.out.println(bis.available());
		byte [] buf = new byte[7];	//buf 공간
		
				//읽어오기 (buf배열, buf배열위치, 가져올데이터갯수) 
		int cnt = bis.read(buf, 2, 3);
		//cnt : 가져온 데이터 갯수
		System.out.println("buf : "+Arrays.toString(buf));
		System.out.println("cnt : "+cnt);
		System.out.println(bis.available());
		
		//쓰기
		//bos.write(buf); buf의 모든 원소를 bos 에 쓰기
		//     buf배열, buf배열원소시작위치, 가져올데이터갯수
		bos.write(buf, 2, 3);
		
		
		//읽어오기 (buf배열) - buf 0번째 부터 buf배열 크기에 맞춰 가져온다
		cnt = bis.read(buf);
		//cnt : 가져온 데이터 갯수
		System.out.println("buf : "+Arrays.toString(buf));
		System.out.println("cnt : "+cnt);
		System.out.println(bis.available());
		bos.write(buf);
		
		//             시작위치, 가져올갯수 
		// 에러발생 - 시작위치로부터 가져올 갯수만큼의 buf 배열크기가 크지 않음
		//bis.read(buf, 5, 5);
		
		cnt = bis.read(buf);
		//cnt : 가져온 데이터 갯수
		System.out.println("buf : "+Arrays.toString(buf));
		 //[34, 56, 78, 90, 13, 24, 46]
		System.out.println("cnt : "+cnt);
		System.out.println(bis.available());
		bos.write(buf,0,cnt);
		
		cnt = bis.read(buf);
		//cnt : 가져온 데이터 갯수
		

		System.out.println("buf : "+Arrays.toString(buf));
		// [57, 79, 78, 90, 13, 24, 46]
		// 57, 79 - 가져온 데이터 : cnt 2개
		// 78, 90, 13, 24, 46 : 먼저 가져왔던 데이터 - 필요없음
		System.out.println("cnt : "+cnt);
		System.out.println(bis.available());
		//bos.write(buf);  //[57, 79, 78, 90, 13, 24, 46] - 불필요한 데이터추가
		
		bos.write(buf,0,cnt); //[57, 79] - 유효한 데이터만 추가
								//권장형태
		
		byte [] arr2 = bos.toByteArray();
		
		bos.close();
		bis.close();
		
		System.out.println("arr2 : "+Arrays.toString(arr2));

		/*
		 ByteBufMain2
		 byte [] arr = {
				11,22,33,44,55,66,77,88,99,
				12,34,56,78,90,13,24,46,57,79}; 
				
		byte [] buf = new byte[7];
		
		while 문을 이용하여 자동으로 배열 복사하세요
		 * */
	}

}
