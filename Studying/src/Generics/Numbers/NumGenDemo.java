package Generics.Numbers;

public class NumGenDemo {
    public static void main(String[] args) {
        NumberGenerics<Integer> ng1 = new NumberGenerics<>(10);
        NumberGenerics<Integer> ng2 = new NumberGenerics<>(20);
        System.out.println(ng1.sum(ng2));
    }
}
