package basic_p;

import java.util.Date;

import jakarta.servlet.http.HttpServletRequest;

public class JoinDTO {

	String pid, pw, gender, email1, email2,content, upfile;
	String [] hobby;
	Date birth;
	
	public void reqInit(HttpServletRequest request) {
		this.pid = request.getParameter("pid");
		this.pw = request.getParameter("pw");
		this.gender = request.getParameter("gender");
		this.email1 = request.getParameter("email1");
		this.email2 = request.getParameter("email2");
		this.content = request.getParameter("content");
		this.upfile = request.getParameter("upfile");
		this.hobby = request.getParameterValues("hobby");
		
		System.out.println(request.getParameter("birth"));
		//birth = new Date(request.getParameter("birth"));
	}

	public String getPid() {
		return pid;
	}

	public String getPw() {
		return pw;
	}

	public String getGender() {
		return gender;
	}

	public String getEmail() {
		return email1+"@"+email2;
	}

	public String getContentBr() {
		return content.replaceAll("\n", "<br/>");
	}

	public String getUpfile() {
		return upfile;
	}

	public String getHobbys() {
		return String.join(",", hobby);
	}

	public Date getBirth() {
		return birth;
	}
	
	
}
