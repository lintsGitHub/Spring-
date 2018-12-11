package priv.lint.an;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //这个注解就等同 <bean id="student" class="priv.lint.an.Student"/>
public class Student implements per {
    @Value("张三") //等同<property name="name" value="张三"/>
    String name;

    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
