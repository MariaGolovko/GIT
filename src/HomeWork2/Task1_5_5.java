package HomeWork2.Loops;

import java.util.Scanner;

public class Task1_5_5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите минимум");
        int min = console.nextInt();
        System.out.println("Введите максимум");
        int max = console.nextInt();
        System.out.println("Введите шаг");
        int step = console.nextInt();

        System.out.print(min);

        while ((min + step) <= max){
            min = min + step;
            System.out.print(" " + min);
        }
    }
}
