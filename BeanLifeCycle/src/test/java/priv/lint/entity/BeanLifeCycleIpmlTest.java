package priv.lint.entity;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleIpmlTest {



    @Test
    public void beanLifeCycleTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanLifeCycleIpml lifeCycle = (BeanLifeCycleIpml) context.getBean("BeanLifeCycle");
        System.out.println("9--执行sayHello方法"+lifeCycle.sayHello());
        context.close();
    }
}