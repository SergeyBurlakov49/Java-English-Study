package IO.Serialization.Transient;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TransientObjWriter {
    public static void main(String[] args) {

        File file = new File("TransientTest.bin");

        TransientClass obj1 = new TransientClass(10, 20);
        TransientClass obj2 = new TransientClass(30, 40);

        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos))
        {
            oos.writeObject(obj1);
            oos.writeObject(obj2);
        }
        catch (IOException exc){
            exc.printStackTrace();
        }

        System.out.println(obj1);
        System.out.println(obj2);
    }
}
