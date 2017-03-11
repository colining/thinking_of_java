package Thinking_in_java.Generic.Store;

import java.util.ArrayList;

/**
 * Created by asus on 2017/3/9.
 */
public class Aisle extends ArrayList<Shelf> {
    public  Aisle(int a,int p)
    {
        for(int i = 0 ; i <a;i++)
        {
            add(new Shelf(p));
        }
    }
}
