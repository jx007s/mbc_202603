package basic_p;

import java.util.Arrays;
import java.util.stream.IntStream;

import jakarta.servlet.http.HttpServletRequest;

public class ExamDTO {

	String pname;
	String [] jum;
	int tot, avg;
	public ExamDTO(String pname, String...jum) {
		this.pname = pname;
		this.jum = jum;
		calc();
	}
	public ExamDTO(HttpServletRequest request) {
		this(
				request.getParameter("pname"),
				request.getParameterValues("jum")
			);
	}
	
	
	void calc() {
		tot = Arrays.stream(jum).mapToInt(Integer::parseInt).sum();
		avg = (int)Arrays.stream(jum).mapToInt(Integer::parseInt).average().orElse(0);
	}

	public String getPname() {
		return pname;
	}

	public String getJum(int no) {
		return jum[no];
	}

	public int getTot() {
		return tot;
	}

	public int getAvg() {
		return avg;
	}
	
	
}
