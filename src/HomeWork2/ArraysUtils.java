package HomeWork2.Loops;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static int [] arrayFromConsole (){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = console.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите элемент");
            arr [i] = console.nextInt();
        }
        return arr;
    }
    public static int [] arrayRandom (int size, int maxValueExclusion){
        int [] arr = new int[size];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++){
            arr [i] = rand.nextInt(maxValueExclusion);
        }
        return arr;
    }
}
