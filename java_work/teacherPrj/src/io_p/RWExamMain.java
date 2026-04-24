package io_p;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;

class RWExam{
	String ttt;
	int tot, avg;
	RWExam(String ttt) {
		this.ttt = ttt.trim();
		
		tot = 0;
		List<String> arr = Arrays.asList(this.ttt.split(","));
		arr.subList(1, arr.size()).stream().forEach(i->tot+=Integer.parseInt(i));
		avg=tot/(arr.size()-1);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ttt+","+tot+","+avg;
	}
}

public class RWExamMain {

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("fff/exam.txt");
		BufferedReader br = new BufferedReader(fr);//1행씩 가져오는 stream
													// FileReader의 buffer
		
		FileWriter fw = new FileWriter("dst/examRes.txt"); 
		
		String data;
		int cnt = 0;
		while((data=br.readLine())!=null) { // 더이상 가져오는 내용이 없으면 null
			
			System.out.println(++cnt+":"+data);
			fw.write(new RWExam(data).toString()+"\n");
		}
		
		fw.close();
		
		br.close();
		fr.close();
		

	}

}
