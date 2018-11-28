package org.lint.DAO;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class StaticServiceFactoryTest {

    @Test
    public void getStaticAssemblyIpml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applictionContext.xml");
        StaticAssemblyIpml beanDAO = (StaticAssemblyIpml) context.getBean("BeanDAO");
        beanDAO.staticSayHello();
    }
}