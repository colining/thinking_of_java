package Thinking_in_java.Generic.Store;

import java.util.ArrayList;

/**
 * Created by asus on 2017/3/9.
 */
public class Store extends ArrayList<Aisle> {
    private  ArrayList<Checkout> checkouts = new ArrayList<>();
    private Office office = new Office();
    public  Store( int nA,int nS,int nP)
    {
        for (int i=0; i <nA;i++)
        {
            add(new Aisle(nS,nP));
        }
    }
    public  String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (Aisle a : this)
            for (Shelf s: a)
                for (Product p : s)
                {
                    stringBuilder.append(p);
                    stringBuilder.append("\n");
                }
                return  stringBuilder.toString();
    }
    public static void main(String[] args) {
        System.out.println(new Store(1, 2, 5));
    }
}
