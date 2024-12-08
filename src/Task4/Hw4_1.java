package Task4;

import java.util.Random;

import static java.util.Collections.binarySearch;

public class Hw4_1 {
    public static void main(String[] args) {
        int size = 1_000_000;
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = 1_000_000 + i;
        }

        Random random = new Random();
        int randomNumber = random.nextInt(1_000_000) + 1_000_000;

        int bsearch = binarySearch(num, randomNumber);

        System.out.println("random - " + randomNumber);
        System.out.println("index - " + bsearch);
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        //реализация бинарного поиска
        while (left <= right) {
            int midle = left + (right - left) / 2;

            if (array[midle] == target) {
                return midle; //найдено число
            } else if (array[midle] < target) {
                left = midle + 1; //вверх
            } else {
                right = midle - 1; //вниз
            }
        }
        return -1; //число не найдено
    }
}
