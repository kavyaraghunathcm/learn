package org.example;

public interface MyInterface {

     void myInterfaceMethod();
    default void myInterfaceDefaultMethod(){
        System.out.println("Inside my interface default method");
    };

}
