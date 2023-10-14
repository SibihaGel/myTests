package org.example;


import java.lang.reflect.*;
import java.util.*;

public class Arrays {





    public static void main(String[] args) {

        String[] arr4 = new String[5];
        int[] arr = new int[11];
        int[] arr2 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 9};
        boolean[] arr3 = new boolean[10];

        PriorityQueue<Queue> list = new PriorityQueue<>();



        Array.set(arr, 1, 1);
        Array.set(arr, 2, 2);
        Array.set(arr, 3, 3);
        Array.set(arr, 4, 4);
        Array.set(arr, 5, 5);
        Array.set(arr, 6, 6);
        Array.set(arr, 7, 7);
        Array.set(arr, 8, 9);
        Array.set(arr, 9, 9);
        Array.set(arr, 10, 9);
        arr[10] = 1122;



//
//        System.out.println(java.util.Arrays.toString(arr));
//
//
//        System.out.println(arr[10]);
//        System.out.println(java.util.Arrays.toString(arr2));
//        System.out.println(java.util.Arrays.toString(arr3));


//        System.out.print("[");
//        for (int i = 0; i < arr3.length; i++) {
//            System.out.print(arr3[i]);
//            if (i != arr3.length - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.print("] \n");

        // Считаем количество повторяющихся элементов
        //1. Сортируем массив

        java.util.Arrays.sort(arr2);

        //2. Пишем счетчик повторений.

        int count = 1;
        for (int i = 1; i < arr2.length; i++) {

            if (arr2[i] == arr2[i - 1]) { //Если следующий элемент равен предыдущему, считаем его +1
                count++;
            } else {
//                System.out.println("Элемент " + arr2[i - 1] + " встречается " + count + " раз");
                count = 1; // Сбрасываем счетчик до 1
            }
        }
//        System.out.println("Элемент " + arr2[arr2.length - 1] + " встречается " + count + " раз");

//        System.out.println(java.util.Arrays.toString(arr4));


/*
        // Определяем есть ли в массиве повторяющиеся элементы!!

        //1. Сортируем массив

 */

        java.util.Arrays.sort(arr2);

        // Ставим счетчик повторенийв 1!!
        int count1 = 1;
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] == arr2[i - 1]) {
                count1++;
            }
        }
        if (count1 > 1) {
//                System.out.println("В массиве есть повторяющиеся элементы");

        } else {
//                System.out.println("Нет повторяющихся элементов в массиве");
        }

// Проверка массива на наличие копий элементов через HashSet

//        boolean hasDuplicates = hasDuplicates(arr);
//        System.out.println(hasDuplicates);

//        printArray();
//        System.out.println(sumArray(new int[]{0, 4, 6, 10, 20, 30, 40}));

//        addArrayList();
//        addLinkedList();
//        collection();
        sumDiagonal3(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}});
    }

    public static boolean hasDuplicates(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (hashSet.contains(arr[i])) {
                return true;
            }
            hashSet.add(arr[i]);
        }
        return false;
    }
    // Заполняем массив
    public static void printArray() {
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - 1 - i;
            System.out.print(i + " ");
        }
        System.out.println(java.util.Arrays.toString(arr)); // [17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
    }

    public static void sumTwoArray() {
        int[] arr = {1, 2, 3, 0, 4, 6, 7, 8, 9};
        int[] arr2 = {1, 2, 3, 0, 4, 6, 7, 8, 9};
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i] + arr2[i];
            System.out.print(i + " ");
        }

        System.out.println(java.util.Arrays.toString(res)); //


    }

    public static int sumArray(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

    public static void addArrayList() {

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);

        }
        long startTime = System.nanoTime();
        arrayList.get(500000);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        // Вычисляем длительность в наносекундах

        System.out.println(duration);

    }

    public static void addLinkedList() {

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) { // add 1 000 000 - 34 861 600, get(500 000) 12 399, add(500000) 433 901, add(0) 1 115 400, add (999 999 ) 43 600
            linkedList.add(i);

        }
        long startTime = System.nanoTime();
        linkedList.get(500000);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime); // Вычисляем длительность в наносекундах

        System.out.println(duration); // add 1 000 000 -  315 609 301,  get(500 000) 4 836 300, add(500000) 4 975 799, add(0) 22 900, add (999 999 ) 25 399

    }

    public static void collection() {
        final List<String> string1 = new ArrayList<>(Collections.singleton("Hello World"));
        final List<String> string2 = Collections.singletonList("Hello World");
        string1.set(0, string1.get(0).toUpperCase());
//

        System.out.println(string1.get(0));

        string2.set(0, string2.get(0).toUpperCase());
        System.out.println(string2.get(0));
    }

    public static void sumDiagonal(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            System.out.println(arr[i][i]);
        }
        System.out.println(sum);

    }

    public static void sumDiagonal2(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                    System.out.println();
                }
            }
        }
        System.out.println(sum);
    }
    public static void sumDiagonal3(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][arr.length-1-i];
            System.out.println(arr[i][arr.length-1-i]);
        }
        System.out.println(sum);

    }
}






