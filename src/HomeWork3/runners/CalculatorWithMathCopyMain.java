package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        // посчитать следующие выражения: 4.1 + 15 * 7 + (28 / 5) ^ 2

        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();

        double result = calculator.plus(calculator.plus(4.1, calculator.multiplication(15, 7)), calculator.power(calculator.division(28,5),2));

        System.out.println(result);


    }
}
