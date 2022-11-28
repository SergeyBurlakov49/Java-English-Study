package Generics.GenericInterface;

public class ImplementingClass <T> implements GenericInterface<T>{

    T [] arr;

    ImplementingClass(T [] arr){
        this.arr = arr;
    }

    @Override
    public boolean contains(T o) {
        if (o == null) return false;
        for (T c:arr){
            if (c == o) return true;
        }
        return false;
    }
}
