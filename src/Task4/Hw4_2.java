package Task4;

import java.util.Random;
import java.util.Scanner;

public class Hw4_2 {
    public static void main(String[] args) {
        int[] num = new int[100_000]; //Создание и заполнение массива
        Random random = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(100_000);
        }

        bblSort(num);

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int last = sc.nextInt();

        if (first < 0 || last >= num.length || first > last){
            System.out.println("Ошибка!");
        } else {
            for (int i = first; i <= last; i++) {
                System.out.print(num[i] + " ");
            }
        }
    }

    public static void bblSort(int[] num){
        int x = num.length;
        boolean swapped; // переменная, которая указывает, были ли произведены обмены на текущем проходе
        // Если за проход не было ни одного обмена, это значит, что массив уже отсортирован, и можно завершить работу.
        for (int i = 0; i < x - 1; i++) {
            swapped = false;
            for (int j = 0; j < x - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
//            После завершения одного прохода по массиву проверяется, были ли произведены обмены.
//            Если swapped == false, это значит, что массив уже отсортирован.
//            В таком случае выполнение внешнего цикла прекращается с помощью break.
        }
    }
}
