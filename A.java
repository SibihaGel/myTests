package org.example;

public class A {
    private static int y;
    private int x;
    private final int instanceNumber;

    @Override
    public String toString() {
        return String.valueOf(instanceNumber);
    }

    public A(int instanceNumber) {
        this.instanceNumber = instanceNumber;
    }
    private static void doIt (int i, A a) {
        i = 11;
        a.x = 12;
        a.y = 13;
        a = new A (2);
        a.x = 21;
        a.y = 22;
    }

    public static void main(String[] args) {

        A a = new A(1);
        a.x = 1;
        a.y = 2;
        int z = 3;

        A.doIt(z, a);
        System.out.println(a); // 1
        System.out.println(a.instanceNumber); // 1
        System.out.println(a.x); // 12
        System.out.println(a.y); // 22
        System.out.println(z); // 3


    }
}
