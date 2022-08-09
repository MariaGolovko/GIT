package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class HomeWork6_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Напишите свое имя");
        String name = console.nextLine();
        String nameMan = "Вася";
        String nameWoman = "Анастасия";

        if (Objects.equals(name, nameMan)){
            System.out.println("Привет! \nЯ тебя так долго ждал!");
        } else if (Objects.equals(name, nameWoman)) {
            System.out.println("Я тебя так долго ждал!");
        }
    }
}
