package org.example;

import java.util.*;
import java.util.concurrent.*;

public class FailFastEndSafe {
    public static void main(String[] args) {

//        failSafeIterator();
        failFastIterator();

    }

    private static void failSafeIterator() {
        String[] data = {"Tomcat", "Undertow", "Kubernetes", "JBoss"};
        CopyOnWriteArrayList<String> dataList = new CopyOnWriteArrayList<>(data);
        dataList.iterator();

        for (String string : dataList) {
            if (string.equals("Tomcat")) {
                dataList.add("Jetty");
                System.out.print(string);
            }
        dataList.add("asd");
        }
        System.out.println("=======================");
        dataList.forEach(System.out::print);

    }

    private static void failFastIterator() {

        ArrayList<String> servers = new ArrayList<>();
        servers.add("Spring");
        servers.add("Tomcat");
        servers.add("Dumd");
        servers.add("Fkjhgkjhkj");

        servers.forEach(System.out::println);

        Iterator<String> iterator = servers.iterator();
        while (servers.iterator().hasNext()) {
                iterator.next();
                iterator.remove(); // Используем метод remove() итератора для удаления элемента
             // Nizzzzzya
            }
            System.out.println("++++++++++++++++++++++++++++");
            servers.forEach(System.out::println);

            Iterator<String> iterator2 = servers.iterator();
            while (servers.iterator().hasNext()) {
                iterator2.next();
                iterator2.remove();



            }

//        servers.add("Spring");
//        servers.add("Tomcat");


//        List<String> newServers = new ArrayList<>();
//
//        while (servers.iterator().hasNext()) {
//                String s = servers.iterator().next();
//                if (s.equals("Spring")) {
//                    newServers.add("Jetty");
//                } else {
//                    newServers.add(s);
//                }
//               newServers.add("Добавленный элемент");
//                break;
//            }
//            servers.clear();
//            servers.addAll(newServers);
//            System.out.println("---------");
//            System.out.println(servers);
//        }
        }

    }








