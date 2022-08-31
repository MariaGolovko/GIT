package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {
    private CalculatorWithMathCopy calculator;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculator){

        this.calculator = calculator;
    }
    private int count;

    private void incrementCountOperation(){
        count++;
    }

    public long getCountOperation(){
        return count;
    }

    public double multiplication (int a, int b){
        incrementCountOperation();
        return this.calculator.multiplication(a,b);
    }
    public double minus (int a, int b){
        incrementCountOperation();
        return this.calculator.minus(a,b);
    }
    public double plus (double a, double b){
        incrementCountOperation();
        return this.calculator.plus(a,b);
    }
    public double power (double a, double b){
        incrementCountOperation();
        return this.calculator.power(a,b);
    }
    public double absolute (double a){
        incrementCountOperation();
        return this.calculator.absolute(a);
    }
    public double square (double a){
        incrementCountOperation();
        return this.calculator.square(a);
    }
    public double division (int a , double b){
        incrementCountOperation();
        return this.calculator.division(a,b);
    }



}
