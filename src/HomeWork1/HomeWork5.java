package HomeWork1;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Какой сегодня день недели? (напишите цифру)");
        int day = console.nextInt();
        boolean weekday = day < 6;

        System.out.println("Вы сейчас в отпуске? (true/false)");
        boolean vacation = console.nextBoolean();

        System.out.println("Можно ли сегодня дальше спать? (да - true / нет - false)");
        System.out.println(sleepIn(weekday, vacation));
    }
    public static boolean sleepIn (boolean w, boolean v) {
        return !w || v;
    }
}
