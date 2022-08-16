package HomeWork2.Loops;

import java.util.Scanner;

public class Task1_5_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int number = console.nextInt();
        int max = 0;

        while (number > 0){
            int a = number % 10;
            if (a > max){
                max = a;
            }
            number = number / 10;
        }
        System.out.println("Наибольшая цифра числа " + max);
    }
}
