package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {
    private CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();


    private int count;

    private void incrementCountOperation(){
        this.count++;
    }

    public long getCountOperation(){
        return this.count;
    }

    public double divideMath (int a , double b) {
        incrementCountOperation();
        return this.calculator.division(a,b);
    }
    public double plusMath (double a, double b){
        incrementCountOperation();
        return this.calculator.plus(a,b);
    }
    public double powerMath (double a, double b){
        incrementCountOperation();
        return this.calculator.power(a,b);
    }
    public double multiplicationMath (int a, int b){
        incrementCountOperation();
        return this.calculator.multiplication(a,b);
    }
    public double minusMath (int a, int b){
        incrementCountOperation();
        return this.calculator.minus(a,b);
    }
    public double absoluteMath (double a){
        incrementCountOperation();
        return this.calculator.absolute(a);
    }
    public double squareMath (double a){
        incrementCountOperation();
        return this.calculator.square(a);
    }

}
