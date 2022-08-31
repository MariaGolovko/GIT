package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator
                                        implements ICalculator {
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
