package anno_p;

import lombok.Data;

@Data
public class SmartPhone {
    String name;
    Camera fc, rc;
    Display dd;
    Battery bat;
}
