package exam_p;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface ExamService {

	void execute(HttpServletRequest request, HttpServletResponse response);
}
