package ControlStatements;

public class Switch {
    public static void main(String[] args) {
        int i = 10;
        switch (i){
            case 1:
                System.out.println("Foo 1");
                break;
            case 10:
                System.out.println("Foo 2");
                break;
            default:
                System.out.println("Foo 3");
                break;
        }
    }
}
