package MultiThreading.WaitNotify;

public class Producer implements Runnable{
    final Shop shop;

    Producer(Shop shop){
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++){
            try {
                produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Produced some stuff!");
        }
        System.out.println("I'm tired");
    }

    public void produce() throws InterruptedException {
        synchronized (shop){
            shop.production++;
            Thread.sleep(1000);
            shop.notifyAll();
        }
    }
}
