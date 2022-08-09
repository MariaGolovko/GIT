package HomeWork1;

import java.util.Scanner;

public class HomeWork1_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Input number #1");
        int a = console.nextInt();

        System.out.println("Input number #2");
        int b = console.nextInt();

        int c = a | b;
        System.out.println(c);

        int d = a & b;
        System.out.println(d);
    }
}
