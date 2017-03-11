package Thinking_in_java.Generic.Store;

import java.util.ArrayList;

/**
 * Created by asus on 2017/3/9.
 */
public class Shelf extends ArrayList<Product> {

    /**
     * Constructs an empty list with the specified initial capacity.
     *
     * @param initialCapacity the initial capacity of the list
     * @throws IllegalArgumentException if the specified initial capacity
     *                                  is negative
     */
    public Shelf(int initialCapacity) {
        Generators.fill(this,Product.generator,initialCapacity);
    }
}
