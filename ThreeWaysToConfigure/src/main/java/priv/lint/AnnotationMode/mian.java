package priv.lint.AnnotationMode;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import priv.lint.AnnotationMode.an.Student;

public class mian {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student bean = context.getBean(Student.class);
        bean.sayHello();
    }
}
