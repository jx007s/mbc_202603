package anno_p;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class HandPhone {
    @Autowired
    Camera fc;

    @Qualifier("cam3") // bean 이름 명시
    @Autowired
    Camera rc;

    String name;
    Mic mm;
    Display dd;
    Battery bat;
/*
1. @Qualifier("camera2")  //bean 이름 명시
2. byName - 같은 Type Bean 이 다수일때 같은 이름적용
3. byType - 같은 Type Bean 이 1개일때 가능
            같은 Type Bean 이 다수일때 에러발생
4. @Autowired(required=false)  // true 이면 필수 O , false이면 필수 X (생략시 true)
                false - 같은 Type Bean 있으면 결합 없을때 에러 안남
*/

    // autowired 로 의존성결합시 setter 메소드 없이 멤버변수에 직접 지정가능
    //public void setFc(Camera fc) {        this.fc = fc;    }

    //public void setRc(Camera rc) {        this.rc = rc;    }

    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    public void setMm(Mic mm) {
        this.mm = mm;
    }

    @Autowired(required = false) // 결합할 bean 이 있으면 결합, 없으면 결합없이 에러없음
    public void setBat(Battery bat) {
        this.bat = bat;
    }

    //@Autowired    (결합 할 bean 이 없을 경우 에러발생)
    public void setDd(Display dd) {
        this.dd = dd;
    }

    @Override
    public String toString() {
        return "HandPhone{" +
                "name='" + name + '\'' +
                ", fc=" + fc +
                ", rc=" + rc +
                ", mm=" + mm +
                ", dd=" + dd +
                ", bat=" + bat +
                '}';
    }
}

class Mic{
    String name;
    int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mic{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


class Display{
    String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Display{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Battery{
    String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "name='" + name + '\'' +
                '}';
    }

}
