package IO;

import java.io.*;

public class Prikol {
    public static void main(String[] args) throws IOException {
        File excel = new File("C:/Users/megas/OneDrive/Рабочий стол/Projects/Курсач.docx");
        FileInputStream fis = new FileInputStream(excel);
        byte [] data = new byte[228];
        int i = 0;
        while (i != -1){
            i = fis.read(data);
            for (byte b:data){
                System.out.print(b);
            }
        }
        fis.close();
    }
}
