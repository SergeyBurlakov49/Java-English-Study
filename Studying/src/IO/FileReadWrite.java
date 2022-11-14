package IO;

import java.io.*;


public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("C:/Users/megas/OneDrive/Рабочий стол/Projects/file.txt");
        File outputFile = new File("C:/Users/megas/OneDrive/Рабочий стол/Projects/file 2.txt");
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {
            byte[] data = new byte[20];
            int i = 0;
            while (i != -1) {
                i = fis.read(data);
                if (i != -1) fos.write(data);
            }
            for (byte b : data) {
                if (b != 0 && b != 10)
                    System.out.print((char) (b));
            }
        }
    }
}
