package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        // посчитать следующие выражения: 4.1 + 15 * 7 + (28 / 5) ^ 2

        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();

        double result = calculator.plus(4.1, calculator.plus(calculator.multiplication(15, 7),calculator.power(calculator.division(28, 5), 2)));

        System.out.println(result);
    }
}
