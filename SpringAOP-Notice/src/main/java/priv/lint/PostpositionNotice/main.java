package priv.lint.PostpositionNotice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("postpositionApplicationContext.xml");
        Per bean = (Per) context.getBean("proxyBean");
        bean.sayHello();
    }
}
