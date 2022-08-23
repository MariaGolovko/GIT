package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        // посчитать следующие выражения: 4.1 + 15 * 7 + (28 / 5) ^ 2

        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();

        double result = calculator.plusMath(calculator.plusMath(4.1, calculator.multiplicationMath(15, 7)), calculator.powerMath(calculator.divideMath(28,5),2));

        System.out.println(result);


    }
}
