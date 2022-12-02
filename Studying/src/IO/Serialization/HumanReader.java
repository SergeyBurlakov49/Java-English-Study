package IO.Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class HumanReader {
    public static void main(String[] args) {
        File file = new File("humans.bin");
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis))
        {
            Human human1 = (Human) ois.readObject();
            Human human2 = (Human) ois.readObject();
            System.out.println(human1);
            System.out.println(human2);
        }
        catch (IOException | ClassNotFoundException exc){
            exc.printStackTrace();
        }
    }
}
