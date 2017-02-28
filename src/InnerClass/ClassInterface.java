package InnerClass;

/**
 * Created by asus on 2017/2/28.
 */
public interface ClassInterface {
    void howdy();
    class  test implements  ClassInterface
    {

        @Override
        public void howdy() {
            System.out.println("out");
        }
        void  a ()
        {
            System.out.println("a");
        }
    }
}
