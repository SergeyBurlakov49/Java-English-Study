package MultiThreading.Syncronizing.CountDownLatchTest;

import java.util.concurrent.CountDownLatch;

public class Car implements Runnable{

    public CountDownLatch race;
    public int arriveTime;
    public int number;

    public Car(CountDownLatch race, int arriveTime, int number){
        this.race = race;
        this.arriveTime = arriveTime;
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Car " + number + " has started ride to race");
        try {
            Thread.sleep(arriveTime);
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }
        System.out.println("Car " + number + " has arrived on the race");
        race.countDown();
    }
}
