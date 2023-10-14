package org.example;

import java.util.*;
import java.util.Arrays;

public class Sort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Обмен значениями
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 0, 25, 0, -2, 0, 90};

        System.out.println("Исходный массив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        bubbleSort(arr);
        sortZerro(arr);

        System.out.println("\nОтсортированный массив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void sortZerro(int[] arr) {

        int[] newArray = Arrays.stream(arr).sorted().toArray();
        int[] reversedArray = new int[arr.length];

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] >= 0) {
                reversedArray[i] = newArray[newArray.length - 1 - i];
            }
            System.out.println("Новый массив ");
            for (int num : reversedArray) {
                System.out.print(num + " ");
            }
        }
    }

        public static void sortZerroTwo ( int[] arr){

            int[] sortedArray = new int[arr.length];

            int count = 0;
            int counterWhithNull = 0;

            while (count < arr.length) {
                if (arr[count] == 0) {
                    count++;
                }

                System.out.println(count);
            }
            System.out.println("Sorted массив ");
            for (int num : sortedArray) {
                System.out.print(num + " ");

            }
        }
    }


