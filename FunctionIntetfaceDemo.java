package org.example;

import java.io.*;
import java.util.Arrays;
import java.util.*;
import java.util.function.*;


public abstract class FunctionIntetfaceDemo {


    public static void main(String[] args) {
        Message messege = new Message("Раньше приходилось много кода писать");
        Message messege2 = new Message("хочется поменьше");

        Comparator<Message> comparator = new Comparator<Message>() {
            @Override
            public int compare(Message o, Message o2) {
                return (o.description.length() < o2.description.length()) ? -1 : ((o.description.length() > o2.description.length()) ? 1 : 0); // Сравнение по длинне строк
            }
        };
        System.out.println(comparator.compare(messege, messege2));


        Comparator<Message> cmp = (Message o, Message o2) -> {
            int x = o.description.length();
            int y = o2.description.length();
            return Integer.compare(x, y);
        };
        System.out.println(cmp.compare(messege,messege2));

//        System.out.println( "doubleToInt метод : " + doubleToInt());
//        System.out.println(isValidLenght(messege));
//        System.out.println(mapperToStringAndToUpperCaseCompose(messege2));
//        System.out.println(messege2);
//        referenceDemo();
//        stringAppendForEach();
}

public static int doubleToInt () {

        DoubleToIntFunction fi = (double value) -> (int) Math.round(value);
    int res = fi.applyAsInt(3.14);
    return res;
    }

    public static boolean isValidLenght(Message message) {
    Predicate<Message> predicate = (Message mse) -> (mse.getDescription().length()) == 35;
    return predicate.test(message);

    }

    public static void referenceDemo() {
        Comparator<Integer> ref = Integer::compare;
        List<Integer> list = Arrays.asList(5, 2, 8, 1, 3);

        // Сортировка списка с использованием ссылки на метод Integer::compare
        list.sort(Integer::compare);

        // Вывод  списка
        PrintStream pw = System.out;
        Consumer<Integer> ref1 = pw::println;
        list.forEach(ref1);
    }

    public static void stringAppendForEach() {
        StringBuilder sb = new StringBuilder();
        List<String> list = Arrays.asList("Ser","gey", "  ", "Zat", "sepin");
        list.forEach(s -> { sb.append(s); }
        );
        System.out.println(sb);
    }




    public static String mapperToStringAndToUpperCaseCompose(Message message) {
        Function<Message, String> map = (Message msg) -> (String) msg.getDescription();
        String string = map.apply(message); // эта строка уже не нужна.. поскольку  compose.apply(message);
        Function<Message, String> compose = map.andThen((String str) -> str.toUpperCase());
        return compose.apply(message);
    }


}

class ComparatorTooDemo {


    public static void main(String[] args) {
        String string1 = "К";
        String string2 = "T";
        Comparator<String> comparator = (o1, o2) -> o1.compareTo(o2); // Лексическое сравнение -> К больше (старше в алфавите) T
        System.out.println(comparator.compare(string1,string2));

    }
}
class Message {
    public String description;


    public String getDescription() {
        return description;
    }

    public Message(String discription) {
        this.description = discription;
    }

    @Override
    public String toString() {
        return "Message{" +
                "description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        return Objects.equals(description, message.description);
    }

    @Override
    public int hashCode() {
        return description != null ? description.hashCode() : 0;
    }

    public static void main(String[] args) {


        Consumer<String> convertToUpperCase = str -> {
            String upperCaseStr = str.toUpperCase();
            System.out.println(upperCaseStr);
        };

        convertToUpperCase.accept("hello"); // Выводит: HELLO
        convertToUpperCase.accept("world"); // Выводит: WORLD
    }
}




