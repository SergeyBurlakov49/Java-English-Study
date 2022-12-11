package Packages_n_Interfaces.Interfaces;

public class Demo {
    public static void main(String[] args) {
        Cat barsik = new Cat ("Barsik");
        Human ivan = new Human("Ivan");
        LoudHuman nikita_morozov = new LoudHuman("Nikita");
        Platypus platon = new Platypus("Platon");
        SayI [] room = {barsik, ivan, nikita_morozov, platon}; /* Можно создать массив интерфейса и наполнить его
                                                                  объектами классов, имплементирующих данный
                                                                  интерфейс                                           */

        for (SayI entity:room){                                /* И даже методы интерфейса для объектов массива
                                                                  использовать, полиморфизм в действии, ема           */
            entity.say();
        }
        System.out.println();
        barsik.sleep();
        System.out.println();
        nikita_morozov.shout();
        System.out.println();
        SayI.foo();
        System.out.println();
        SayI.bar();
    }
}
