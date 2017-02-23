package com.company;

/**
 * Created by asus on 2017/2/23.
 */
public class House {
    Window w1 = new Window(1);
    public House() {
        System.out.println("house");
        w3=new Window(33);
    }
    Window w2 = new Window(2);
    void f() {
        System.out.println("f();");
    }
    Window w3 = new Window(3);
}
