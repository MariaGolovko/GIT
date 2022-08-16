package HomeWork2.Loops;

import java.util.Scanner;

public class Task1_1_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int n = console.nextInt();

        System.out.println(factorial(n));
    }
    private static int factorial (int n){
        int result = 1;
        if (n == 1 || n == 0){
            return result;
        }
        result = n * factorial(n-1);
        return result;
    }
}
