package Proxy;

/**
 * Created by asus on 2017/3/5.
 */
public class Vendor implements Sell {
    public void sell() {
        System.out.println("In sell method");
    }
    public void ad() {
        System.out.println("ad method");
    }
}
