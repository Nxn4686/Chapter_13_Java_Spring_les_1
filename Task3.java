package lesson2HW;

import java.util.Arrays;
import java.util.Random;

/**
 * Задание 3: Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
 */

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
        {
            array[i] = random.nextInt(4);
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.println("В массиве есть два соседних элемента с нулевым значением: " + isZeroEvens(array));
    }

    public static String isZeroEvens(int[] arr) {
        boolean isCompare = false;
        String yes = "Да";
        String no = "Нет";

        for (int i = 1; i < arr.length; i++){
            if (arr[i] == 0 && arr[i] == arr[i+1]){
                isCompare = true;
            }
        }
        if (isCompare)
            return yes;
        else
            return no;
    }
}
