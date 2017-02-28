package InnerClass;

/**
 * Created by asus on 2017/2/28.
 */
public class ClassIner implements  ClassInterface {
    @Override
    public void howdy() {

    }
    public static  void  main(String a[])
    {
        ClassIner classIner = new ClassIner();

        classIner.howdy();
        new  test().howdy();

    }
}
