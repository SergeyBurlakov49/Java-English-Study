package MultiThreading.Syncronizing.Volatile;

public class MyThread implements Runnable{
    /** Хоть пиши volatile перед переменной, хоть не пиши, а цикл все равно останавливается как надо. Но зато я понял,
     *  что synchronized подразумевает volatile у всех полей объекта монитора.*/
    public boolean doRun = true;

    @Override
    public void run() {
        while (doRun){
            System.out.println("Doing some...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }
        }
    }

}
