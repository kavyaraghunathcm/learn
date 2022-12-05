package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        MyInterface myInterface = new ImplClass1();
        MyAbstractClass myAbstractClass = new ImplClass1();
        ImplClass1 implClass1= new ImplClass1();
        implClass1.myAbstractClassMethod();
    }
}