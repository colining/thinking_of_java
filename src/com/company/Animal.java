package com.company;

/**
 * Created by asus on 2017/2/20.
 */
public class Animal {
    private String name;
    private int id;
    public  Animal(String myName, int myid) {
        name = myName;
        id = myid;
    }
    protected  void breath()
    {
        System.out.println("breath");
    }
    public void eat(){
        System.out.println(name+"正在吃");
    }
    public void eat(int a ){
        System.out.println(name+"正在吃");
    }
    public void sleep(){
        System.out.println(name+"正在睡");
    }
    public void introduction() {
        System.out.println("大家好！我是"         + id + "号" + name + ".");
    }
    protected   void  test(String a)
    {
        System.out.println(a);
    }
}

