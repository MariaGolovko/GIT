package HomeWork1;

import java.util.Scanner;

public class HomeWork4_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int a = console.nextInt();
        System.out.println("Введите второе целое число (кроме 0)");
        int b = console.nextInt();
        int c = a / b;

        if (a % b == 0){
            System.out.println("Первое число делится на второе без остатка, результат деления = " + c);
        } else {
            System.out.println("Первое число НЕ делится на второе без остатка, результат деления = " + c + "\nОстаток от деления равен " + (a % b));
        }
    }
}
