package org.lint.service;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import static org.junit.Assert.*;

public class InterServiceImplTest {

    @Test
    public void doService() {
//        使用接口的原因就是为了减低代码的耦合度
//        我们使用这种传统的开发方式，并没有将代码的耦合度降低多少
        InterService service = new InterServiceImpl();
        service.doService();
    }

    @Test
    public void doServiceIoC() {
//        创建容器对象 , 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        我们就可以从这个容器对象拿对象出来使用了
//        通过我们在容器中的对象ID来获取
        //InterService service = (InterService) context.getBean("ServiceImpl");
//        通过泛型的方式来获取对象
        InterService service = (InterService) context.getBean(InterServiceImpl.class);
        service.doService();
    }


    @Test
    public void doServiceContextDifference() {
//        这两个对象的区别是什么？
//        ClassPathXmlApplicationContext 这个对象的查找位置是从类路径下去找配置文件
//        FileSystemXmlApplicationContext 这个对象的查找位置是从根路径下去找配置文件
//        如果找不到会抛出一个异常：java.io.FileNotFoundException: applicationContext.xml
        ApplicationContext classPathContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext fileSystemContext = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");

        InterService classPathService = (InterService) fileSystemContext.getBean(InterServiceImpl.class);
        classPathService.doService();

        InterService fileSystemService = (InterService) fileSystemContext.getBean(InterServiceImpl.class);
        fileSystemService.doService();
    }

    @Test
    public void doServiceBeanFactory() {
        /*
        * 来谈谈ApplicationContext的底层BeanFactory对象
        *BeanFactory是核心容器对象，里面定义了获取容器里的对象的方法等重要方法
        * 而通过一步步的往下跟源码，我们可以发现很多奇妙的东西
        * */
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        InterService classPathService = (InterService) beanFactory.getBean(InterServiceImpl.class);
        classPathService.doService();
    }

}