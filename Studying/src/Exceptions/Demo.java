package Exceptions;

public class Demo {
    public static void main(String[] args) {
        try {
            Arithmetic_n_IndexExc.exc();
        }
        catch (Throwable exc){
            System.out.println("все будет, но не сразу.");
        }
    }
}
