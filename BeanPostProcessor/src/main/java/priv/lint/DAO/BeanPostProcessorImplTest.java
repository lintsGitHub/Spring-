package priv.lint.DAO;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorImplTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applictionContext.xml");
        BeanPostProcessorImpl bean = (BeanPostProcessorImpl) context.getBean("beanPostProcessor");
        bean.seyHello();

    }
}
