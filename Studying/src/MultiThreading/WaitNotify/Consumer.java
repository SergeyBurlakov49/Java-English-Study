package MultiThreading.WaitNotify;

public class Consumer implements Runnable{
    final Shop chosenShop;
    int gotProducts;

    public Consumer(Shop chosenShop) {
        this.chosenShop = chosenShop;
        gotProducts = 0;
    }

    public void run() {
        while (gotProducts < 10){
            try {
                consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Consumed some stuff!");
        }
        System.out.println("I need some dopamine detox...");
    }

    public void consume() throws InterruptedException {
        synchronized (chosenShop){
            while (chosenShop.production <= 0){
                chosenShop.wait();
            }
            chosenShop.production--;
            gotProducts++;
        }
    }
}
