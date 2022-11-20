package MultiThreading.WaitNotify;

public class Scene {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Consumer consumer = new Consumer(shop);
        Producer producer = new Producer(shop);
        Thread consumingThread = new Thread(consumer);
        Thread producingThread = new Thread(producer);
        consumingThread.start();
        producingThread.start();
    }
}
