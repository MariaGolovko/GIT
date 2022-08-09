package HomeWork1;

import java.util.Scanner;

public class HomeWork4_6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите год");
        int year = console.nextInt();

        if (year % 4 == 0){
            if (year % 100 == 0 && year % 400 != 0){
                System.out.println("год невисокосный");
            }else {
                System.out.println("год високосный");
            }
        }else {
            System.out.println("год невисокосный");
        }
    }
}
