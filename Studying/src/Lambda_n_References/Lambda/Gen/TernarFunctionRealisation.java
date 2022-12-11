package Lambda_n_References.Lambda.Gen;

public class TernarFunctionRealisation {
    public static void main(String[] args) {
        TernarFunction<Boolean, Double, Double> doubleCompare = (a, b) -> a.equals(b);
        System.out.println(doubleCompare.func(2.0, 2.0));
    }
}
