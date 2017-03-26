package master.domain;

import master.domain.ApplicationUser;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by ud on 17/3/17.
 */

@Component("application")
public class Application {

    @Resource(name = "applicationUser")  //DI injection using @Resource which injects dependency by name of bean.
    private ApplicationUser applicationUser;

    @Override
    public String toString() {
        return "master.domain.Application{" +
                "applicationUser=" + applicationUser +
                '}';
    }
}
