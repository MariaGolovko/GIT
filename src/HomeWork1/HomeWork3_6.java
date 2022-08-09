package HomeWork1;

public class HomeWork3_6 {
    public static void main(String[] args) {
        // площадь прямоугольного треугольника и его периметр
        int a = 3;
        int b = 4;
        double square = a * b / 2;
        double a2 = Math.pow(a, 2);// power
        double b2 = Math.pow(b, 2);

        double c = Math.sqrt(a2 + b2); // square root
        double p = a + b + c;
        System.out.println("Площадь треугольника = " + square + "\nПериметр треугольника = " + p);


    }
}
