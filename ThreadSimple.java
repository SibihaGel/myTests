package org.example;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
import static java.util.stream.IntStream.range;

public class ThreadSimple extends Thread {
//public class ThreadSimple implements Runnable {

    public static void main(String[] args) throws Exception {


        Thread thread = new Thread(new ThreadSimple());
        thread.start();
        Thread.sleep(200L);

        System.out.println("Starting ");
        System.out.println("interacting thread");

       thread.interrupt(); //
        System.out.println("Joining thread");
        thread.join(); //

        ArrayList list = new ArrayList();
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        System.out.println("It's done");
    }

//    @Override //  implements Runnable
//    public void run() {
//        for (int i = 1; i <= 10; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(Thread.currentThread().getName() + " " + i);
//        }
//    }

}


 class Runners { // Создание потока


     public static void main(String[] args) {

         System.out.println(Thread.currentThread().getName()); // Thread main

/*
     реализация интерфейса Runnable.
      */

         final Runnable task = () -> System.out.println(Thread.currentThread().getName()); // Предпочтительный метод

         final Thread thread = new Thread(task); //Вызываем конструктор класса Thread и передаем туда объект класса реализующий интерфейс Runnable

         thread.start(); // Создание и запуск нового потока

/*
*
     Способ наследования класса Thread и переопределение метода RUN() - МЕНЕЕ ПРЕДПОЧТИТЕЛЬНЫЙ

 @Override method run
 */


         final Thread thread1 = new Thread() {

             @Override
             public void run() {
                 System.out.println(Thread.currentThread().getName());
             }
         };
         thread1.start();
     }

 }
/*
 Создем 10 потоков от потока main    Способ  реализация интерфейса Runnable!!
 */

class ToManyThreadsCreated {

    private static final int CREATED_THREADS_AMOUNT = 10;

    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName()); // Thread main
        final Runnable taskDisplayedThreadName = () -> System.out.println(Thread.currentThread().getName());

        final Runnable taskCreatingThread = () -> range(0, CREATED_THREADS_AMOUNT)
                .forEach(i -> startThread(taskDisplayedThreadName));
        startThread(taskCreatingThread);

    }
    private static void startThread (final Runnable runnable) {

        final Thread thread = new Thread(runnable);
        thread.start();
    }
}






class ExecutorServiceDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService service = Executors.newFixedThreadPool(10);
       List<MyCallable<String>> tasks = new ArrayList<>();
        for (int i = 0; i < 3; i++) {

            MyCallable mc = new MyCallable();

            tasks.add(mc);
        }

      List<Future<String>> futures = service.invokeAll(tasks); // список завершенных задач
//      String futures1 = service.invokeAny(tasks); // одна завершенная задача
        System.out.println("FINISH");
        service.shutdown(); // останавливаем поток!!!

    }
}
class MyCallable<S> implements Callable<String> {



    @Override
    public String call() throws Exception {
        try {
            System.out.println("Started : " + Thread.currentThread().getName());
            Thread.sleep((long) (1000 +  (Math.random()*2000)));
            System.out.println("Finished : " + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }


        return Thread.currentThread().getName();
    }
}
class ParallelStream {
    public static void main(String[] args) {



        final int MAX = 24;

        List<Integer> test = IntStream.range(1, MAX + 1).boxed().toList();
        Spliterator<Integer> sp1 = test.spliterator();
        Spliterator<Integer> sp2 = sp1.trySplit();

        sp1.forEachRemaining(System.out::println); // sp1.trySplit делит стрим на два потока.
        sp2.forEachRemaining(System.out::println);

        test.parallelStream()
                .forEach((str) -> {
                    System.out.println("Start :" + Thread.currentThread().getName() + ": " + str);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                }
                    System.out.println("Finish :" + Thread.currentThread().getName() + ": " + str);
                });
    }
}
