package org.example;

public class ImplClass1 extends MyAbstractClass implements MyInterface {

    @Override
    public void myInterfaceMethod() {
        System.out.println("inside impl of interface method");
    }

    @Override
    void myAbstractClassMethod() {
        System.out.println("inside impl of abstract method");
    }
}
