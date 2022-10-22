package DataTypes_n_Operators;

public class CompBools {
    public static void main(String[] args) {
        if (10 == 10 && 9 == 9) System.out.println("10 = 10, 9 = 9");
        if (10 == 10 || 9 == 9) System.out.println("10 = 10, or 9 = 9, or both");
        if (10 == 10 || 9 == 8) System.out.println("10 = 10, or 9 = 8, or both");
        if (!(10 == 9)) System.out.println("10 != 10");
        if (10 == 10 ^ 9 == 8) System.out.println("or 10 = 10, or 9 = 8");
        int i = 10;
        if (10 == 9 && i++ > 15) System.out.println("you will not see this string");
        System.out.println("i = " + i);
        i = 10;
        if (10 == 9 & i++ > 15) System.out.println("you will not see this string"); /* slower operation does increment
                                                                                       after check 1st expression */
        System.out.println("i = " + i);
    }
}
