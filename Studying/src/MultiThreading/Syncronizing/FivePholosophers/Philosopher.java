package MultiThreading.Syncronizing.FivePholosophers;

import java.util.concurrent.Semaphore;

public class Philosopher implements Runnable{
    Semaphore waiter;
    public final Fork leftFork, rightFork;
    public String name;

    public Philosopher(Fork leftFork, Fork rightFork, Semaphore waiter,String name) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.name = name;
        this.waiter = waiter;
    }

    @Override
    public void run() {
        for(;;){
            try {
                eat();
                think();
            }
            catch (InterruptedException exc){
                exc.printStackTrace();
            }
        }
    }

    public void eat() throws InterruptedException {
        waiter.acquire();
        if (!leftFork.occupied) {
            synchronized (leftFork) {
                if (!rightFork.occupied){
                    synchronized (rightFork) {
                        leftFork.occupied = true;
                        rightFork.occupied = true;
                        System.out.println(name + " has started eating.");
                        Thread.sleep(1);
                        leftFork.occupied = false;
                        rightFork.occupied = false;
                        waiter.release();
                    }
                }
            }
        }
    }

    public void think() throws InterruptedException {
        Thread.sleep(1);
    }
}
