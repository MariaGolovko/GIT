package HomeWork2.Loops;

import java.util.Scanner;

public class Task1_2_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число");
        String input = console.nextLine();
        double number = Double.parseDouble(input);

        while (number % 1 > 0){
            System.out.println("Вы ввели нецелое число. Введите целое число");
            input = console.nextLine();
            number = Double.parseDouble(input);
        }

        int numberInteger = (int) number;

        int result = 1;
        String line = "";

        while (numberInteger > 9) {
            int a = numberInteger % 10;
            numberInteger = numberInteger / 10;
            result = result * a;
            line = " * " + a + line;
        }
        result = result * numberInteger;
        line = numberInteger + line;

        System.out.println(line + " = " + result);

    }
}
