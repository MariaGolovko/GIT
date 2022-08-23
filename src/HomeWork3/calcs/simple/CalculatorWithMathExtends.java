package HomeWork3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator{
    public double power (double a, int b){
        return Math.pow(a, b);
    }
    public double absolute (double a){
        return Math.abs(a);
    }
    public double square (double a){
        return Math.sqrt(a);
    }


}
