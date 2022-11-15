package IO;

import java.io.*;


public class DataReadWrite {
    public static void main(String[] args) throws IOException {
        File dataFile = new File("C:/Users/megas/OneDrive/Рабочий стол/Projects/datafile.txt");
        try (FileOutputStream fos = new FileOutputStream(dataFile);
             DataOutputStream dos = new DataOutputStream(fos);
             FileInputStream fis = new FileInputStream(dataFile);
             DataInputStream dis = new DataInputStream(fis)){
            dos.writeBoolean(false);
            dos.writeInt(20);
            dos.writeDouble(3980.44);
            boolean b = dis.readBoolean();
            int i = dis.readInt();
            double d = dis.readDouble();
            System.out.println("b = " + b);
            System.out.println("i = " + i);
            System.out.println("d = " + d);
        }
    }
}
