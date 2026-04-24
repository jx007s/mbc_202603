package io_p;

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
		char [] buf = new char[20];
		String data = "";
		while(true) {
			int len = fr.read(buf);
			if(len<0) {
				break;
			}
			//String str = new String(buf,0,len);
			//System.out.println(len+":"+str);
			data += new String(buf,0,len);
		}
		fr.close();
		//System.out.println(data);
		
		
		FileWriter fw = new FileWriter("dst/examRes.txt"); // 생략 , false : 덮어쓰기
		//new FileWriter("dst/memberRes.txt", true); 				// true : 뒤에 이어쓰기
		
		for (String dd : data.split("\n")) {
			//System.out.println(new RWMember(dd));
			fw.write(new RWExam(dd).toString()+"\n");
		}
		
		fw.close();

	}

}
