package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {

    private CalculatorWithOperator calculator1;
    private CalculatorWithMathCopy calculator2;
    private CalculatorWithMathExtends calculator3;
    private int count;

    private void incrementCountOperation(){
        count++;
    }

    public long getCountOperation(){
        return count;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculator1){
        this.calculator1 = calculator1;
    }
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculator2){
        this.calculator2 = calculator2;
    }
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculator3){
        this.calculator3 = calculator3;
    }
    public double multiplicationMath (int a, int b){
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.multiplication(a, b);
        }else if (calculator2 != null) {
            return calculator2.multiplication(a, b);
        } else{
            return calculator3.multiplication(a,b);
        }
    }
    public double minusMath (int a, int b){
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.minus(a, b);
        } else if (calculator2 != null) {
            return calculator2.minus(a,b);
        }else {
            return calculator3.minus(a,b);
        }
    }
    public double plusMath (double a, double b){
        incrementCountOperation();
        if (calculator1 != null){
            return calculator1.plus(a,b);
        } else if (calculator2 != null) {
            return calculator2.plus(a,b);
        }else {
            return calculator3.plus(a, b);
        }
    }
    public double powerMath (double a, double b){
        incrementCountOperation();
        if (calculator1 != null){
            return calculator1.power(a,b);
        } else if (calculator2 != null) {
            return calculator2.power(a,b);
        }else {
            return calculator3.power(a,b);
        }
    }
    public double absoluteMath (double a){
        incrementCountOperation();
        if (calculator1 != null) {
            return calculator1.absolute(a);
        } else if (calculator2 != null) {
            return calculator2.absolute(a);
        }else {
            return calculator3.absolute(a);
        }
    }
    public double squareMath (double a){
        incrementCountOperation();
        if (calculator1 != null){
            return calculator1.square(a);
        } else if (calculator2 != null) {
            return calculator2.square(a);
        }else {
            return calculator3.square(a);
        }
    }
    public double divideMath (int a , double b){
        incrementCountOperation();
        if (calculator1 != null){
            return calculator1.division(a,b);
        } else if (calculator2 != null) {
            return calculator2.division(a,b);
        }else {
            return calculator3.division(a,b);
        }
    }

}
