package test2;

import java.util.Objects;

/**
 * Created by asus on 2017/2/27.
 */
public class Downcase extends  Processor {
    String process(Object input)
    {
        return  ((String) input).toLowerCase();
    }

}
