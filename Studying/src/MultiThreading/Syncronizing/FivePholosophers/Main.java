package MultiThreading.Syncronizing.FivePholosophers;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Fork fork1 = new Fork();
        Fork fork2 = new Fork();
        Fork fork3 = new Fork();
        Fork fork4 = new Fork();
        Fork fork5 = new Fork();
        Semaphore waiter = new Semaphore(4);
        Thread diogenThread = new Thread(new Philosopher(fork1, fork2, waiter,"Diogen"));
        Thread nietzscheThread = new Thread(new Philosopher(fork2, fork3, waiter, "Nietzsche"));
        Thread papichThread = new Thread(new Philosopher(fork3, fork4, waiter, "Papich"));
        Thread stirnerThread = new Thread(new Philosopher(fork4, fork5, waiter, "Stirner"));
        Thread pifagorThread = new Thread(new Philosopher(fork5, fork1, waiter, "Pifagor"));
        diogenThread.start();
        nietzscheThread.start();
        papichThread.start();
        stirnerThread.start();
        pifagorThread.start();
    }
}
