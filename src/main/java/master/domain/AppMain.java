package master.domain;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by ud on 17/3/17.
 */
public class AppMain {

    public static void main(String args[]) {
        AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Application application = (Application) applicationContext.getBean("application");
        System.out.print(application);
    }
}
