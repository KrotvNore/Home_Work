import java.util.Scanner;

public class onetwohm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод: ");
        int n = scanner.nextInt();
        int y = 1;
        for (int i = 1; i <= n; i++) {
            y =y*i; //почему он помнит y после прошлых интерций???
        }
        System.out.println("Произведение чисел от 1 до " + n + " равно " + y);
        scanner.close();
    }
}
