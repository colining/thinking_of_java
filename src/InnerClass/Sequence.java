package InnerClass;

/**
 * Created by asus on 2017/2/28.
 */
public class Sequence {
    private  Object[] items= new Object[5];
    private  void a ()
    {

    }
    private  class  SequenceSelector implements  Selector
    {
        private  int i ;
        @Override
        public boolean end() {
            return 1==items.length;
        }
    }
    public  Selector selector ()
    {
        return  new SequenceSelector();
    }
    public  static  void  main (String a[])
    {

        Sequence sequence = new Sequence();
       Selector selector =  sequence.selector();
        System.out.println(selector.end());
    }
}
