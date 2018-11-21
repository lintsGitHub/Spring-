package org.lint.DAO;

public class AssemblyBeanImpl implements AssemblyBeanDAO {
    private int a = 0 ;

    public AssemblyBeanImpl(int a) {
        this.a = a;
    }

    @Override
    public void statement() {
        System.out.println("I am here");
    }
}
