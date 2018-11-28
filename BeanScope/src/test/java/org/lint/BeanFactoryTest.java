package org.lint;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class BeanFactoryTest {

    @Test
    public void getBeanScopeImpl() {
        System.out.println("测试开始");
//        进行对scope为singleton的情况测试
        ApplicationContext context = new ClassPathXmlApplicationContext("applictionContext.xml");
        BeanScopeImpl singleton = (BeanScopeImpl) context.getBean("singleton");
        singleton.aBean();
//        输出结果如下:
//        测试开始
//        我已经进入到Bean服务里了
//        我是一个Bean啊
//        测试结束

//        进行对scope为prototype的情况进行测试
//        BeanScopeImpl prototype = (BeanScopeImpl) context.getBean("prototype");
//        prototype.aBean();
//        测试开始
//        我已经进入到Bean服务里了
//        我是一个Bean啊
//        测试结束
        System.out.println("测试结束");
    }
}