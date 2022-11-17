package IO;

import java.io.*;

public class RandomAccess {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/megas/OneDrive/Рабочий стол/Projects/Java-English-Study/randomAccessFileTest.txt");
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")){
            raf.writeLong(1);
            raf.writeLong(2);
            raf.writeLong(3);
            raf.writeLong(4);
            raf.seek(3*8);
            System.out.println(raf.readLong());
            raf.seek(1*8);
            System.out.println(raf.readLong());
            raf.seek(2*8);
            System.out.println(raf.readLong());
            raf.seek(0*8);
            System.out.println(raf.readLong());
        }
    }
}
