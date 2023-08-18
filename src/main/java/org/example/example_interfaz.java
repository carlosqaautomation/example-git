package org.example;

public class example_interfaz implements example{

    public void abc(){
        System.out.println(example.abc);
    }
    @Override
    public void fn1() {
        System.out.println("abc" + example.abc);
    }
}
