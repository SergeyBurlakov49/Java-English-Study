package MultiThreading.Base2;

public class MultithreadingDemo {
    public static void main(String[] args) throws InterruptedException {
        ForCycleThread fct1 = ForCycleThread.createAndStart();
        ForCycleThread fct2 = ForCycleThread.createAndStart();
        ForCycleThread fct3 = ForCycleThread.createAndStart();
        fct1.thrd.join();
        fct2.thrd.join();
        fct3.thrd.join();
        System.out.println("Done !");
    }
}
