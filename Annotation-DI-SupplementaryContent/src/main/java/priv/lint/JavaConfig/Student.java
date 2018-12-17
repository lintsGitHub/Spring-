package priv.lint.JavaConfig;

import org.springframework.beans.factory.annotation.Value;

public class Student implements Per{
    @Value("零")
    String name;

    @Override
    public String sayHello() {
        return "hello";
    }
}
