package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoChoiceAgregation calculator1 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        CalculatorWithCounterAutoChoiceAgregation calculator2 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoChoiceAgregation calculator3 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());

        double result1, result2, result3;
        double a, b, c;

        result1 = calculator1.divideMath(28,5);
        result1 =calculator1.powerMath(result1,2);
        a = calculator1.multiplicationMath(15,7);
        result1 =  calculator1.plusMath(a,result1);
        result1 = calculator1.plusMath(4.1,result1);
        System.out.println(result1);
        System.out.println(calculator1.getCountOperation());

        result2 = calculator1.divideMath(28,5);
        result2 =calculator1.powerMath(result2,2);
        b = calculator1.multiplicationMath(15,7);
        result2 =  calculator1.plusMath(b,result2);
        result2 = calculator1.plusMath(4.1,result2);
        System.out.println(result2);
        System.out.println(calculator1.getCountOperation());

        result3 = calculator1.divideMath(28,5);
        result3 =calculator1.powerMath(result3,2);
        c = calculator1.multiplicationMath(15,7);
        result3 =  calculator1.plusMath(c,result3);
        result3 = calculator1.plusMath(4.1,result3);
        System.out.println(result3);
        System.out.println(calculator1.getCountOperation());
    }


}
