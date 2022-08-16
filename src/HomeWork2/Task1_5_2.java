package HomeWork2.Loops;

import java.util.Random;

public class Task1_5_2 {
    public static void main(String[] args) {
        Random rang = new Random();
        int [] array = new int[1000];
        int count = 0;

        for (int i = 0; i < array.length; i++){
            array [i] = rang.nextInt(100);

            if (array[i] % 2 == 0) {
                count ++;
            }
        }
        double ratio = count / 10d;
        System.out.println("Четные числа выпали " + count + " раз, в " + ratio + "% случаев");
    }
}
