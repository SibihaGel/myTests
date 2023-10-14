package org.example;

import java.util.*;
import java.util.Arrays;

public class Anagrama {
    public static void main(String[] args) {

        char asASAS = '\300';
        char variableName = 'A';


        String str1 = "anagrama";
        String str2 = "nagaraam";
        boolean hasAnagram = hasAnagram(str1, str2);
//        boolean isAnagram2 = isAnagram2(str1, str2);
        boolean isAnagram3 = isAnagram3(str1, str2);
//        System.out.println(hasAnagram);
//        System.out.println(isAnagram2);
//        System.out.println(isAnagram3);
        System.out.print("asA\tSAS ");


    }

    public static boolean hasAnagram(String a, String b) {
        HashMap<Character, Integer> hashMap = new HashMap();
        if (a.length() != b.length()) {
            return false;

        } else {
            for (int i = 0; i < a.length(); i++) {
                char ch = a.charAt(i);
//                System.out.print(ch);

                hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
            }
            for (int i = 0; i < b.length(); i++) {
                char ch = b.charAt(i);
                if (!hashMap.containsKey(ch) || hashMap.get(ch) == 0) {
                    return false;
                }
                hashMap.put(ch, hashMap.get(ch) - 1);
            }
            return true;
        }

    }

    // Second variant

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static boolean isAnagram2(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[26]; // Массив частотности символов (для английского алфавита)

        // Увеличиваем частотность символов строки str1
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;

        }

        // Уменьшаем частотность символов строки str2
        for (int i = 0; i < str2.length(); i++) {
            charCount[str2.charAt(i) - 'a']--;
        }

        // Проверяем, все ли значения в массиве частотности равны нулю
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
    public static boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] store = new int[114];
//        System.out.println(Arrays.toString(store));

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 1]++;
//            System.out.println(Arrays.toString(store));
//            System.out.println("--------------------------------");

            store[t.charAt(i) - 1]--;
//            System.out.println(s.charAt(i) - 1);



        }
//        System.out.println(Arrays.toString(store));

        for (int n : store) {
//            System.out.print(n);
            if (n != 0) return false;
        }

        return true;
    }
}
