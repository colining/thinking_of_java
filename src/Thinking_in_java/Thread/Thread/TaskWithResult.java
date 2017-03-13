package Thinking_in_java.Thread.Thread;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Created by asus on 2017/3/12.
 */
public class TaskWithResult implements Callable<String> {
    public  static  void  main(String []arg)
    {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Future<String>> futures = new ArrayList<>();
        for (int i = 0;i<10;i++)
        {
            futures.add(executorService.submit(new TaskWithResult(i)));
        }
        for (Future<String> fs : futures)
        {

            try {
                System.out.println(fs.get());
            }catch (ExecutionException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                executorService.shutdown();
            }

        }
//        System.out.println("lalal0");
    }
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    private  int id;
    public  TaskWithResult(int id)
    {
        this.id= id;
    }

    @Override
    public String call() throws Exception {
        return  "result "+id;
    }
}
