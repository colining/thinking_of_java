package InnerClass;

/**
 * Created by asus on 2017/2/28.
 */
public class Parcel7 {
    public  Selector selector ()
    {
        return  new Selector() {
            @Override
            public boolean end() {
                return false;
            }
        };

    }
    public  Wrapping wrapping (int x ,String a)
    {
        return  new Wrapping(1)
        {

           // @Override
            public int a() {
                String b =a;
                return x;
            }
        };
    }
//    class  selector implements  Selector
//    {
//
//        @Override
//        public boolean end() {
//            return false;
//        }
//    }
//    public  Selector selector02()
//    {
//        return  new selector();
//    }
}
