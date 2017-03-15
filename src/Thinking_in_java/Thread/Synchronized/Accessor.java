package Thinking_in_java.Thread.Synchronized;

/**
 * Created by asus on 2017/3/15.
 */
class Accessor implements Runnable {
    private final int id;

    public Accessor(int id) {
        this.id = id;
    }

    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            ThreadLocalVariableHolder.increment();
            System.out.println(this);
            Thread.yield();
        }
    }

    public String toString() {
        return "#" + id + ": " + ThreadLocalVariableHolder.get();
    }
}
