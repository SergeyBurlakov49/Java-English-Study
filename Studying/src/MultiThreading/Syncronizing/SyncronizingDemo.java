package MultiThreading.Syncronizing;

public class SyncronizingDemo {
    public static void main(String[] args) {
//        NoSync.createAndRun();
//        NoSync.createAndRun();
//        NoSync.createAndRun();
//        NoSync.createAndRun();
//        NoSync.createAndRun();
        Synchronized synchronized_ = new Synchronized();
        synchronized_.thrd.start();
        synchronized_.thrd.start();
        synchronized_.thrd.start();
        synchronized_.thrd.start();
        synchronized_.thrd.start();

    }
}
