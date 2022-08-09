package HomeWork1;

import java.util.Scanner;

public class HomeWork6_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Напишите свое имя");
        String name = console.nextLine();

        switch (name){
            case "Вася":
                System.out.println("Привет! \nЯ тебя так долго ждал!");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал!");
                break;
            default:
                System.out.println("Добрый день! А вы кто?");
        }
    }
}
