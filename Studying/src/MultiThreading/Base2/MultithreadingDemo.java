package MultiThreading.Base2;

public class MultithreadingDemo {
    public static void main(String[] args) {
        ForCycleThread fct1 = ForCycleThread.createAndStart();
        ForCycleThread fct2 = ForCycleThread.createAndStart();
        ForCycleThread fct3 = ForCycleThread.createAndStart();
    }
}
