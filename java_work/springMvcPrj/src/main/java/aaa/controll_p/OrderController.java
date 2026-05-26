package aaa.controll_p;

import aaa.model_p.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/basic/order")
public class OrderController {

    @GetMapping
    String form(){
        return "basic/orderForm";
    }

    @PostMapping
    String complete(Order order){
        System.out.println("order_complete :"+order);
        return "basic/orderComplete";
    }
}
