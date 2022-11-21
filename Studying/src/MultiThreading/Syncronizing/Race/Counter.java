package MultiThreading.Syncronizing.Race;

public class Counter {

    public int x;

    public Counter(){
        x = 0;
    }

    public void inc(){
        x++;
    }

    public void dec(){
        x--;
    }
}
