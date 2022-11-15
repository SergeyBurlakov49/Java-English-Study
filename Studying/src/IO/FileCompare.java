package IO;

import java.io.*;

public class FileCompare {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/megas/OneDrive/Рабочий стол/Projects/compare.txt");
        File similar_file = new File("C:/Users/megas/OneDrive/Рабочий стол/Projects/compare_similar.txt");
        File different_file = new File("C:/Users/megas/OneDrive/Рабочий стол/Projects/different_similar.txt");
        System.out.println(fileCompare(file, similar_file));
        System.out.println(fileCompare(file, different_file));
    }

    public static boolean fileCompare(File a, File b) throws IOException {
        long aLength = a.length();
        long bLength = b.length();
        if (aLength != bLength) return false;
        try(FileInputStream fisA = new FileInputStream(a);
            FileInputStream fisB = new FileInputStream(b)){
            byte [] arrA = new byte[1024];
            byte [] arrB = new byte[1024];
            int i1 = 0, i2 = 0;
            while (i1 != -1 && i2 != -1){
               i1 = fisA.read(arrA);
               i2 = fisB.read(arrB);
               for (int i = 0; i < arrA.length; i++){
                   if (arrA[i] != arrB[i]) return false;
               }
            }
        }
        return true;
    }
}
