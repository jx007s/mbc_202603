package aaa.di_p;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class MyProvider implements ApplicationContextAware {

    ApplicationContext context;

    public ApplicationContext getContext() {
        System.out.println("getContext() 진입");
        return context;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext 진입"); //컨테이너 실행시 1회 실행
        context = applicationContext;
    }
}
