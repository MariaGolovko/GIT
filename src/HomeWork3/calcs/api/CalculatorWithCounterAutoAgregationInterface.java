package HomeWork3.calcs.api;

public class CalculatorWithCounterAutoAgregationInterface {

    private ICalculator calculator;
    private int count;

    public CalculatorWithCounterAutoAgregationInterface (ICalculator calculator){
        this.calculator = calculator;
    }

    private void incrementCountOperation(){
        count++;
    }

    public long getCountOperation(){
        return count;
    }


    public double division (double a, double b){
        incrementCountOperation();
        return this.calculator.division(a,b);
    }
    public double multiplication (double a, double b){
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
}
