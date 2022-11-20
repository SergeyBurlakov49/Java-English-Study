package MultiThreading.Syncronizing.Part2;

public class SyncronizedObject implements Runnable{

    public int x;

    public SyncronizedObject(){
        x = 0;
    }

    @Override
    public synchronized void run() {                    /* В данном случае слово "synchronized" означает, что для потока
                                                           класса  SyncronizedObject объектом-монитором является объект,
                                                           от которого вызываются потоки. Т.е. это не
                                                           synchronizedObject.thrd, а synchronizedObject. Это означает,
                                                           что в отношении synchronizedObject может действовать только
                                                           один synchronizedObject.thrd. */
        add5ShowAndReturn();
    }

    public void /*synchronized*/ add5ShowAndReturn(){   /* Вместо слова "synchronized" в сигнатуре метода run() можно
                                                           оставить его здесь. Это бы означало, что несколько
                                                           synchronizedObject.thrd могут работать одновременно для
                                                           одного synchronizedObject, но как только начинается метод
                                                           add5ShowAndReturn(), то в дело вступает синхронизация и
                                                           треды залетают в этот метод по очереди. */
        x += 5;
        System.out.println(x);
        x -=5;
    }
}
