package org.lint.DAO;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class DynamicDAOTest {

    @Test
    public void dynamic() {
//        这是之前的默认装配的代码
//        这里出现的耦合度还是很高
//        创建容器对象，加载Spring配置文件
//        ApplicationContext context = new ClassPathXmlApplicationContext("applictionContext.xml");
//        获取工厂对象
//        ServiceFactory bean = context.getBean(ServiceFactory.class);
//        调用工厂中的获取DynamicIpml对象的方法
//        DynamicIpml beanDynamicIpml = bean.getDynamicIpml();
//        调用DynamicIpml的方法
//        beanDynamicIpml.Dynamic();

//        这是动态工厂装配的代码
//        这个测试类中就没有看到工厂对象了，也隐藏了接口的实现类了 ，减低了耦合度
        ApplicationContext context = new ClassPathXmlApplicationContext("applictionContext.xml");
        DynamicDAO service = (DynamicDAO) context.getBean("myService");
        service.Dynamic();
    }


}