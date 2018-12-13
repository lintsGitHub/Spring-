package priv.lint.Bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Per stu = (Student) context.getBean("stu");
        System.out.println(stu);
        stu.sayHello();
    }
}
