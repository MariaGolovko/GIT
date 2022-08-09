package HomeWork1;

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        byte number = console.nextByte();

        String binaryNumber = toBinaryString(number);
        int a = toBinaryString(number).length();

        if (number < 0) {
            switch (a) {
                case 1:
                    System.out.print("1000000");
                    break;
                case 2:
                    System.out.print("100000");
                    break;
                case 3:
                    System.out.print("10000");
                    break;
                case 4:
                    System.out.print("1000");
                    break;
                case 5:
                    System.out.print("100");
                    break;
                case 6:
                    System.out.print("10");
                    break;
                case 7:
                    System.out.print("1");
                    break;
            }
        } else {
            switch (a) {
                case 1:
                    System.out.print("0000000");
                    break;
                case 2:
                    System.out.print("000000");
                    break;
                case 3:
                    System.out.print("00000");
                    break;
                case 4:
                    System.out.print("0000");
                    break;
                case 5:
                    System.out.print("000");
                    break;
                case 6:
                    System.out.print("00");
                    break;
                case 7:
                    System.out.print("0");
                    break;
            }
        }
        System.out.print(binaryNumber);
    }
    public static String toBinaryString(byte n) {
        if (n < 0) {
            n = (byte) (128 + n);
        }
        return Integer.toBinaryString(n);
    }
}


