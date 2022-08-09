package HomeWork1;

import java.util.Random;

public class HomeWork3_4 {
    public static void main(String[] args) {
        int a = -67;
        int b = 89;
        // целое псевдослучайное число из отрезка [a;b]

        int c = (int) (Math.random() * (b - a) + 1) + a;
        System.out.println("Случайное число " + c);





    }
}
