package OtherStuff.isSimple;

public class isSimpleDemo {
    public static void main(String[] args) {
        for (int i = 3; i <= 100; i++){
            if (isSimple(i)) System.out.println(i + " - простое число.");
        }
    }

    public static boolean isSimple(int x){
        for (int i = x - 1; i > 1; i--){
            if (x % i == 0) return false;
        }
        return true;
    }
}
