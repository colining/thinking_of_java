package Proxy;

/**
 * Created by asus on 2017/3/5.
 */
public class BusinessAgent implements Sell {
    private Vendor mVendor;
    public BusinessAgent(Vendor vendor) {
        mVendor = vendor;
    }
    public void sell() {
        mVendor.sell();
    }
    public  void  sell(int i)
    {
        if (i<10)
        {
            System.out.println("你买的太少，代理不乐意搭理你");
        }
        else
        {
            System.out.println("亲需要支付" + (100 * i) + "￥");
            mVendor.sell();
        }
    }
    public void ad() {
        mVendor.ad();
    }
    public  static  void  main(String [] arg)
    {
        BusinessAgent businessAgent = new BusinessAgent(new Vendor());
        businessAgent.sell(10);
        businessAgent.sell(9);
    }
}
