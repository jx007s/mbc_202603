package person_p;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface PersonService {

	void execute(HttpServletRequest request, HttpServletResponse response);
}
