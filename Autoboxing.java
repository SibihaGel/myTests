package org.example;

public class Autoboxing {


    public static void main(String[] args) {
        Integer a = Integer.valueOf(127);
        int c = a.intValue();
        int e = a;
        Integer b = Integer.valueOf(a.intValue());

        char q = 100;

    q = (char) e;
        System.out.println(q);
    }
}


   class InnerChar {

private char volume;

       public InnerChar(char volume) {
       }

       public void setVolume(char volume) {
           this.volume = volume;
       }

       @Override
       public String toString() {
           return "volume = " + volume;
       }

       public char getVolume() {
            return volume;
        }


    }


