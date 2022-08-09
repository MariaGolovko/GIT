package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class HomeWork6_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Напишите свое имя");
        String name = console.nextLine();
        String nameCheck = "Вася";
        boolean nameCompare = Objects.equals(name, nameCheck);

        if (nameCompare){
            System.out.println("Привет! \nЯ тебя так долго ждал!");
        } else {
            System.out.println("Упс! Это не Вася");
        }
    }
}
