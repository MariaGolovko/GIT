package HomeWork2.Loops;

import java.util.Scanner;

public class Task1_5_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество цифр для вывода");
        int index = console.nextInt();

        String row = "";
        long n1 = 1;
        long n2 = 2;

        String rowBeginning = n1 + " " + n2;

        if (index == 0) {
            row = "нет результата";
        } else if (index == 1) {
            row = "1";
        } else if (index == 2) {
            row = n1 + " " + n2;
        } else {
            for (int i = 0; i < (index-2); i++ ) {
                long n3 = n2 + n1;
                row = rowBeginning + " " + n3;
                n1 = n2;
                n2 = n3;
                rowBeginning = row;
            }
        }
        System.out.println(row);
    }
}
