package IO;

import java.io.*;
;

public class FileCompare {
    public static void main(String[] args) {
        File file = new File("C:/Users/megas/OneDrive/Рабочий стол/Projects/file.txt");
        File similarFile = new File("C:/Users/megas/OneDrive/Рабочий стол/Projects/file 2.txt");
        File differentFile = new File("C:/Users/megas/OneDrive/Рабочий стол/Projects/file 2.txt");
    }

    public static boolean fileCompare(File a, File b) throws IOException {
        byte [] dataA = new byte[2048];
        byte [] dataB = new byte[2048];

    }
}
