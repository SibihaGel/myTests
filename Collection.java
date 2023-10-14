package org.example;

import java.util.*;

public class Collection {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        List<Integer> newlist = new LinkedList<>();

        System.out.println("Размер созданного массива : " + list.size() + ". Содержание массива : " + list);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(3, 4);
        list.set(3, 4);
        list.get(2);
        System.out.println("После добавления элементов  : " + list.size() + ". Содержание массива : " + list);

        list.remove(2);
        System.out.println("После удаления элемента  : " + list.size() + ". Содержание массива : " + list);

        list.remove("2");
        System.out.println("После удаления элемента со значением  - 2,  всего : " + list.size() + ". Содержание массива : " + list);

        newlist.addAll(list); // Добавление массива в новый массив.


       ListIterator<Integer> iterator = newlist.listIterator();
        while (iterator.hasNext()) {
           int el = iterator.next();
//           int elPrev = iterator.previous();


           System.out.print("Total res : "  + " - " + el);
       }
       if (iterator.hasPrevious()) {
           System.out.println("\n"+ " back run : "+ iterator.previousIndex());
           System.out.println("\n"+ " back runNext : "+ iterator.previousIndex());
       }
        iterator.remove();


        System.out.print("newList : " + newlist);
    }
}


class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.remove();
        linkedList.remove(1);


        System.out.println("Linked List : " + linkedList);




        System.out.println(linkedList);





        System.out.println(linkedList);
        linkedList.removeLastOccurrence("A");

        System.out.println(linkedList);

        // получить и присвоить значение

//        list.set(2, "изменено");
        System.out.println(linkedList);

        boolean flag = linkedList.contains("A");
        System.out.println(flag);
        boolean list2 =  Collections.addAll(new ArrayList<Integer>(), 1,2);

        System.out.println("CollectionS : " + list2);
    }
}


class HashSetDemo {


    public static void main(String[] args) {

        Set<Integer> integerSet = new LinkedHashSet<>();
        integerSet.add(7);
        integerSet.add(6);
        integerSet.add(4);
        integerSet.add(3);
        integerSet.add(2);
        integerSet.add(1);
        integerSet.add(5);
        System.out.println("integerSet : " + integerSet);


Set<String> str = new HashSet<>();
        System.out.println();
str.add("Body");
str.add("Dad");
str.add("Human");
str.add("Ananas");
str.add("Keep");
str.add("Queen");
str.add("Link");
str.add("Window");
str.add("Error");
str.add("Run");
str.add("Tools");
str.add("Yes");
str.add("User");
str.add("Input");
str.add("Fack");
for (String element : str) {
            System.out.println("str : " + element);
        }



        Set<String> hs = new TreeSet<>() ;
        System.out.println(hs);

        hs.add("Бетта"); //1/2/3/4/5/6/7.Бетта.hashcode % 11 = 8
        hs.add("Альфа"); ///2/Альфа/Бетта.4/5/6/7 hashcode % 7 = 0
        hs.add("Эта");
        hs.add("Гамма");
        hs.add("Эпсилон");
        hs.add("Омега");
        System.out.println(hs);
        System.out.println("-------------");

        for (String string : hs) {


        System.out.println( string);
    }


        System.out.println();
        System.out.println("------------");


        hs.add("Омега1");
        hs.add("Омега2");
        hs.add("Омега3");
        hs.add("Омега4");
        System.out.println(hs);


    }
}

class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>(2,2000.75f);
        hashMap.put("Арлордро", 1);
        hashMap.put("Аббб", 2);
        hashMap.put("Анн", 3);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        Map<Number, String> map = new HashMap<>();
        System.out.println(map);
        map.put(4, "a");
        map.put(3, "b");
        map.put(5, "c");
        map.put(2, "d");
        map.put(1, "e");
        map.put(1.2, "f");


        System.out.println(map);


    HashMap<Integer, List<Integer>> listHashMap = new HashMap<>();
    List<Integer> list1 = List.of(1,3,5);
    List<Integer> list2 = List.of(2,4,6);
    List<Integer> resList = new ArrayList<>();
    resList.addAll(list1);
    resList.addAll(list2);
    Collections.sort(resList);


   listHashMap.put(1,resList);

    listHashMap.merge(1,list2,(str1, str2) -> {
        str1.addAll(str2);
        return str1;
    });

        System.out.println("merged Map : "+ listHashMap);
    }
}


class TreeSetDemo {


    public static void main(String[] args) {

   PriorityQueue<String> list = new PriorityQueue<>();
   list.add("sieir");
   list.add("ssdfsdf");


//        System.out.println(list);

        Set<String> tm = new HashSet<>();
        tm.add("Cup");
        tm.add("Ananas");
        tm.add("Anita");
        tm.add("Buster");
        tm.add("Eagle");
        tm.add("Fack");
        tm.add("Duck");
        tm.add("Duck");
//        System.out.println(tm);

        Set<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Cup");
        treeSet1.add("Ananas");
        treeSet1.add("Anita");
        treeSet1.add("Buster");
        treeSet1.add("Eagle");
        treeSet1.add("Fack");
        treeSet1.add("Duck");
        treeSet1.add("Duck");

        System.out.println(treeSet1);
       Iterator<String> iterator = treeSet1.iterator();
       while (iterator.hasNext()) {
           iterator.forEachRemaining(System.out::println);
           iterator.next();

       }

        System.out.println(treeSet1);

        Set<String> treeSet2 = new LinkedHashSet<>();
        treeSet2.add("Cup");
        treeSet2.add("Ananas");
        treeSet2.add("Anita");
        treeSet2.add("Buster");
        treeSet2.add("Eagle");
        treeSet2.add("Fack");
        treeSet2.add("Duck");
        treeSet2.add("Duck");
//        System.out.println(treeSet2);

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Cup", 1);
        hashMap.put("Ananas", 2);
        hashMap.put("Anita", 3);
        hashMap.put("Buster", 5);
        hashMap.put("Eagle", 7);
        hashMap.put("Fack", 8);
        hashMap.put("Duck", 10);
        hashMap.put("Raket", 4);
        hashMap.put("FootBoll", 3);
        hashMap.put("FootBoll", 5);

//        System.out.println(hashMap);


        Set<Integer> treeSet = new HashSet<>();
        treeSet.add(7);
        treeSet.add(9);
        treeSet.add(10);
        treeSet.add(6);
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(4);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
//        System.out.println(treeSet);

    }

    public static void main(){

        System.out.println("Я main");
    }


}
class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");

        System.out.println("Before removal: " + treeMap);

        int rootKey = treeMap.firstKey();
        String removedValue = treeMap.remove(rootKey);

        System.out.println("Removed: " + removedValue);
        System.out.println("After removal: " + treeMap);
        System.out.println("New root key: " + treeMap.firstKey());


    }
}

class ListPecsProducerDemo {
/*
Когда используется подстановочный символ ? extends,
список рассматривается как "producer" (производитель) элементов,
и что мы можем безопасно получать значения из списка, зная, что они являются экземплярами класса Number или его подклассов.
Но, мы НЕ можем добавлять значения в такой список, потому что компилятор не может гарантировать совместимость типов во время выполнения.

!!! ИНВАРИАНТНЫЕ ТИПЫ означают, что типы не могут быть безопасно присвоены друг другу, даже если они связаны отношением подтипа или супертипа.
Они остаются неизменными по отношению к своим подтипам и супертипам.

  Принцип PECS гласит, что:

1. Если вы только производите элементы из обобщенного типа (т.е., используете его только в качестве источника данных),
то используйте ковариантность, указывая extends. То есть, используйте ? extends Тип.
Например, List<? extends Animal> означает список элементов, которые являются подтипами Animal.
Вы можете безопасно читать элементы из такого списка, но не можете добавлять в него новые элементы,
так как неизвестно, какой конкретный подтип Animal ожидается.

 */

        public static void main(String[] args) {

            List<Number> integerList = new ArrayList<>();
            integerList.add(10L);
            integerList.add(11f);
            integerList.add(12d);
            integerList.add(13);

            List<? extends Number> list = new ArrayList<>();
            list = integerList;

            System.out.println(list);
//            list.add(10); // Не возможно
//            list.add(0,2);

            list.get(2);

            list.remove(2);
//            list.set(1,12f); // Не возможно

            System.out.println(list);
        }
}

class ListPecsConsumerDemo {
    /*
? super Number означает, что список может содержать элементы,
которые являются супертипами класса Number или самим классом Number.
При использовании такого списка вы можете добавлять элементы в него, но может возникнуть ограничение при получении значений из списка.
В случае объявления списка с подстановочным символом ? super Number,
вы можете безопасно добавлять элементы, которые являются экземплярами класса Number или его подклассов.
Но при попытке получить значения из списка, вы будете получать их как объекты типа Object.

Принцип PECS гласит, что:

2. Если вы только потребляете элементы в обобщенном типе (т.е., используете его только в качестве потребителя данных),
то используйте контравариантность, указывая super. То есть, используйте ? super Тип.
Например, List<? super Dog> означает список элементов, которые являются супертипами Dog.
Вы можете безопасно добавлять элементы типа Dog в такой список, но не можете безопасно читать элементы из него,
 так как они могут быть супертипами Dog.

     */
    public static void main(String[] args) {

        List<? super Number> list = new ArrayList<>();

        list.add(10f);
        list.add(1,11);
        list.add(10f);
        list.set(2, 12d);
        list.add(13);



        System.out.println(list);

//      int sumFirst = (list.get(2) + 2); // Так нельзя
        int sumSecond = ((Integer) list.get(2) + 2);


        System.out.println(sumSecond);

        System.out.println(list);

        list.remove(2);

        System.out.println(list);
    }

    /*
    Принцип PECS гласит, что:

1. Если вы только производите элементы из обобщенного типа (т.е., используете его только в качестве источника данных),
то используйте ковариантность, указывая extends. То есть, используйте ? extends Тип.
Например, List<? extends Animal> означает список элементов, которые являются подтипами Animal.
Вы можете безопасно читать элементы из такого списка, но не можете добавлять в него новые элементы,
так как неизвестно, какой конкретный подтип Animal ожидается.

2. Если вы только потребляете элементы в обобщенном типе (т.е., используете его только в качестве потребителя данных),
то используйте контравариантность, указывая super. То есть, используйте ? super Тип.
Например, List<? super Dog> означает список элементов, которые являются супертипами Dog.
Вы можете безопасно добавлять элементы типа Dog в такой список, но не можете безопасно читать элементы из него,
 так как они могут быть супертипами Dog.
     */
}

class SortedSetDemo {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        list.add(1);
        list.forEach(System.out::println);


        System.out.println(getNextElement(8));
        System.out.println(getPrevElem());
        System.out.println(testMetod());

    }

    private static SortedSet<Integer> getNextElement(Integer el) {
        NavigableSet<Integer> sortedSet = new TreeSet<>();

        for (int elem = 1; elem <= 10; elem++) {
            sortedSet.add(elem);
        }
        return sortedSet.tailSet(el); // больше 8 включительно
    }

    private static Set<Integer> getPrevElem() {

        SortedSet<Integer> sortedSet = new TreeSet<>();

        for (int elem = 1; elem <= 10; elem++) {
            sortedSet.add(elem);
        }

 return sortedSet.headSet(6); // меньше 6
    }

    private static SortedSet<Integer> testMetod() {
        NavigableSet<Integer> sortedSet = new TreeSet<>();

        for (int elem = 1; elem <= 10; elem++) {
            sortedSet.add(elem);
        }
        return sortedSet.descendingSet();
    }
}

class MainIterator {

    public static void main(String[] args) {


        Integer[] arr = new Integer[]{1, 3, 5, 6, 7, 8, 9, 0, 0, 1, 10};
        ArrayList<Integer> arrayList = new ArrayList<>();

        Collections.addAll(arrayList,arr);

        for (int i =0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }
        System.out.println();

        ListIterator<Integer> iterator = arrayList.listIterator();

        while (iterator.hasNext()) {
            int item = iterator.next();
            if(item >= 7) {
                iterator.remove();
            }

        }System.out.println(arrayList);

/*
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+ " ");
 */
        }
    }
    class MainIterable implements Iterable {
        public static void main(String[] args) {
        for (Object i : MainIterable.fromTo(0,100)) {
            System.out.println(i);
        }
        }

       int start;
       int end;

       public static MainIterable fromTo(int from, int to) {
            return new MainIterable(from,to);
       }
        private MainIterable(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public Iterator iterator() {
            return new Iterator(start);
        }
        class Iterator implements java.util.Iterator<Integer> {
            int current;

            public Iterator(int current) {
                this.current = current;
            }

            @Override
            public boolean hasNext() {
                return current <= end;
            }

            @Override
            public Integer next() {
                return current++;
            }
        }
    }










