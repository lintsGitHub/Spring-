package org.lint.DAO;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;


public class AssemblyBeanImplTest {

    @Test
    public void statement() {
//        知其然也要知其所然
//        我们先使用默认的bean装配方式来演示一遍，当我们把无参构造函数去掉时，程序会抛出一个异常(NoSuchMethodException -- 无法找到特定方法时抛出)，脑子里一定要有底层逻辑的代码思路，
//        org.lint.DAO.AssemblyBeanImpl.<init>() <init>()  代表的就是无参构造方法
//        它是通过配置文件获取目标类的全限定类名，然后创建它，而这个方法所需要的条件是类中必须要有无参构造器
       /* try {
            Object instance = Class.forName("类名").newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }*/
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AssemblyBeanImpl bean = (AssemblyBeanImpl) context.getBean("BeanDAO");
        bean.statement();

    }

}