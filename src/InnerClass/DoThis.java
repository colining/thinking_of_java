package InnerClass;

/**
 * Created by asus on 2017/2/28.
 */
public class DoThis {
    inner inner=new inner();

    public void test()
    {
        class  a{

        }
        if (true)
        {
            class  b {

            }
        }
    }
    private class  inner implements Selector
    {
       public int i ;
        public inner in()
        {
            return  inner.this;
        }

        @Override
        public boolean end() {
            return false;
        }
    }
    public  static  void  main(String a[])
    {
        DoThis doThis = new DoThis();
        DoThis.inner inner = doThis.new inner();
        System.out.println(inner.equals(inner.in()));

    }
}
