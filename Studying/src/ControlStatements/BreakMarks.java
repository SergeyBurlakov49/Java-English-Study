package ControlStatements;

public class BreakMarks {
    public static void main(String[] args) {
        mark:
        for (int i = 0; i <= 10; i++){
            System.out.println("foo 1");
            for (int i1 = 0; i <= 10; i++){
                System.out.println("foo 2");
                for (int i2 = 0; i <= 10; i++){
                    System.out.println("foo 3");
                    for (int i3 = 0; i <= 10; i++){
                        System.out.println("foo 4");
                        break mark;
                    }
                }
            }
        }
    }
}
