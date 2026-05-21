package anno_p;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//Lombok - getter, setter, constructer 등을 자동 생성
//mvnrepository 에 접근하여 gradle 에 추가 하여 사용

//@Setter
//@ToString
public class Coffee {
    // 이름, 가격, 원두(auto), 부속(auto)(시럽, 우유, 카라멜,초코렛.....)
    String name;
    int price;

    @Autowired
    Wondu wd;

    @Autowired
    List<CoffeeParts> parts;

    public void setName(String name) {
        this.name = name;
    }



    public void setPrice(int price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", wd=" + wd +
                ", parts=" + parts +
                ", price=" + price +
                '}';
    }
}


