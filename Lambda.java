package org.example;

import java.util.function.*;

@FunctionalInterface

interface MyInterface {
    double getGoldenRatioValue();
}

public class Lambda {
    public static void main( String[] args ) {

//декларируем ссылку на функциональный интерфейс
        MyInterface ref;
//используем Lambda Expression
        ref = () -> 1.61803; // нет приманимающего значения  и возвращает double

        System.out.println("Value of Golden Ratio = " + ref.getGoldenRatioValue());
    }
}
class MyInterface2 {

    public static void main(String[] args) {

        ToIntFunction<String> length = x -> x.length();
        ToIntBiFunction<String, Integer> lenght = (t, u)-> t.lastIndexOf("This is an example of predefined functional interface.", 4); ;
        System.out.println(length.applyAsInt("This is an example of predefined functional interface."));
        System.out.println(lenght);


    }



}


