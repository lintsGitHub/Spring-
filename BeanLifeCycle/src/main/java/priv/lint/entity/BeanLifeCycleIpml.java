package priv.lint.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class BeanLifeCycleIpml implements BeanLifeCycle , BeanNameAware , BeanFactoryAware , InitializingBean , DisposableBean {

    private String sayName;

    public String getSayName() {
        return sayName;
    }

    public BeanLifeCycleIpml() {
        System.out.println("1--我在构造函数中");
    }

    public void setSayName(String sayName) {
        System.out.println("2--我在设置类中的属性"+sayName);
        this.sayName = sayName;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("3--获取到Bean的ID=="+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("4--获取到BeanFactory容器=="+beanFactory);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("6--Bean初始化完毕了");
    }

    public void initBean(){
        System.out.println("7--初始化完毕之后");
    }

    @Override
    public String sayHello() {
        System.out.println("9--执行sayHello方法");
        return "SayHello";
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("10--这个类销毁之前");
    }

    public void destroyBean(){
        System.out.println("11--销毁之前");
    }
}

