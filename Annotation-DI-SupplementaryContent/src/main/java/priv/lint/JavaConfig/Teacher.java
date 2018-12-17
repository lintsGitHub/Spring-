package priv.lint.JavaConfig;

import org.springframework.beans.factory.annotation.Value;

public class Teacher implements Per {
    @Value("冬梅")
    String name;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String sayHello() {
        return "hello";
    }
}
