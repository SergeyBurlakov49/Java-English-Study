package MultiThreading.DaemonThreads;

public class DaemonDemo {
    public static void main(String[] args) {
        Thread mainThread = new Thread(new ForCycleRunnable(10), "Main");
        Thread daemonThread = new Thread(new ForCycleRunnable(100), "Daemon");
        daemonThread.setDaemon(true);
        mainThread.start();
        daemonThread.start();
    }
}
