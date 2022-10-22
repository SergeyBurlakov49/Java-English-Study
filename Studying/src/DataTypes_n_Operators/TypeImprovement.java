package DataTypes_n_Operators;

public class TypeImprovement {
    public static void main(String[] args) {
        byte b = 10;
        // b = b * b; - doesn't compile :/
        b = (byte) (b * b); // 0_0
    }
}
