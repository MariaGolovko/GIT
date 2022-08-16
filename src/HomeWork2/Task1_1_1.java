package HomeWork2.Loops;

import java.util.Scanner;

public class Task1_1_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        long a = console.nextLong();

        System.out.println(factorial(a));
    }

    public static long factorial (long n){
        long factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}
