package OtherStuff.TimeMeasuring;

public class Demo {
    public static void main(String[] args) {
        long before = System.nanoTime();
        for (int i = 0; i <= 1000; i++){
            if (false){
                System.out.println("Do smth");
            }
        }
        long after = System.nanoTime();
        System.out.println("Проверка условия 1000 раз заняла " + (after - before) + " наносекунд");
    }
}
