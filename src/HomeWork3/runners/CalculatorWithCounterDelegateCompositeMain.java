package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite();

        double result = calculator.divideMath(28,5);
        result =  calculator.powerMath(result,2);
        double a = calculator.multiplicationMath(15,7);
        result =  calculator.plusMath(a,result);
        result = calculator.plusMath(4.1,result);

        System.out.println(result);

        System.out.println(calculator.getCountOperation());
    }
}
