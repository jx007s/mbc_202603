package anno_p.compcoffee_p;

import jakarta.annotation.Resource;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;



@Data
@Component("cc")
public class Coffee {

    String name="중삼동";
    int price=3500;

    @Resource
    Wondu wd;

    @Resource
    List<CoffeeParts> parts;
}


interface CoffeeParts { }

@Data
@Component
class cp1 implements CoffeeParts{
    String name = "휘핑";
}

@Data
@Component
class cp2 implements CoffeeParts{
    String name = "시럽";
}

@Data
@Component
class cp3 implements CoffeeParts{
    String name = "두쫀쿠";
}




@Data
@Component
class Wondu{
    String name="케냐";
}


