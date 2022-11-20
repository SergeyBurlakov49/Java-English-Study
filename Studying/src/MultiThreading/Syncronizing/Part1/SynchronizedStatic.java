package MultiThreading.Syncronizing.Part1;

public class SynchronizedStatic implements Runnable{

    public Thread thrd;

    SynchronizedStatic(){
        thrd = new Thread(this);
    }

    static int x = 10;

    public static SynchronizedStatic createAndRun(){
        SynchronizedStatic myThread = new SynchronizedStatic();
        myThread.thrd.start();
        return myThread;
    }

    @Override
    public void run() {
        addAndShow();
    }

    public static synchronized void addAndShow(){
        x += 5;
        System.out.println(x);
        x -= 5;
    }
//     public void run() {
//        synchronized (Synchronized.class /* Сам хз, что это такое ваще, но таким образом можно синхронизироваться
//                                            на класс.
//                                            P.S. по сути, объект-монитор не особо имеет значения, главное, что
//                                            он одинаковый. Но для статического метода синхронизироваться на этот
//                                            объект эстетично и правильно. Однако в конечном итоге я использовал
//                                            синхронизированный статический метод и ран отдельно. Этот метод
//                                            сам по себе синхронизируется на класс. Надо бы теперь попробовать
//                                            синхронизироваться на объект класса, а не на класс.*/) {
//            x += 5;
//            System.out.println(x);
//            x -= 5;
//        }
//    }


}
