package _IO;

import java.io.*;

public class FileCompare {
    public static void main(String[] args) {
        File file = new File("C:/Users/megas/OneDrive/Рабочий стол/Projects/Java-English-Study/compare.txt");
        File similar_file = new File("C:/Users/megas/OneDrive/Рабочий стол/Projects/Java-English-Study/compare_similar.txt");
        File different_file = new File("C:/Users/megas/OneDrive/Рабочий стол/Projects/Java-English-Study/different_similar.txt");
    }

    public static boolean fileCompare(File a, File b) throws IOException {
        long aLength = a.length();
        long bLength = b.length();
        if (aLength != bLength) return false;
        try(FileInputStream fisA = new FileInputStream(a);
            FileInputStream fisB = new FileInputStream(b);
            DataInputStream disA = new DataInputStream(fisA);
            DataInputStream disB = new DataInputStream(fisB)){
            int iA = 0;
            int iB = 0;
            
        }
    }
}
