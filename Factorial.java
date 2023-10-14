package org.example;

public class Factorial {

   public static int time = 10;
    int factR(int n) {
        int result;
        if (n == 1) return 1;
        result = factR(n - 1) * n;
        return result;

    }



}
class Recursion {



    public static void main(String args[]) {
        Factorial f = new Factorial();
        System.out.println(" Bычиcлeниe рекурсивным методом");
        System.out.println(" Фaктopиaл 1 равен " + f.factR(1));
        System.out.println(" Фaктopиaл 2 равен " + f.factR(2));
        System.out.println(" Фaктopиaл 3 равен " + f.factR(3));
        System.out.println();

        Factorial.time = Factorial.time + 10;
        System.out.println(Factorial.time);
    }


}
