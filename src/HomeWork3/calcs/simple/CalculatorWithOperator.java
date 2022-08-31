package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

    public double division (double a, double b){
        return a / b;
    }

    public double multiplication (double a, double b){
        return a * b;
    }

    public double minus (double a, double b){
        return a - b;
    }
    public double plus (double a, double b) {
        return a + b;
    }
    public double power (double a, double b){
        double c = 1;
        if (b > 0) {
            for (int i = 1; i <= b; i++) {
                c = c * a;
            }
        } else {
            for (int i = -1; i >= b; i--) {
                c = c * a;
            }
        }
        return c;
    }
    public double absolute (double a){
        if (a < 0){
            a = a * (-1);
        }
        return a;
    }

    public double square (double a){
        return Math.sqrt(a);
    }
}
