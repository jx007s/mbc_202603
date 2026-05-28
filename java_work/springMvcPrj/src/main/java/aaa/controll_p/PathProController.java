package aaa.controll_p;

import aaa.di_p.MyProvider;
import aaa.di_p.ServiceAction;
import aaa.model_p.PData;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pathPro/{cate}/{service}")
public class PathProController {

    @Resource
    MyProvider provider;

    @ModelAttribute("mainData")
    Object mainData(PData pd){
        ServiceAction sa = (ServiceAction)provider.getContext().getBean(pd.ca_ser());
        Object res = sa.execute();
        return res;
    }

    @RequestMapping
    String view(){
        return "path/proView";
    }
}
