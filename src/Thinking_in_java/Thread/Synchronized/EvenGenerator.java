package Thinking_in_java.Thread.Synchronized;

/**
 * Created by asus on 2017/3/13.
 */
public class EvenGenerator extends IntGenerator {
    private  static int currentEvenValue = 0;
    public  synchronized  int next() {
        ++currentEvenValue; // Danger point here!
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }
    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());

    }
}
