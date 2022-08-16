package HomeWork2.Loops;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число для возведения в степень");
        double number = console.nextFloat();
        System.out.println("В какую степень возвести число? (положительная целая");
        int power = console.nextInt();
        double result = 1;

        for (int i = 1; i <= power; i++){
            result = result * number;
        }
        System.out.println(number + " ^ " + power + " = " + result);
    }
}
