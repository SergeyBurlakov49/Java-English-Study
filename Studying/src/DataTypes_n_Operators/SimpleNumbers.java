package DataTypes_n_Operators;

public class SimpleNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++){
            boolean complicated = false;
            for (int i2 = i - 1; i2 > 1; i2--){
                if (i % i2 == 0){
                    complicated = true;
                }
            }
            if (!complicated){
                System.out.println("Number " + i + " is simple");
            }
        }
    }
}
