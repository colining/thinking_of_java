package com.company;

/**
 * Created by asus on 2017/2/20.
 */
public class Mouse extends Animal {


    public  static  void  main(String a[])
    {
        Animal mouse = new Mouse("11",1);
        mouse.breath();
    }
    public  Mouse(String myName, int myid) {
        //super(myName, myid);
        super("kjl",1);

    }


    @Override
    protected void breath() {
        //super.breath();
        System.out.println("mousebreath");
    }

    void   Mouse ()
    {
        System.out.println("jh");
    }
    void Mouse1()
    {
        System.out.println("ahdkajhfka");
    }

    @Override
    public void eat() {
        //super.eat();
    }

    public  void  eat(int a )
    {
        System.out.println("aa");
    }
    @Override
    protected void test(String a) {
        super.test(a);
        super.test("a");
        super.test("b");
    }


}