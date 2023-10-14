package org.example;

import java.util.*;

public class Pecs {


    void getNumbers(List<? extends Number> numbers) {
        numbers.get(2);
        numbers.get(3);
        // numbers.add(3); добавлять нельзя
        numbers.add(null); // ничего кроме null
    }

        void addNumbers (List <? super Number > numbers) {

            numbers.add(12.3);
            numbers.add(12);
            numbers.add(10);
            numbers.add(10);
            numbers.add(40);
            numbers.forEach(System.out::println);
        }
        public static void main (String[]args){

            List<Object> objects = new ArrayList<>();
            objects.add("Hello");
            objects.add("Что хочу то добавляю");
            objects.add(null);
            objects.add(10.89);
            objects.add(3, 10);
            objects.add(3.14);
            objects.add(new Pecs());

            new Pecs().addNumbers(objects);
        }
    }




