package master.domain;

import org.springframework.stereotype.Component;

/**
 * Created by ud on 17/3/17.
 */

@Component("applicationUser")
public class ApplicationUser {

    private String name="default-name";
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ApplicationUser{" +
                "name='" + name + '\'' +
                '}';
    }
}
