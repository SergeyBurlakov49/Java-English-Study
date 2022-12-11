package Exceptions;

import java.io.IOException;

public class Arithmetic_n_IndexExc {
    public static void exc() throws Throwable{
        Throwable throwable = null;
        int [] nums = {8, 4, 5, 6, 10, 8};
        int [] dividers = {3, 2, 0, 4, 0, 6, 1};
        for (int i = 0; i < dividers.length; i++){
            try {
                System.out.println(nums[i] / dividers[i]);
            }
            catch (ArithmeticException exc){
                System.out.println(nums[i]);
            }
            catch (ArrayIndexOutOfBoundsException | ArrayStoreException exc){
                throwable = exc.fillInStackTrace();
            }
        }

        try {
            throw throwable;
        }

        catch (Throwable exc){
            System.out.println("exc.getLocalizedMessage()");
            System.out.println(exc.getLocalizedMessage() + "\n");
            System.out.println("exc.getMessage()");
            System.out.println(exc.getMessage() + "\n");
            System.out.println("exc.toString()");
            System.out.println(exc.toString() + "\n");
        }
        try {
            throw throwable;
        }
        finally {
            System.out.print("Запомни, брат, простую фразу: ");
        }
    }
}
