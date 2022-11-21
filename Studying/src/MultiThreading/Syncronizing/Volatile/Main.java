package MultiThreading.Syncronizing.Volatile;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
        Thread.sleep(5000);
        myThread.doRun = false;
        thread.join();
        System.out.println("Всё!");
    }
}
