package ControlStatements;

import java.io.IOException;

public class IfElse {
    public static void main(String[] args) throws IOException {
        for (;;){
            System.out.println("Type the symbol");
            Character ch = (char) System.in.read();
            if (ch.equals('K')) break;
            else {
                ch = (char) System.in.read();
            }
        }
    }
}
