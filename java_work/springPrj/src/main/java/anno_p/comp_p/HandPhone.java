package anno_p.comp_p;

import anno_p.comp_p.aaa.Battery;
import anno_p.comp_p.aaa.Camera;
import anno_p.comp_p.aaa.Display;
import jakarta.annotation.Resource;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component   //클래스를 Bean으로 설정 (bean 이름 : 첫글자대문자->소문자로 바꾼 클래스명 : handPhone)
public class HandPhone {
    String name = "스카이";

    @Resource
    Mic mic;

    @Resource
    Display dis;

    @Resource
    Battery bat;

    @Resource(name="olympus")
    Camera fc;

    @Resource
    Camera rc;
}
