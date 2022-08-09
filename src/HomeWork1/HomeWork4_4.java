package HomeWork1;

import java.util.Scanner;

public class HomeWork4_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        int number = console.nextInt();
        int b;
        double k;
        System.out.println("Перевести число в байты (введите 1) или в кб (введите 2)? ");
        int answerByte = console.nextInt();

        if (answerByte == 1) {
            b = number * 1024;
            System.out.println("В байтах равно " + b + " байт");
        }else if (answerByte == 2){
            k = number / 1024d;
            System.out.println("В кБ равно " + k + " kb");
        }else {
            System.out.println("Некорректный выбор");
        }
    }
}
