package org.lint;

public class BeanFactory {
    public static BeanScopeImpl getBeanScopeImpl(){
        return new BeanScopeImpl();
    }
}
