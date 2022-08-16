package HomeWork2.Loops;

import java.util.Scanner;

public class Task1_5_6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        int number = console.nextInt();
        int a;

        while (number > 0){
            a = number % 10;
            number = number / 10;
            System.out.print(a);
        }
    }
}
