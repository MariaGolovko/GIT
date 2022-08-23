package HomeWork3.calcs.simple;

public class CalculatorWithMathCopy {
    public double divideMath (int a , double b){
        return a / b;
    }
    public double multiplicationMath (int a, int b){
        return Math.multiplyExact(a, b);
    }
    public double minusMath (int a, int b){
        return Math.subtractExact(a, b);
    }
    public double plusMath (double a, double b){
        return a+b;
    }
    public double powerMath (double a, double b){
        return Math.pow(a, b);
    }
    public double absoluteMath (double a){
        return Math.abs(a);
    }
    public double squareMath (double a){
        return Math.sqrt(a);
    }



}
