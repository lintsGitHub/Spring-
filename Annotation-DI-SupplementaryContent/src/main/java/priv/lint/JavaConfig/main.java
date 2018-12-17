package priv.lint.JavaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyJavaConfig.class);
        Student bean = context.getBean(Student.class);
        System.out.println(bean.sayHello());
        
    }
}
