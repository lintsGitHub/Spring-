package priv.lint.Bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        String context1 = "applicationContext.xml";
        String context2 = "applicationContext1.xml";
//        还可以使用字符串数组，可以使用通配符
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(context1,context2);
        Per stu = (Student) context.getBean("stu");
        System.out.println(stu);
        stu.sayHello();
    }
}
