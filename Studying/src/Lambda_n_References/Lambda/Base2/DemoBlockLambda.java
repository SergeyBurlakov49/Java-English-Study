package Lambda_n_References.Lambda.Base2;

import java.util.function.BinaryOperator;

public class DemoBlockLambda {
    public static void main(String[] args) {
        BinaryOperator <Double> hypot = (a, b) -> {double squareSum = Math.pow(a, 2) + Math.pow(b, 2);
                                                   return Math.sqrt(squareSum);};
        System.out.println(hypot.apply(3.0, 4.0));


    }
}
