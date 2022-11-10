package Inheritance.EqualsHashcode;

import java.util.Objects;

public class EqualsHashCodeStudying {
    int a, b;

    EqualsHashCodeStudying(int a, int b){
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        EqualsHashCodeStudying ehcs1 = new EqualsHashCodeStudying(5, 10);
        EqualsHashCodeStudying ehcs2 = new EqualsHashCodeStudying(5, 10);
        EqualsHashCodeStudying ehcs3 = new EqualsHashCodeStudying(20, 40);
        System.out.println(ehcs1.hashCode());
        System.out.println(ehcs2.hashCode());
        System.out.println(ehcs3.hashCode());
        if (ehcs1.equals(ehcs2)) System.out.println("echs1 == echs2");
        else System.out.println("echs1 != echs2");
        if (ehcs1.equals(ehcs3)) System.out.println("echs1 == echs3");
        else System.out.println("echs1 != echs3");
        if (ehcs2.equals(ehcs3)) System.out.println("echs2 == echs3");
        else System.out.println("echs2 != echs3");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass() || obj.hashCode() != this.hashCode()) return false;
        EqualsHashCodeStudying guest = (EqualsHashCodeStudying) obj;
        if (guest.a != this.a || guest.b != this.b) return false;
        return true;
    }

    @Override
    public int hashCode(){
        int a = this.a / 2;
        int b = this.b / 2;
        return a + b;
    }
}
