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
        executorService.shutdownNow();//�ж�ȫ���߳�
    }
}

class Car{

    private boolean waxOn = false;//������ʾ����-�׹�Ĵ���״̬
    /**
     *  �������
     */
    public  synchronized void waxed(){
        waxOn = true;//׼������buffed�׹�
        notifyAll();
    }

    /**
     * �׹����
     */
    public synchronized void buffed(){
        waxOn = false;// ׼��Ϊ��һ�� ���� waxed ����
        notifyAll();

    }

    /**
     * �����׹⣬�ȴ���׼������
     * @throws InterruptedException
     */
    public synchronized void waitForWaxing() throws InterruptedException {
        while (!waxOn){
            wait();
        }
    }

    /**
     * ���ڴ������ȴ���׼���׹�
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
                System.out.println("��ʼ����");
                TimeUnit.MILLISECONDS.sleep(200);//ģ������õ�ʱ��
                car.waxed();//�������
                car.waitForBuffing();
            }
        }catch (InterruptedException e){
            System.out.println("���� --> �ж��쳣");
        }
        System.out.println("��ɴ���");
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
                System.out.println("��ʼ�׹�");
                TimeUnit.MILLISECONDS.sleep(200);//ģ���׹�ʱ��
                car.buffed();//�׹����
            }
        }catch (InterruptedException e){
            System.out.println("�׹� --> �ж��쳣");
        }
        System.out.println("����׹�");
    }
}
