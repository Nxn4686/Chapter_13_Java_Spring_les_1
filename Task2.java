package lesson2HW;

import java.util.Arrays;
import java.util.Random;

/**
 * Задание 2: Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
 */

public class Task2 {


    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
        {
            array[i] = random.nextInt(10);
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.println("Разница между самым большим и маленьким элементами массива: " + difOfMinAndMaxElements(array));
    }

    public static int difOfMinAndMaxElements(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            else if (arr[i] < min) {
                min = arr[i];
            }
        }

        return max - min;
    }
}
