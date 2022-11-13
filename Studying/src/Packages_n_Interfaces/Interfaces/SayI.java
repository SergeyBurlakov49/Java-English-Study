package Packages_n_Interfaces.Interfaces;

public interface SayI {
    default void say(){
        System.out.println("...");
    }
    static void foo(){
        System.out.println("Привет, я статический метод foo()");
    }
    static void bar(){
        System.out.println("Привет, я статический метод bar(), сейчас вызову приватный метод bruh() и статитечкий foo()");
        bruh();
        foo();
    }

    static private void bruh(){
        System.out.println("Привет, я приватный метод bruh()");
    }
}
