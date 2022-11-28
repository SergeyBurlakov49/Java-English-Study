package Generics.GenericMethod;

public class GenericMethod {
    public static  <T, V extends T> boolean arraysCompare(T[] arr1, V[] arr2){
        if (arr1 == null || arr2 == null) return false;
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
