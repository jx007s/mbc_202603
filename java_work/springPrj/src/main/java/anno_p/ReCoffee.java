package anno_p;

import jakarta.annotation.Resource;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//Lombok - getter, setter, constructer 등을 자동 생성
//mvnrepository 에 접근하여 gradle 에 추가 하여 사용

@Data
public class ReCoffee {
    // 이름, 가격, 원두(auto), 부속(auto)(시럽, 우유, 카라멜,초코렛.....)
    String name;
    int price;

    @Resource
    ReWondu wd;

    @Resource
    List<ReCoffeeParts> parts;
}

@Data
class ReCoffeeParts {
    String name;
}

@Data
class ReWondu{
    String name;
}


