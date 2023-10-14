package org.example;

import java.util.Arrays;

class Gen1<T> {
    private T ob; // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen1(T object) {
        this.ob = object;
    }

    // Return ob.
    T getob() {
        return this.ob;
    }

    // Show type of T.
    void showType() {
        System.out.println("Type of T is " +
                this.ob.getClass().getName());
    }
}

// Demonstrate the generic class.
class Es1_Gen1Demo {
    public static void main(String args[]) {
        // Create a Gen1 reference for Integers.
        Gen1<Integer> iOb;

        // Create a Gen1<Integer> object and assign its
        // reference to iOb.  Notice the use of autoboxing
        // to encapsulate the value 88 within an Integer object.
        iOb = new Gen1<Integer>(88);

        // Show the type of data used by iOb.
        iOb.showType();

        // Get the value in iOb. Notice that
        // no cast is needed.
        int v = iOb.getob();
        System.out.println("value: " + v);

        System.out.println();

        // Create a Gen1 object for Strings.
        Gen1<String> strOb = new Gen1<String>("Gen1erics Test");

        // Show the type of data used by strOb.
        strOb.showType();

        // Get the value of strOb. Again, notice
        // that no cast is needed.
        String str = strOb.getob();
        System.out.println("value: " + str);
    }
}
class Box<T> {
    private T[] value;

    @Override
    public String toString() {
        return "value =" + Arrays.toString(value) +
                '}';
    }
//    @SuppressWarnings("unchecked")
    public Box() {
        value = (T[]) new Object[10];
    }
    public T getValue(int index) {

    if (index <0 || index >= 10) {
    throw new Errors();
    }
            return value[index];

    }
    public void setValue(int index,T value ) {
        this.value[index] = value;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>(); // массив Стринг
        Box<Integer> integerBox = new Box<>(); // массив Интов

        Box obj = new Box(); // массив объектов )))

        stringBox.setValue(0, "el 1");
        System.out.println(stringBox);

        integerBox.setValue(1,20);
        System.out.println(integerBox);

        obj.setValue(0,"string");
        obj.setValue(1,1);
        System.out.println(obj);
        Gifts.putGifts();

        Gifts g = new Gifts();
        g.putGifts();


    }
}
class Errors extends RuntimeException {
}
public class Gifts {
    public static void putGifts() {

        Box<String> b = new Box<>();
        b.setValue(0, "robot");
        b.setValue(1, "toy car");
        b.setValue(2, "doll");

        for (int i = 0; i <= 10; i++) {
            try {
                if (i < 9) {
                    System.out.print(b.getValue(i) + ", ");
                } else {
                    System.out.print(b.getValue(i));
                }
            } catch (Errors errors) {
                System.out.println(" Вы вышли за пределлы массива");
            }
        }
        System.out.println();
    }
}
