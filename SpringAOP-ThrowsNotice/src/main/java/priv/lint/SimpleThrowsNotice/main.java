package priv.lint.SimpleThrowsNotice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args)  {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SimpleThrowNoticeContext.xml");
        Per bean = (Per) context.getBean("proxyBean");
//        System.out.println(bean.sayHello());
        try {
            bean.addUser("nf","123");
        } catch (Exception e) {
            e.printStackTrace();    
        }
    }
}
