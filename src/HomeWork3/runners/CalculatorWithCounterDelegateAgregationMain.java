package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoAgregation;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoAgregation calculator = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());

        double result = calculator.division(28,5);
        result =  calculator.power(result,2);
        double a = calculator.multiplication(15,7);
        result =  calculator.plus(a,result);
        result = calculator.plus(4.1,result);

        System.out.println(result);

        System.out.println(calculator.getCountOperation());




    }
}
