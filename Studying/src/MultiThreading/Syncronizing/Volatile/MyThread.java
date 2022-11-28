package MultiThreading.Syncronizing.Volatile;

public class MyThread implements Runnable{
    /** Короче, если занять поток каким-нибудь делом, то он не будет подтягивать значение булевой переменной из общей
     *  кучи, и тут в дело вступает ключевое слово volatile. Прошлый вариант цикла предполагал вывод сообщения в консоль
     *  и чилл в течение секунды. И этот поток умудрялся подтягивать значения переменных из общего heap. Таким образом,
     *  ключевое слово volatile не имело смысла. Ну и ну...*/
    public volatile boolean doRun = true;

    @Override
    public void run() {
        while (doRun){
            int i = 0;
            }
        }
    }

