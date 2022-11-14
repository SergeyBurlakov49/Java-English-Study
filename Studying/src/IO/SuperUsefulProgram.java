package IO;

import java.io.IOException;

public class SuperUsefulProgram {
    public static void main(String[] args) throws IOException {
        byte [] data = new byte[20];
        System.out.println("Type the text");
        System.in.read(data);
        System.out.print("You've typed: ");
        for (byte b:data){
            if (b != 0 && b != 10)
            System.out.print((char) (b));
        }
        System.out.println(".");
    }
}
