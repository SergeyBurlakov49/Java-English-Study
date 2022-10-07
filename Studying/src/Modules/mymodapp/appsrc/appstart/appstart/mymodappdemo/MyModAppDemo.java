package Modules.mymodapp.appsrc.appstart.appstart.mymodappdemo;

import Modules.mymodapp.appsrc.appfuncs.appfuncs.simplefuncs.SimpleMathFuncs;

public class MyModAppDemo {
    public static void main(String[] args) {
        System.out.println("Число 10 четное? - " + SimpleMathFuncs.isEven(10));
        System.out.println("Факториал числа 10 = " + SimpleMathFuncs.factorial(10));
        System.out.println("Число 10 в квадрате = " + SimpleMathFuncs.pow(10, 2));
    }
}
