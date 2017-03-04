package InnerClass;

import java.util.Iterator;

/**
 * Created by asus on 2017/3/1.
 */
public class OuterClass {


    public InnerClass getInnerClass( int num,String str2){
        return new InnerClass(){
            int number = num + 3;
            public int getNumber(){
                return number;
            }
        };        /* 注意：分号不能省 */
    }

    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        InnerClass inner = out.getInnerClass(2, "chenssy");
        System.out.println(inner.getNumber());
    }
}
