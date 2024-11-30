package lesson2HW;

import java.util.Arrays;
import java.util.Random;

/**
 * Задание 1: Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
 */


public class Task1 {


    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
        {
            array[i] = random.nextInt(10);
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.println("Количество чётных элементов в масиве: " + countEvens(array));  // Вывод: 3

    }

    public static int countEvens(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

}
