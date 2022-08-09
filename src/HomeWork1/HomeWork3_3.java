package HomeWork1;

import java.util.Random;

public class HomeWork3_3 {
    public static void main(String[] args) {
        //целое псевдослучайное число из отрезка [-n;n].
        int n = 17;
        int a = (int)(Math.random() * (n * 2 + 1) - n);
        System.out.println(a);

    }
}
