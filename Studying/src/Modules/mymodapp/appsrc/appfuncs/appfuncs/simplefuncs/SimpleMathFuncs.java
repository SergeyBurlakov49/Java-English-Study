package Modules.mymodapp.appsrc.appfuncs.appfuncs.simplefuncs;

public class SimpleMathFuncs {

    public static boolean isEven (int x){ return x % 2 == 0; }

    public static int factorial (int x) {
        int fact = 1;
        for (int x1 = x; x1 > 0; x1--){
            fact *= x1;
        }
        return fact;
    }

    public static int pow(int x, int pow){return (int) Math.pow(x, pow);}

}
