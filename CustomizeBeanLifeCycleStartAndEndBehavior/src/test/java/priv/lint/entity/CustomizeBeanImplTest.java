package priv.lint.entity;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class CustomizeBeanImplTest {

    @Test
    public void seyHello() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applictionContext.xml");
        CustomizeBeanImpl bean = context.getBean(CustomizeBeanImpl.class);
        bean.seyHello();
//        ApplicationContext 这个类并没有close方法，但它的实现类有
//        关闭IoC容器
        context.close();
    }
}