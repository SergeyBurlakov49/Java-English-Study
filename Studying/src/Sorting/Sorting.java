package Sorting;

public class Sorting {
    public static void main(String[] args) {
        int [] array1 = {7, 3, 4, 1, 6, 2, 5, 9, 0, 8};
        int [] new_array = dumb_sorting(array1);
        for (int i:new_array){
            System.out.println(i);
        }
        int [] array2 = {7, 3, 4, 1, 6, 2, 5, 9, 0, 8};
        int [] new_array2 = bubble_sorting(array2);
        for (int i:new_array2){
            System.out.println(i);
        }
    }
    public static int [] dumb_sorting(int [] arr){
        for (int i = 1; i < arr.length; i++){
            if (arr[i-1] > arr[i]){
                int buffer = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = buffer;
                i = 0;
            }
        }
        return arr;
    }
    public static int [] bubble_sorting(int [] arr){
        for (int counter = arr.length - 1; counter > 0; counter--){
            for (int i = 1; i <= counter; i++){
                if (arr[i - 1] > arr [i]){
                    int buffer = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = buffer;
                }
            }
        }
        return arr;
    }
}
