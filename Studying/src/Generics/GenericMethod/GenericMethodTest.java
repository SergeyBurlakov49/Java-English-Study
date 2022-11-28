package Generics.GenericMethod;

public class GenericMethodTest {
    public static void main(String[] args) {
        Integer [] arr = {1, 2, 3};
        Integer [] sameArr = {1, 2, 3};
        Integer [] diffArr = {1, 2, 4};
        System.out.println(GenericMethod.arraysCompare(arr, sameArr));
        System.out.println(GenericMethod.arraysCompare(arr, diffArr));
    }
}
