package org.lint.service;

public class InterServiceImpl implements InterService {

    {
        System.out.println("I am the code block");
    }

    public InterServiceImpl() {
        System.out.println("Hello , I am here");
    }

    @Override
    public void doService() {
        System.out.println("我进入到doService方法里了");
    }
}
