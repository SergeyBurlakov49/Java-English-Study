package MultiThreading.Syncronizing.Synced;

public class IncThread implements Runnable{

    Counter ob;

    public IncThread(Counter ob) {
        this.ob = ob;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++){
            ob.inc();
        }
    }
}
