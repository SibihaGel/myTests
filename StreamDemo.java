package org.example;

import org.junit.*;

import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {

        streamApiTest();
        flatMapDemo();
        MapDemo();

        String s = "jlkj";
       String v2 = "jlk;lkj"; // Получение массива значений строки "jlkj"
            // Выполнение операции сравнения, например, с использованием метода compareTo()
            int result = s.compareTo(v2);
            System.out.println(result); // Вывод результата сравнения
        }



    public static void streamApiTest() {

        Arrays.asList("Ser", "gey", "  ", "Zat", "sepin")
                .stream()
                .filter(s -> s.startsWith("Z"))
                .toList()
                .forEach(System.out::println);


    }

    @Test
    public void reduceTest() {
        Assert.assertEquals(
                Integer.valueOf(5),
                Stream.of("Ser", "gey", "  ", "Zat", "sepin")
                        .map(str -> str.length())
                        .reduce(Math::max)
                        .get()
        );
    }

    public static void flatMapDemo() {
        String longString = "Будем разбивать целое предложение на поток слов";
        Stream<String> stream = Stream.of(longString)
                .flatMap((str) -> Arrays.stream(str.split(" ")));
        stream.forEach(System.out::println);
    }

    public static void MapDemo() {
        String longString = "Будем разбивать целое предложение на поток букв и также могем менять буквем";
        Stream<String> stream = Stream.of(longString)
                .map(el -> el.replace("ем", "у"));
            stream
                .forEach(System.out::println);
    }

    public static void addNumbers(List<? super Number> numbers) {
        numbers.add(10);
        numbers.add(3.14);

    List<Object> objects = new ArrayList<>();
    objects.add("Hello");
    addNumbers(objects);
    List<Number> numberList = new ArrayList<>();
    numberList.add(20);
    addNumbers(numberList);

    }
}


