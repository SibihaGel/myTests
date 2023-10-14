package org.example;
/*

В примере определено наследования класса JavaStudent от StudentExtendsс перегрузкой метода public StudentExtends() {
        this.studying = "Прохожу тестовое задание.";
 */
public class StudentExtends {

    protected final String studying;

    public StudentExtends() {
        this.studying = "Прохожу тестовое задание.";
    }

    public StudentExtends(String studying) {
        this.studying = studying;
    }

    public void study() {
        System.out.println("Я очень занят. " + studying);
    }

    public static void main(String[] args) {
        JavaStudent javaStudent = new JavaStudent();
        javaStudent.study();
    }
}

class JavaStudent extends StudentExtends {
    public JavaStudent() {
        super("Прохожу курс по Java.");
    }
}
