package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        // посчитать следующие выражения: 4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();

        double result = calculator.division(28,5);
        calculator.incrementCountOperation();
        result =  calculator.power(result,2);
        calculator.incrementCountOperation();
        double a = calculator.multiplication(15, 7);
        calculator.incrementCountOperation();
        result =  calculator.plus(a, result);
        calculator.incrementCountOperation();
        result = calculator.plus(4.1, result);
        calculator.incrementCountOperation();

        System.out.println(result);

        System.out.println(calculator.getCountOperation());

    }
}
