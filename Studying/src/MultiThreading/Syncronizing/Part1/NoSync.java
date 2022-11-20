package MultiThreading.Syncronizing.Part1;

public class NoSync implements Runnable{

    public Thread thrd;

    NoSync(){
        thrd = new Thread(this);
    }

    static int x = 10;

    @Override
    public void run() {
        x += 5;
        System.out.println(x);
        x -= 5;
    }

    public static NoSync createAndRun(){
        NoSync myThread = new NoSync();
        myThread.thrd.start();
        return myThread;
    }
}
