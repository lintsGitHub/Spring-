package priv.lint.PrepositionNotice;

import org.springframework.stereotype.Component;

//@Component // 将Student对象放到容器中 注册切面：通知
public class Student implements Per {
    String name;

    @Override
    public void sayHello() {
        System.out.println("HELLO");
    }
}
