package org.example;

public class QuickSort {
    public static void main(String[] args) {


        int[] unsortedArray = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 12, 15, 65, 34, 6354, 67, 67, 9}; //

        int[] sortedArray = quickSort(unsortedArray, 0, unsortedArray.length-1);


//        booble(unsortedArray);

        // Выводим отсортированный массив
        for (int num : unsortedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] quickSort(int[] sortArr, int low, int high) {
        int i = low;
        int j = high;

        if (sortArr.length == 0 || low >= high) {
            return sortArr;
        }
// выбираем опорный элемент pivot
        int middle = low + (high - low) / 2;
        int pivot = sortArr[middle];


        while (i <= j) {
            while (sortArr[i] < pivot) {
                i++;
            }
            while (sortArr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(sortArr, low, j);
        }
        if (high > i) {
            quickSort(sortArr, i, high);
        }
        return sortArr;
    }

    public static void booble (int[] arr) {
        int size = arr.length;
        for (int a = 1; a < size; a++) {
            System.out.println(a);
            for (int b = size - 1; b >= a; b--) {
                if (arr[b - 1] > arr[b]) {
                    int big = arr[b - 1];
                    arr[b - 1] = arr[b];
                    arr[b] = big;

                }

            }
        }
        System.out.println("sorted array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
            }

        }
    }

