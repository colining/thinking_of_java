package Thinking_in_java.Generic.Store;

import Thinking_in_java.Generic.Store.Generator;

import java.util.Collection;

/**
 * Created by asus on 2017/3/9.
 */
class Generators {
    public static <T> Collection<T> fill(Collection<T> collection,
                                         Generator<T> generator, int num) {
        for (int i = 0; i < num; i++) {
            collection.add(generator.next());
        }
        return collection;
    }
}

