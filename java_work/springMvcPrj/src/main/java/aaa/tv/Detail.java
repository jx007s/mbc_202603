package aaa.tv;


import aaa.di_p.ServiceAction;
import org.springframework.stereotype.Service;

@Service("tv_detail")
public class Detail implements ServiceAction {
    @Override
    public Object execute() {
        System.out.println("tv_detail 실행");
        return "tv.detail 데이터이지롱";
    }
}
