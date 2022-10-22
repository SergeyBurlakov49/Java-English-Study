package Lambda_n_References.PredefinedInterfaces;

import java.util.function.Supplier;

// функциональный интерфейс Supplier создает объект некоторого класса, ничего не принимая в качестве аргументов

public class SupplierUsage {
    public static void main(String[] args) {
        Supplier<Demo> sobj = Demo::new;    /* в данном случае я решил воспользоваться конструктором класса Demo
                                               в качестве возвращаемого объекта */
        sobj.get();
    }
}

class Demo {
    public Demo(){
        System.out.println("This is a constructor!");
    }
}
