package Modules.mymodapp.appsrc.appfuncs.appfuncs.simplefuncs;

//класс, содержащий простые математические операции

public class SimpleMathFuncs {

    public static boolean isEven (int x){ return x % 2 == 0; } // статический метод для определения четности числа

    public static int factorial (int x) { // статический метод для вычисления факториала
        int fact = 1;
        for (int x1 = x; x1 > 0; x1--){
            fact *= x1;
        }
        return fact;
    }

    public static int pow(int x, int pow){return (int) Math.pow(x, pow);} // статический метод для возведения в степень

}
