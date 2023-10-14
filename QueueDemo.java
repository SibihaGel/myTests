package org.example;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(2);
        queue.add(1);
        queue.add(4);
//        for (int i = 5; i != 0; i--) {
//            queue.add(i);
//        }
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(queue);

            while (!queue.isEmpty()) {
                System.out.println(queue.poll());

            }

            System.out.println(queue);

            // Удаляет эл с головы очереди
//        System.out.println( queue.offerFirst(0));
//        queue.remove(2);


            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

            priorityQueue.add(1);
            priorityQueue.add(2);
            priorityQueue.add(3);
            priorityQueue.comparator();

//        System.out.println(priorityQueue);

            Deque<Integer> q = new LinkedList<>();
        }
    }
}


