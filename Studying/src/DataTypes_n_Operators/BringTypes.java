package DataTypes_n_Operators;

public class BringTypes {
    public static void main(String[] args) {
        long l = 123456789990l;
        int i = (int) l;
        System.out.println("i = " + i);     // returns max int count
        double d = 123456.78;
        i = (int) d;
        System.out.println("i = " + i);     // loses fractional part
    }
}
