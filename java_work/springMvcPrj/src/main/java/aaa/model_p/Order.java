package aaa.model_p;

import lombok.Data;

import java.util.List;
import java.util.stream.Stream;

@Data
public class Order {
    List<Product>prod;
    Address addr;

    public int getTotal(){

        return prod.stream().mapToInt(Product::getTotal).sum();
    }
}
