package HomeWork3.runners;

import HomeWork3.calcs.api.CalculatorWithCounterAutoAgregationInterface;
import HomeWork3.calcs.api.ICalculator;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregationInterface calculator1 = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        CalculatorWithCounterAutoAgregationInterface calculator2 = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoAgregationInterface calculator3 = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());

        counting(calculator1);
        counting(calculator2);
        counting(calculator3);

    }
    public static void counting(CalculatorWithCounterAutoAgregationInterface calculator){
        double result = calculator.division(28,5);
        result =  calculator.power(result,2);
        double a = calculator.multiplication(15,7);
        result =  calculator.plus(a,result);
        result = calculator.plus(4.1,result);

        System.out.println(result);

        System.out.println(calculator.getCountOperation());
    }
}
