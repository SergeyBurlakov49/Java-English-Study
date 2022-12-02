package IO.Serialization.Transient;

import java.io.*;

public class TransientObjReader {
    public static void main(String[] args) {

        File file = new File("TransientTest.bin");

        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis))
        {
            TransientClass obj1 = (TransientClass) ois.readObject();
            TransientClass obj2 = (TransientClass) ois.readObject();
            System.out.println(obj1);
            System.out.println(obj2);
        }
        catch (IOException | ClassNotFoundException exc){
            exc.printStackTrace();
        }
    }
}
