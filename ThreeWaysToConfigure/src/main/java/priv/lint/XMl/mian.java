package priv.lint.XMl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mian {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        per student = (per) context.getBean("student");
        student.sayHello();
    }
}
