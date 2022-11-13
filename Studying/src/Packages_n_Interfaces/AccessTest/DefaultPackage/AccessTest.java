
package Packages_n_Interfaces.AccessTest.DefaultPackage;

public class AccessTest {

    private static void privateSameClass(){}
    static void defaultSameClass(){}
    protected static void protectedSameClass(){}
    public static void publicSameClass(){}

    public static void main(String[] args) {

        privateSameClass();     //  В том же самом классе доступны мемберы с любым модификатором доступа
        defaultSameClass();     //
        protectedSameClass();   //
        publicSameClass();      //

        // Inherit.privateInheritClass();   //  Из класса-наследника в том же пакете недоступен приватный мембер,
        Inherit.defaultInheritSP();         //  а protected, public и default - доступны
        Inherit.protectedInheritSP();       //
        Inherit.publicInheritSP();          //

        // SomeClass.privateInheritSomeClass(); //  В рандомном классе в том же пакете та же картина, что и в
        SomeClass.defaultInheritSomeClass();    //  клaссе-наследнике в том же пакете
        SomeClass.protectedInheritSomeClass();  //
        SomeClass.publicInheritSomeClass();     //


    }
}
