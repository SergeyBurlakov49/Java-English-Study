package DataTypes_n_Operators;

public class IncrDecr {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int a = x++;
        int b = ++y;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
