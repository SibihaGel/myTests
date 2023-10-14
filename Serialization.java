package org.example;

import java.io.*;

public class Serialization {

    public static void main(String args[]) {
//     произвести сериализацию объекта
        try (ObjectOutputStream objOStrim =
                     new ObjectOutputStream(new FileOutputStream("C:\\Users\\sibih\\IdeaProjects\\kataProjects\\Sobesy\\src\\main\\resources\\file"))) {
            MyClass object1 = new MyClass("Hello", -7, 1000000);
            System.out.println("object1: " + object1);
            objOStrim.writeObject(object1);
        } catch (IOException e) {
            System.out.println("Иcключeниe при сериализации: " + e);
        }

        //    произвести десериализацию объекта
        try (ObjectInputStream objIStrim =
                     new ObjectInputStream(new FileInputStream("C:\\Users\\sibih\\IdeaProjects\\kataProjects\\Sobesy\\src\\main\\resources\\file5"))) {
            MyClass object2 = (MyClass) objIStrim.readObject();
            System.out.println("object2: " + object2);
        } catch (FileNotFoundException | ClassNotFoundException e) {
            System.out.println("Иcключeниe при десериализации " + e);

//            System.exit(0);
        }  finally {
            System.out.println("Finally block");
            try {
                throw new FileNotFoundException("Exception in finally block");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyClass implements Serializable {
    String s;
    int i;
    double d;

    @Override
    public String toString() {
        return "MyClass{" +
                "s='" + s + '\'' +
                ", i=" + i +
                ", d=" + d +
                '}';
    }
    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;

    }
}
