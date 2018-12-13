package priv.lint.MixedMode;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class mian {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student bean = context.getBean(Student.class);
        bean.sayHello();
    }
}
