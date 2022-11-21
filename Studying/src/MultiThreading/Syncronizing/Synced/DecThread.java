package MultiThreading.Syncronizing.Synced;

public class DecThread implements Runnable{
    Counter ob;

    public DecThread(Counter ob){
        this.ob = ob;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++){
            ob.dec();
        }
    }
}
