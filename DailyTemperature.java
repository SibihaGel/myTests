package org.example;

/*
*Массив result используется для хранения результатов;

⏺ Внешний цикл for проходит по каждому элементу temperatures, начиная с первого и до предпоследнего,
* а внутренний цикл for проходит по элементам, начиная со следующего после текущего элемента и до конца массива;

⏺ Во внутреннем цикле проверяется условие if (temperatures[j] > temperatures[i]),
* которое сравнивает температуры текущего и следующего дня. Если следующая температура выше текущей,
* то result[i] присваивается разница между индексами следующего и текущего дня,
* обозначающая количество дней до наступления более теплой температуры.
* После этого цикл прерывается с помощью оператора break, чтобы двигаться к следующему дню;

⏺ В конце метод возвращает массив result, содержащий количество дней до наступления более теплой температуры для каждого дня.
 */

public class DailyTemperature {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] dailyTemperature(int[] tepm) {
        int[] res = new int[tepm.length];

        for (int i = 0; i < tepm.length - 1; i++) {
            for (int j = i + 1; j < tepm.length; j ++) {
                if (tepm[j] > tepm[i]) { // Исправлено условие: tepm[j] > tepm[i]
                    res[i] = j - i;
                    break;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] temperatures = {10, 20, 15, 30, 25, 40};
        int[] result = dailyTemperature(temperatures);
        printArray(result);
    }
}
