package lambda_p;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {
	
	static int cnt = 0;

	public static void main(String[] args) throws Exception {
		List<String> arr1 = 
				List.of("이치고","아이젠","루키아","사도","바쿠야");
		
		System.out.println("arr1 : "+arr1);
		
		//열거데이터로부터 Stream 리턴
		Stream<String> stream1 = arr1.stream();
		System.out.println("stream1 : "+stream1);
		//stream 메소드 : Collection 내부에서 동작가능토록 매개변수로 인터페이스(람다식)을 대입받아 처리
		//forEach : 열거데이터 원소들을 각각 처리 (for문처럼 사용) 
		stream1.forEach(tt->System.out.println(tt));
		stream1.close(); //stream 종료
		
		String [] arr2 = "루피,조로,나미,상디,샹크스".split(",");
		System.out.println("arr2 : "+Arrays.toString(arr2));
		Stream<String> stream2 = Arrays.stream(arr2);
		stream2.forEach(tt->System.out.println(tt));
		stream2.close();
		System.out.println("IntStream.range(1, 5)");
		IntStream istr = IntStream.range(1, 5);
		istr.forEach(tt->System.out.println(tt));
		istr.close();
		
		System.out.println("IntStream.rangeClosed(1, 5)");
		istr = IntStream.rangeClosed(1, 5);
		istr.forEach(tt->System.out.println(tt));
		istr.close();
		
		System.out.println("Files.lines");
		File ff = new File("fff/exam.txt");
		Path path = ff.toPath();
		Stream<String> stream3 = Files.lines(path);
		
		//int cnt = 0;
		stream3.forEach(tt->System.out.println(cnt++ +" : "+ tt));
		stream3.close();
		
		// 숫자범위를 이용하여 1-> 100 의 합을 구하세요 
		cnt = 0;
		istr = IntStream.rangeClosed(1, 100);
		istr.forEach(tt-> cnt+=tt);
		istr.close();
		System.out.println(cnt);
	}

}
