package Thinking_in_java.Thread.Synchronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by asus on 2017/3/15.
 */
public class WaxOMatic {

    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new WaxOff(car));
        executorService.execute(new WaxOn(car));
        TimeUnit.SECONDS.sleep(5);
        executorService.shutdownNow();//中断全部线程
    }
}

class Car{

    private boolean waxOn = false;//用来表示打蜡-抛光的处理状态
    /**
     *  打蜡完成
     */
    public  synchronized void waxed(){
        waxOn = true;//准备进行buffed抛光
        notifyAll();
    }

    /**
     * 抛光完成
     */
    public synchronized void buffed(){
        waxOn = false;// 准备为另一个 进行 waxed 打蜡
        notifyAll();

    }

    /**
     * 正在抛光，等待着准备打蜡
     * @throws InterruptedException
     */
    public synchronized void waitForWaxing() throws InterruptedException {
        while (!waxOn){
            wait();
        }
    }

    /**
     * 正在打蜡，等待着准备抛光
     * @throws InterruptedException
     */
    public synchronized void waitForBuffing() throws InterruptedException {
        while (waxOn){
            wait();
        }
    }
}

class WaxOn implements Runnable{
    private  Car car;

    public WaxOn(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        try
        {
            while (!Thread.interrupted()){
                System.out.println("开始打蜡");
                TimeUnit.MILLISECONDS.sleep(200);//模拟打蜡用的时间
                car.waxed();//打蜡完成
                car.waitForBuffing();
            }
        }catch (InterruptedException e){
            System.out.println("打蜡 --> 中断异常");
        }
        System.out.println("完成打蜡");
    }
}

class WaxOff implements Runnable{
    private Car car;

    public WaxOff(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        try
        {
            while (!Thread.interrupted()){
                car.waitForWaxing();
                System.out.println("开始抛光");
                TimeUnit.MILLISECONDS.sleep(200);//模拟抛光时间
                car.buffed();//抛光完成
            }
        }catch (InterruptedException e){
            System.out.println("抛光 --> 中断异常");
        }
        System.out.println("完成抛光");
    }
}
