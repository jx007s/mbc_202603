package aaa.model_p;

import lombok.Data;

@Data
public class Product {
    String title;
    int cnt, price;

    public int getTotal(){
        return cnt * price;
    }
}
