package anno_p.comp_p.aaa;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component("rc")  // bean 이름 : rc로 변경
public class Camera {
    String name="수중카메라";
}

