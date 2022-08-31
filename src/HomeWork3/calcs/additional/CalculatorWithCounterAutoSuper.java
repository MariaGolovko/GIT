package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private int count;
    private void incrementCountOperation(){
        count++;
    }
    public double division(double a, double b) {
        incrementCountOperation();
        return super.division(a, b);
    }

    @Override
    public double multiplication(double a, double b) {
        incrementCountOperation();
        return super.multiplication(a, b);
    }

    @Override
    public double minus(double a, double b) {
        incrementCountOperation();
        return super.minus(a, b);
    }

    @Override
    public double plus(double a, double b) {
        incrementCountOperation();
        return super.plus(a, b);
    }

    @Override
    public double power(double a, double b) {
        incrementCountOperation();
        return super.power(a, b);
    }

    @Override
    public double absolute(double a) {
        incrementCountOperation();
        return super.absolute(a);
    }

    @Override
    public double square(double a) {
        incrementCountOperation();
        return super.square(a);
    }
    public long getCountOperation(){
        return count;
    }
}
