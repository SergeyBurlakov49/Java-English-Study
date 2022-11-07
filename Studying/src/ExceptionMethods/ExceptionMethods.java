package ExceptionMethods;

public class ExceptionMethods {
    public static void main(String[] args) {
        try {
            int [] array = new int [3];
            array [7] = 4;
        }
        catch (IndexOutOfBoundsException exc){
            Throwable exc1 = exc.fillInStackTrace();
            System.out.println("getLocalizedMessage()");
            System.out.println(exc.getLocalizedMessage());
            System.out.println("\n");
            System.out.println("getMessage()");
            System.out.println(exc.getMessage());
            System.out.println("\n");
            System.out.println("printStackTrace()");
            exc.printStackTrace();
            System.out.println("\n");
            System.out.println("toString()");
            System.out.println(exc.toString());
        }
    }
}
