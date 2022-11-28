package MultiThreading.Syncronizing.CountDownLatchTest;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch race = new CountDownLatch(8);
        new Thread(new Car(race, 2000, 1)).start();
        new Thread(new Car(race, 1000, 18)).start();
        new Thread(new Car(race, 500, 69)).start();
        new Thread(new Car(race, 3000, 228)).start();
        new Thread(new Car(race, 1000, 144)).start();
        new Thread(new Car(race, 2000, 121)).start();
        new Thread(new Car(race, 3000, 14)).start();
        new Thread(new Car(race, 500, 16)).start();
        race.await();
        System.out.println("Race has started!");
    }
}
