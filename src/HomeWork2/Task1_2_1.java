package HomeWork2.Loops;

import java.util.Scanner;

public class Task1_2_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = console.nextInt();

        System.out.println(result(number));
    }
    public static String result (int n){
        long result = 1;
        String line = "";

        while (n > 9) {
            int a = n % 10;
            n = n / 10;
            result = result * a;
            line = " * " + a + line;
        }
        result = result * n;
        line = n + line;

        return (line + " = " + result);
    }
}
