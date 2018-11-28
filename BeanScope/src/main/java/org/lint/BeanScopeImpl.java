package org.lint;

public class BeanScopeImpl implements BeanScope {

    public BeanScopeImpl() {
        System.out.println("我已经进入到Bean服务里了");
    }

    @Override
    public void aBean() {
        System.out.println("我是一个Bean啊");
    }
}
