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
        int [] array3 = {7, 3, 4, 1, 6, 2, 5, 9, 0, 8};
        int [] new_array3 = quick_sorting(array3);
        for (int i:new_array3){
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

    public static int [] quick_sorting(int [] input_array){
        switch (input_array.length){
            case 1: return input_array;
            case 2: {
                if (input_array[0] > input_array[1]){
                    int buffer = input_array[1];
                    input_array[1] = input_array[0];
                    input_array[0] = buffer;
                }
                return input_array;
            }
        }
        int sum = 0;
        for (int i: input_array){
            sum += i;
        }
        int avrg = sum / input_array.length;
        int difference = Math.abs(avrg - input_array[0]);
        int backbone = 0;
        for (int i = 1; i < input_array.length; i++){
            if (Math.abs(avrg - input_array[i]) < difference){
                backbone = i;
            }
        }
        return input_array;
    }

    /*public static int [] quick_sorting(int ... arr){
        if (arr.length == 2){
            if (arr[0] > arr[1]){
                int buffer = arr[0];
                arr[0] = arr[1];
                arr[1] = buffer;
            }
            return arr;
        }
        if (arr.length == 1) return arr;
        int sum = 0;
        for (int i:arr){
            sum += i;
        }
        int avrg = sum / arr.length;
        int max_count = arr.length - 1;
        int min_count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] <= avrg){
                int buffer = arr[min_count];
                arr[min_count] = arr[i];
                arr[i] = buffer;
                min_count++;
            }
            else {
                int buffer = arr[max_count];
                arr[max_count] = arr[i];
                arr[i] = buffer;
                max_count--;
            }
        }
        int [] min_arr = new int[min_count + 1];
        for (int i = 0; i < min_arr.length; i++){
            min_arr[i] = arr[i];
        }
        int [] max_arr = new int[arr.length - min_arr.length];
        for (int i = 0, i1 = arr.length - 1; i < max_arr.length; i++, i1--){
            max_arr[i] = arr[i1];
        }
        int [] new_min_arr = quick_sorting(min_arr);
        int [] new_max_arr = quick_sorting(max_arr);
        int i = 0;
        for (;i < new_min_arr.length; i++){
            arr[i] = new_min_arr[i];
        }
        for (;i < new_max_arr.length + new_min_arr.length; i++){
            arr[i] = new_max_arr[i  - new_min_arr.length];
        }
        return arr;
    }*/

    /*public static int [] quick_sorting(int [] input_array){
        if (input_array.length == 2){
            if (input_array[0] > input_array[1]){
                int buffer = input_array[0];
                input_array[0] = input_array[1];
                input_array[1] = buffer;
            }
            return input_array;
        }
        if (input_array.length <= 1) return input_array;
        int sum = 0;
        for (int i:input_array){
            sum += i;
        }
        int avrg = sum / input_array.length;
        int min_counter = 0;
        for (int i = 0; i < input_array.length; i++){
            if (input_array[i] < avrg){
                int buffer = input_array[i];
                input_array[i] = input_array[min_counter];
                input_array[min_counter] = buffer;
                min_counter++;
            }
        }
        quick_sort(input_array, 0, min_counter - 1);
        quick_sort(input_array, min_counter, input_array.length - 1);
        return input_array;
    }
    private static void quick_sort(int [] input_array, int start_index, int over_index){
        if (Math.abs(start_index - over_index) == 1){
            if (input_array[0] > input_array[1]){
                int buffer = input_array[0];
                input_array[0] = input_array[1];
                input_array[1] = buffer;
            }
            return;
        }
        if (Math.abs(start_index - over_index) == 0) return;
        int sum = 0;
        for (int i = start_index; i <= over_index; i++){
            sum += i;
        }
        int avrg = sum / input_array.length;
        int min_counter = start_index;
        for (int i = start_index; i <= over_index; i++){
            if (input_array[i] < avrg){
                int buffer = input_array[i];
                input_array[i] = input_array[min_counter];
                input_array[min_counter] = buffer;
                min_counter++;
            }
        }
        quick_sort(input_array, start_index, min_counter - 1);
        quick_sort(input_array, min_counter, over_index);
    }*/
}
