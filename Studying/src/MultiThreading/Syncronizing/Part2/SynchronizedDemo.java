package MultiThreading.Syncronizing.Part2;

public class SynchronizedDemo {
    public static void main(String[] args) {
        SyncronizedObject so = new SyncronizedObject();
        ThreadGroup tg = new ThreadGroup("my ThreadGroup"); // Группа потоков. Хз пока, зачем они нужны.
        Thread thrd1 = new Thread(tg, so, "1");             // Конструктор, принимающий ThreadGroup и Runnable ob.
        Thread thrd2 = new Thread(tg, so, "2");
        Thread thrd3 = new Thread(tg, so, "3");
        Thread thrd4 = new Thread(tg, so, "4");
        Thread thrd5 = new Thread(tg, so, "5");
        thrd1.start();
        thrd2.start();
        thrd3.start();
        thrd4.start();
        thrd5.start();
    }
}
