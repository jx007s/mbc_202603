package anno_p;

import anno_p.comp_p.aaa.Display;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@ComponentScan(basePackages = "anno_p.comp_p.aaa")
public class AnnoCoffeeConfig {


    @Bean
    Coffee cc(Wondu wd, List<CoffeeParts> parts){
        Coffee res = new Coffee();
        res.name = "아시아노";
        res.wd = wd;
        res.parts = parts;
        return res;
    }

    @Bean
    Wondu wd(){
        Wondu res = new Wondu();
        res.name = "케냐";
        return res;
    }

    @Bean
    CoffeeParts cp1(){
        CoffeeParts res = new CoffeeParts();
        res.name = "시럽";
        return res;
    }

    @Bean
    CoffeeParts cp2(){
        CoffeeParts res = new CoffeeParts();
        res.name = "계피";
        return res;
    }

}
