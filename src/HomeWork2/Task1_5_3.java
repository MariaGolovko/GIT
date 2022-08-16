package HomeWork2.Loops;

import java.util.Scanner;

public class Task1_5_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int number = console.nextInt();
        int countEven = 0;
        int countOdd = 0;
        String even = "";
        String odd = "";
        while (number > 0){
            int a = number % 10;
            if (a % 2 == 0){
                countEven ++;
                even = a + even;
            }else {
                countOdd++;
                odd = a + odd;
            }
            number = number / 10;
        }
        System.out.println("В число " + countEven + " четных цифр (" + even + "), и " + countOdd + " нечетных (" + odd + ")");


    }
}
