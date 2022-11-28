package StaticImport;

public class PrintClass {
    public static void print(Object ... arr){
        for (Object o:arr){
            System.out.print(o);
        }
        System.out.print("\n");
    }
}
