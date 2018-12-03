package priv.lint.DAO;

import org.junit.jupiter.api.Test;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Method;

public class BeanPostProcessorImplTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applictionContext.xml");
        BeanPostProcessorImpl bean = (BeanPostProcessorImpl) context.getBean("beanPostProcessor");
        bean.seyHello();
        System.out.println(bean.seyHello());
    }

//    Cglib 动态代理
    @Test
    public void Cglib (){
        final BeanPostProcessorImpl beanPostProcessor = new BeanPostProcessorImpl();
        /*
        * 这里出现了ClassCastException 异常
        * 唉，还是对Cglib动态代理不够熟悉，也可以说对Cglib原理还是不够熟悉
        * 目前推测是在强制转换时有问题
        * */
        BeanPostProcessor processor = (BeanPostProcessorImpl) Proxy.newProxyInstance(beanPostProcessor.getClass().getClassLoader(),
                beanPostProcessor.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        String invoke = (String) method.invoke(beanPostProcessor, objects);
                        return invoke.toUpperCase();
                    }
                });
        System.out.println(processor.seyHello());
    }
}
