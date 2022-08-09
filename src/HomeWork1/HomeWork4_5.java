package HomeWork1;

import java.util.Scanner;

public class HomeWork4_5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число от 0 до 127");
        int input = console.nextInt();

        if (input >= 65 && input <= 90){
            System.out.println("Ваш код соответствует латинской букве");
        } else if (input >= 97 && input <= 122){
            System.out.println("Ваш код соответствует латинской букве");
        }else{
            System.out.println("Ваш код соответствует символу");
        }
    }
}
