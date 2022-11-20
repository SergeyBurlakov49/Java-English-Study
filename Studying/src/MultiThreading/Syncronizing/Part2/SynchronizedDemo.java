package MultiThreading.Syncronizing.Part2;

public class SynchronizedDemo {
    public static void main(String[] args) {
        SyncronizedObject so = new SyncronizedObject();
        Thread thrd1 = new Thread(so);
        Thread thrd2 = new Thread(so);
        Thread thrd3 = new Thread(so);
        Thread thrd4 = new Thread(so);
        Thread thrd5 = new Thread(so);
        thrd1.start();
        thrd2.start();
        thrd3.start();
        thrd4.start();
        thrd5.start();
    }
}
