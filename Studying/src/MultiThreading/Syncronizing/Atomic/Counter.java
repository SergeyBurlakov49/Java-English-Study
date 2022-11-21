package MultiThreading.Syncronizing.Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    public AtomicInteger x;

    public Counter(){
        x = new AtomicInteger(0);
    }

    public void inc(){
        x.incrementAndGet();
    }

    public void dec(){
        x.decrementAndGet();
    }
}
