package priv.lint.DAO;

public class BeanPostProcessorImpl implements BeanPostProcessor {
    public BeanPostProcessorImpl() {
        System.out.println("初始化实例对象。。。");
    }

    @Override
    public String seyHello() {
        System.out.println("toHello");
        return "hello";
    }
}
