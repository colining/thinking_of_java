package Thinking_in_java.Thread.Synchronized;

/**
 * Created by asus on 2017/3/13.
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;
    public abstract int next();
    // Allow this to be canceled:
    public void cancel() { canceled = true; }
    public boolean isCanceled() { return canceled; }
} ///:~