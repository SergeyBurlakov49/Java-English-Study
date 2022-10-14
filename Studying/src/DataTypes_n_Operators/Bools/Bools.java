package DataTypes_n_Operators.Bools;

public class Bools {
    public static void main(String[] args) {
        boolean b = true;
        System.out.println(b);
        if (b) System.out.println("b = true");
        b = false;
        if (b) System.out.println("You will not see this string");
        b = 10 > 9;
        System.out.println(b);
    }
}
