package MultiThreading.Interrupting;

public class RunnableCycle implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++){
            if (Thread.currentThread().isInterrupted()){
                System.out.println("That's all folks!");
                break;
            }
            System.out.println("Тред " + Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(1000);             // а тут возникает такая ситуация, что если метод прерывают во
            } catch (InterruptedException exc) {     // время его сна, то возникает InterruptedException, поэтому в
                Thread.currentThread().interrupt();  // блоке catch тред повторно прерывает сам себя, после чего
                                                     // срабатывает условие в начале цикла.
            }
        }
    }
}
