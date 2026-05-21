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


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "ReHandPhone{" +
                "name='" + name + '\'' +
                ", fc=" + fc +
                ", rc=" + rc +
                ", mm=" + mm +
                ", dd=" + dd +
                ", bat=" + bat +
                '}';
    }
}
@Data
class ReCamera {    String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ReCamera{" +
                "name='" + name + '\'' +
                '}';
    }
}
@Data
class ReMic{    String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ReMic{" +
                "name='" + name + '\'' +
                '}';
    }
}
@Data
class ReDisplay{    String name;
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ReDisplay{" +
                "name='" + name + '\'' +
                '}';
    }
}
@Data
class ReBattery{    String name;
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ReBattery{" +
                "name='" + name + '\'' +
                '}';
    }
}
