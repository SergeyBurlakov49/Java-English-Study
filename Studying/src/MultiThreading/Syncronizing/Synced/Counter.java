package MultiThreading.Syncronizing.Synced;

public class Counter {

    public int x;

    public Counter(){
        x = 0;
    }

    public synchronized void inc(){
        x++;
    }

    public synchronized void dec(){
        x--;
    }
}
