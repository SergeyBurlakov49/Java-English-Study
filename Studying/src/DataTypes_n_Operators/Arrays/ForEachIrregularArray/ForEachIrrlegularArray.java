package DataTypes_n_Operators.Arrays.ForEachIrregularArray;

public class ForEachIrrlegularArray {
    public static void main(String[] args) {
        int [][] array =    {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9, 10}};
        int sum = 0;
        for (int[] i:array){
            for (int i1:i){
                sum += i1;
            }
        }
        System.out.println(sum);
    }
}
