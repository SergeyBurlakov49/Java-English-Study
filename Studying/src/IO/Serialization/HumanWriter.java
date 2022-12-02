package IO.Serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class HumanWriter {
    public static void main(String[] args) {

        Human human1 = new Human("Vasya", 18);
        Human human2 = new Human("Petya", 20);
        File file = new File("humans.bin");

        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos))
        {
            oos.writeObject(human1);
            oos.writeObject(human2);
        }
        catch (IOException exc){
            exc.printStackTrace();
        }
    }
}
