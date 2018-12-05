package priv.lint.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleIpml implements BeanLifeCycle , BeanNameAware , BeanFactoryAware , InitializingBean {

    private String sayName;

    public String getSayName() {
        return sayName;
    }

    public void setSayName(String sayName) {
        System.out.println("我在设置类中的属性"+sayName);
        this.sayName = sayName;
    }

    public BeanLifeCycleIpml() {
        System.out.println("我在构造函数中");
    }

    @Override
    public String sayHello() {
        System.out.println("工作中啊");
        return "我在工作了。。。在写一个SayHello";
    }

    public void init(){
        System.out.println("初始化");
    }
    public void destroy(){
        System.out.println("销毁吧");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("哈哈哈");
    }
}
