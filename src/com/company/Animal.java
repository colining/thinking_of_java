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
        System.out.println(name+"���ڳ�");
    }
    public void eat(int a ){
        System.out.println(name+"���ڳ�");
    }
    public void sleep(){
        System.out.println(name+"����˯");
    }
    public void introduction() {
        System.out.println("��Һã�����"         + id + "��" + name + ".");
    }
    protected   void  test(String a)
    {
        System.out.println(a);
    }
}

