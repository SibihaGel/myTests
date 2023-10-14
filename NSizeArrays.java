package org.example;

public class NSizeArrays {
    public static void main(String[] args) {
        int [][] arr = new int[3][2];
        /*   0 1
        ---------
        0 |  0 0
        1 |  0 0
        2 |  0 0
         */
//        arr[2][1] = 5;
//        arr[1][0] = 4;
        System.out.println(arr[0][0] + " " + arr[0][1]);
        System.out.println(arr[1][0] + " " + arr[1][1]);
        System.out.println(arr[2][0] + " " + arr[2][1]);
        System.out.println("-----------------------------");
        print();
        printLengthArrays();
    }


        public static void print() {
            int [][] arr = new int[3][2];
        /*   0 1 2
        ---------
        0 |  0 0 0
        1 |  0 0 0

         */
    arr[1][0] = 5;
    arr[2][1] =4;

            System.out.println(arr[0][0] + " " + arr[1][0] + " " + arr [2][0]);
            System.out.println(arr[0][1] + " " + arr[1][1] + " " + arr [2][1]);
        }
    public static void printLengthArrays() {
        int [][] arr = new int[3][2];
        int[][] arr2 = new int[][] {{1,2,3},{4,5,6}};

        System.out.println(arr2.length); //2
        System.out.println(arr2[0].length);//3
    }
}
