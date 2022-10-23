package ControlStatements;

import java.io.IOException;

public class Read {
    public static void main(String[] args) throws IOException {
        System.out.println("Type the symbol");
        char ch = (char) System.in.read();
        System.out.println(ch);
    }
}
