package priv.lint.UseCGLIBProxy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        /*
        * 动态代理有两种方式，JDK ，CGLIB
        * Spring采用的是哪种，其实Spring就比较狡猾了，在里面定义一个属性然后就去检查有没有接口，有就使用JDK动态代理，没有就使用CGLIB动态代理
        * */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("CGLIBProxyContext.xml");
//        Teacher proxyBean = (Teacher) context.getBean("proxyBean");
        Per proxyBean = (Per) context.getBean("proxyBean");
        proxyBean.sayHello();
    }
}
