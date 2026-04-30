package basic_p;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

import jakarta.servlet.http.HttpServletRequest;

public class ExamDTO {

	String pname;
	//String [] jum;
	int [] jum;
	//int tot, avg;
	public ExamDTO(String pname, String...jum) {
		
		if(Pattern.matches("[가-힣]{2,5}", pname)) {
			this.pname = pname;
		}else {
			this.pname = "잘못된이름";
		}
		
		this.jum = new int[3];
		for (int i = 0; i < jum.length; i++) {
			int no = Integer.parseInt(jum[i]);
			if(no>=0 && no<=100) {
				this.jum[i] = no;
			}else {
				this.jum[i] = 0;
			}
		}
		//calc();
	}
	public ExamDTO(HttpServletRequest request) {
		this(
				request.getParameter("pname"),
				request.getParameterValues("jum")
			);
	}
	
	/*
	void calc() {
		//tot = Arrays.stream(jum).mapToInt(Integer::parseInt).sum();
		//avg = (int)Arrays.stream(jum).mapToInt(Integer::parseInt).average().orElse(0);
		tot = Arrays.stream(jum).sum();
		avg = (int)Arrays.stream(jum).average().orElse(0);
		
		
	}*/
	
	

	public String getPname() {
		return pname;
	}

	public int[] getJum() {
		return jum;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getJum(int no) {
		//System.out.println(Arrays.toString(jum));
		return jum[no];
	}

	public int getTot() {
		return Arrays.stream(jum).sum();
	}

	public int getAvg() {
		return (int)Arrays.stream(jum).average().orElse(0);
	}
	
	public String getGrade() {
		return "가가가가가가양미우수수".charAt(getAvg()/10)+"";
	}
	@Override
	public String toString() {
		return "ExamDTO [pname=" + pname + ", jum=" + Arrays.toString(jum) + "]";
	}
	
	
}
