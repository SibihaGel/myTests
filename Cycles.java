package org.example;

public class Cycles {
    public static void main(String[] args) {

        int a = 0;
        while (a < 10) {
            a++;
        }

//        for (int y = 0; y < a; y++) {
//            for (int x = 0; x < a; x++) {

/*                if(y < a - 9 || y > a - 2) {
                         +  +  +  +  +  +  +  +  +  +
                         *  *  *  *  *  *  *  *  *  *
                         *  *  *  *  *  *  *  *  *  *
                         *  *  *  *  *  *  *  *  *  *
                         *  *  *  *  *  *  *  *  *  *
                         *  *  *  *  *  *  *  *  *  *
                         *  *  *  *  *  *  *  *  *  *
                         *  *  *  *  *  *  *  *  *  *
                         *  *  *  *  *  *  *  *  *  *
                         +  +  +  +  +  +  +  +  +  +

 */
        /*                if (x>4) {
         *  *  *  *  *  +  +  +  +  +
         *  *  *  *  *  +  +  +  +  +
         *  *  *  *  *  +  +  +  +  +
         *  *  *  *  *  +  +  +  +  +
         *  *  *  *  *  +  +  +  +  +
         *  *  *  *  *  +  +  +  +  +
         *  *  *  *  *  +  +  +  +  +
         *  *  *  *  *  +  +  +  +  +
         *  *  *  *  *  +  +  +  +  +
         *  *  *  *  *  +  +  +  +  +

         */

////                if ((x >= 2 && x <= 7) && (y >= 2 && y <= 7)) {
//                    System.out.print(" + ");
//                } else {
//                    System.out.print(" * ");
//
//                }
//
//            }System.out.println();
//        }
        testCrue(10);
        drawChristmasTree(10);
    }

    public static void drawChristmasTree(int height) {
        for (int y = 0; y < height; y++) {
            // Рисуем пробелы перед звездочками
            for (int x = 0; x < height - y; x++) {
                System.out.print(" ");
            }

            // Рисуем звездочки
            for (int k = 0; k < 2 * y - 1; k++) {
                System.out.print("+");
            }

            System.out.println(); // Переход на новую строку
        }

        // Рисуем ствол елки
        for (int y = 0; y < height - 1; y++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }

    public static void testCrue(int height) {
        for (int y = 0; y < height; y++) {
            for (int x = 9; x < height + y; x++) {
                System.out.print("+");
            }
            System.out.println();
            }
        }
    }












