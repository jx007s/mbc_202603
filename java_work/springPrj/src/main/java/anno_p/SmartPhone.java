package anno_p;

import anno_p.comp_p.aaa.Display;
import lombok.Data;

@Data
public class SmartPhone {
    String name;
    Camera fc, rc;
    Display dd;
    Battery bat;
}
