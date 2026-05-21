package anno_p;

import jakarta.annotation.Resource;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Data
public class ReHandPhone {

    @Resource
    ReCamera fc;

    @Resource(name="cam3")
    ReCamera rc;

    String name;

    @Resource
    ReMic mm;

    ReDisplay dd;

    @Resource
    ReBattery bat;
}
@Data
class ReCamera {    String name;


}
@Data
class ReMic{    String name;


}
@Data
class ReDisplay{    String name;

}
@Data
class ReBattery{    String name;

}
