package MultiThreading.Base;

public class MultithreadingDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ForCycleThread());
        Thread t2 = new Thread(new ForCycleThread());
        Thread t3 = new Thread(new ForCycleThread());
        Thread t4 = new Thread(new ForCycleThread());
        Thread t5 = new Thread(new ForCycleThread());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
