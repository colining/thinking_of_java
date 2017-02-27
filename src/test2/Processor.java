package test2;

import test.test2;

import java.util.Objects;

/**
 * Created by asus on 2017/2/27.
 */
public class Processor {
    public  String name()
    {
        return getClass().getSimpleName();
    }
    Object process(Object input)
    {
        return  input;
    }

}
