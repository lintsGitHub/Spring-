package priv.lint.entity;

public class CustomizeBeanImpl implements CustomizeBean {
    public CustomizeBeanImpl() {
        System.out.println("构造函数");
    }

    @Override
    public void seyHello() {
        System.out.println("Hello");
    }
//    定义一个初始化方法，方法名可以随意，但一定要符合规范
    public void init(){
        System.out.println("初始化");
    }
//    定义一个销毁前要做的方法
    public void destroy(){
        System.out.println("销毁前");
    }
}
