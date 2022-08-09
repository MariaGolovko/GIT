package HomeWork1;

import java.util.Scanner;

public class HomeWork4_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число а");
        int a = console.nextInt();
        System.out.println("Введите второе число b");
        int b = console.nextInt();
        System.out.println("Введите третье число c");
        int c = console.nextInt();

        if (a > b && a < c){
            System.out.println("Среднее число a, и оно равняется " + a);
        }else if (a > c && a < b) {
            System.out.println("Среднее число a, и оно равняется " + a);
        }else if (b > a && b < c) {
            System.out.println("Среднее число b, и оно равняется " + b);
        }else if (b > c && b < a){
            System.out.println("Среднее число b, и оно равняется " + b);
        }else if (c > a && c < b) {
            System.out.println("Среднее число c, и оно равняется " + c);
        }else {
            System.out.println("Среднее число c, и оно равняется " + c);
        }
    }
}
