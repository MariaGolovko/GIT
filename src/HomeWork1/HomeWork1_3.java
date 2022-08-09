package HomeWork1;

import java.util.Scanner;

public class HomeWork1_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = 55; // Binary number 0011_0111
        int b = 67; // Binary number 0100_0011

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

        int c = a | b;
        /* OR(|) calculations below
        a = 0011_0111 = 55 (decimal)
        b = 0100_0011 = 67 (decimal)
        c = 0111_0111 = 119 (decimal) RESULT принимает значение 1, если есть хотя бы одна 1*/

        int d = a & b;
        /*
        a = 0011_0111 = 55 (decimal)
        b = 0100_0011 = 67 (decimal)
        d = 0000_0011 = 3 (decimal) RESULT принимает значение 1, если значение 1 в двух ячейках
         */

        System.out.println(c);
        System.out.println(d);

    }
}
