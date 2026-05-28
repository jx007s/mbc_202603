package aaa.tv;


import aaa.di_p.ServiceAction;
import org.springframework.stereotype.Service;

@Service("tv_list")
public class List implements ServiceAction {
    @Override
    public Object execute() {
        System.out.println("tv_list 실행");
        return "tv.list 데이터이지롱";
    }
}
