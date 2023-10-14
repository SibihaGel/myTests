package org.example;

@FunctionalInterface
public interface Sum <T> {
    int sum(T o1, T o2);
}

class LambdaDemo {



    public static void main(String[] args) {

        Sum<Integer> comp = (o1, o2) -> o1 + o2;
        
        int res;
        res = comp.sum(12,10);
        System.out.println(res);
        Runnable runnable = () -> System.out.println("Hello ");
        runnable.run();

    }
}
