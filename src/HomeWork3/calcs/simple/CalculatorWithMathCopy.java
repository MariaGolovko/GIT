package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    public double division (double a , double b){
        return a / b;
    }
    public double multiplication (double a, double b){
        return a*b;
    }
    public double minus (double a, double b){
        return a-b;
    }
    public double plus (double a, double b){
        return a+b;
    }
    public double power (double a, double b){
        return Math.pow(a, b);
    }
    public double absolute (double a){
        return Math.abs(a);
    }
    public double square (double a){
        return Math.sqrt(a);
    }



}
