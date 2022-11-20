package MultiThreading.DaemonThreads;

public class ForCycleRunnable implements Runnable{

    int x;

    public ForCycleRunnable(int x){
        this.x = x;
    }

    @Override
    public void run() {
        for (int i = 0; i <= x; i++){
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
