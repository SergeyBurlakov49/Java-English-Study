package MultiThreading.Syncronizing;

public class Synchronized implements Runnable{

    public Thread thrd;

    Synchronized(){
        thrd = new Thread(this);
    }

    static int x = 10;

    @Override
     public void run() {
        synchronized (this) {
            x += 5;
            System.out.println(x);
            x -= 5;
        }
    }

    public static Synchronized createAndRun(){
        Synchronized myThread = new Synchronized();
        myThread.thrd.start();
        return myThread;
    }
}
