package MultiThreading.Syncronizing.Synced;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thrd1 = new Thread(new DecThread(counter));
        Thread thrd2 = new Thread(new IncThread(counter));
        thrd1.start();
        thrd2.start();
        try {
            thrd1.join();
            thrd2.join();
        }
        catch (InterruptedException exc){
            exc.printStackTrace();
        }
        System.out.println(counter.x);
    }
}
