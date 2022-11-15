package IO;

import java.io.*;

public class ImageToBytes {
    public static void main(String[] args) throws IOException{
        File file = new File("C:/Users/megas/OneDrive/Рабочий стол/Projects/TN-S.png");
        File file2 = new File("C:/Users/megas/OneDrive/Рабочий стол/Projects/new.png");
        byte [] arr = new byte[(int)file.length()];
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(file2);
        fis.read(arr);
        for (int i = arr.length - 1; i >= 0; i--){
            fos.write(arr[i]);
        }
        fos.close();
        fis.close();
    }
}
