package Thinking_in_java.Thread.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by asus on 2017/3/12.
 */
public class MainThread {
   public  static  void  main(String []arg)
   {
//       Liftoff liftoff = new Liftoff();
//       liftoff.run();
//       Thread thread = new Thread(new Liftoff());
//       thread.start();
//       System.out.println("wait");
        int i=5;
       ExecutorService executorService = Executors.newCachedThreadPool();
       //ExecutorService executorService = Executors.newFixedThreadPool(2);
       for (int i1 = 0; i1 < i; i1++) {
          //new Thread(new Liftoff()).start();
           executorService.execute(new Liftoff());
       }
       executorService.shutdown();

           System.out.println("wait");

   }

}
