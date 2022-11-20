package MultiThreading.Interrupting;

public class InterruptingDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new RunnableCycle(), "Amogus");
        thread.start();
        Thread.sleep(5000);
        thread.interrupt();     // у каждого треда есть булева переменная isInterrupted (или как-то так), в треде можно
                                // сделать проверку посредством метода isInterrupted() и алгоритм каких-то действий,
                                // которые будут завершать работу алгоритма
    }
}
