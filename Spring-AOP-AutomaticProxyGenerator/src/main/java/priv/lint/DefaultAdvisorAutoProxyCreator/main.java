package priv.lint.DefaultAdvisorAutoProxyCreator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("DefaultAdvisorContext.xml");
        /*
        Teacher bean = (Teacher) context.getBean("teacher");
        Student bean1 = (Student) context.getBean("student");
        如果是这种写法的话会报错
        ClassCastException: com.sun.proxy.$Proxy1 cannot be cast to priv.lint.DefaultAdvisorAutoProxyCreator.Teacher
        也就是说我们使用这个自动代理生成器必须要有接口,
        这也是使用这个自动代理生成器的一个不好的地方吧
        */
        Per bean = (Per) context.getBean("teacher");
        Per bean1 = (Per) context.getBean("student");
        System.out.println(bean.sayHello());
        System.out.println(bean.sayHi());
        System.out.println(bean1.sayHello());
        System.out.println(bean1.sayHi());
    }
    
}
