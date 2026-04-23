package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteBufMain2 {

	public static void main(String[] args) throws Exception {
		byte [] arr = {
				11,22,33,44,55,66,77,88,99,
				12,34,56,78,90,13,24,46,57,79}; 
				
		byte [] buf = new byte[7];
		
		ByteArrayInputStream bis = new ByteArrayInputStream(arr);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		while(bis.available()>0) {
			int cnt = bis.read(buf);
			bos.write(buf,0, cnt);
			//System.out.println(cnt+":"+Arrays.toString(buf));
		}
		
		byte [] arr2 = bos.toByteArray();
		bos.close();
		bis.close();
		
		System.out.println("arr2 : "+Arrays.toString(arr2));

	}

}
