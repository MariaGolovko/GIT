package HomeWork3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        // посчитать следующие выражения: 4.1 + 15 * 7 + (28 / 5) ^ 2

        double a = 28 / 5d;
        a *= a;
        int b = 15 * 7;
        double c = 4.1;

        double sum = c + b + a;

        System.out.println(sum);

    }
}
