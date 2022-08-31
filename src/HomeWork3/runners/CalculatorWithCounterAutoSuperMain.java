package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoSuper;
import HomeWork3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        // посчитать следующие выражения: 4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();

        double result = calculator.division(28,5);
        result =  calculator.power(result,2);
        double a = calculator.multiplication(15, 7);
        result =  calculator.plus(a, result);
        result = calculator.plus(4.1, result);


        System.out.println(result);

        System.out.println(calculator.getCountOperation());

    }
}
