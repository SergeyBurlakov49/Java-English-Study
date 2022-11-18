package MultiThreading.Base2;

public class ForCycleThread implements Runnable{

    public Thread thrd;

    ForCycleThread(){
        thrd = new Thread(this);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++){
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static ForCycleThread createAndStart(){
        ForCycleThread fct = new ForCycleThread();
        fct.thrd.start();
        return fct;
    }
}
