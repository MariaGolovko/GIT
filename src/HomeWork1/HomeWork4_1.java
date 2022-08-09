package HomeWork1;

import java.util.Scanner;

public class HomeWork4_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите два числа, одно из которых четное, а другое - нечетное");
        System.out.println("Введите первое число");
        int numnerFirst = console.nextInt();
        System.out.println("Введите второе число");
        int numnerSecond = console.nextInt();

        if (numnerFirst % 2 != 0) {
            System.out.println("Первое число нечетное и оно равняется " + numnerFirst);
        }
        if (numnerSecond % 2 != 0) {
            System.out.println("Второе число нечетное и оно равняется " + numnerSecond);
        }
        if (numnerFirst % 2 == 0 && numnerSecond % 2 == 0){
            System.out.println("Оба числа четные");
        }
    }
}


