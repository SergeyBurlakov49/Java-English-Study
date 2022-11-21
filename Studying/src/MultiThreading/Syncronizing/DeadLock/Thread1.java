package MultiThreading.Syncronizing.DeadLock;

public class Thread1 implements Runnable{
    @Override
    public void run() {
        synchronized (Resourse1.class){
            System.out.println("Do smth");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (Resourse2.class){
                System.out.println("Do anthr");
            }
        }
    }
}
