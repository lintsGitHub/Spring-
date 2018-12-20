package priv.lint.NameMatchingMethod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("NameMatchingContext.xml");
//        我们拿的就是代理工厂Bean
        Per bean = (Per) context.getBean("proxyBean");
        System.out.println(bean.sayHello()); //经过环绕通知 输出 ：HELLOWORD
        System.out.println(bean.sayHi()); //保持原来的输出 ： Hi

    }
}
