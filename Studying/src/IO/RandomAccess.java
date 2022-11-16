package IO;

import java.io.*;

public class RandomAccess {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/megas/OneDrive/Рабочий стол/Projects/randomAccessFileTest.txt");
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")){

        }
    }
}
