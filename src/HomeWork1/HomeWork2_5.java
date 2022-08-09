package HomeWork1;

public class HomeWork2_5 {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;

        int c = (5 * 2 >> a ++) / -- b;
        /*1) присваивание а = 2, b = 8
        2) действие в скобках 5*a>>2++
        3) умножение 5 * 2 = 10
        4) побитовый оператор сдвига вправо на 2 позиции 10>>2 = 2
        5) префикс унарного оператора b = b - 1 = 8 - 1 = 7
        6) деление 2 / 7 = 0
        7) постунарный оператор, а = а + 1*/
        System.out.println("result " + c);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
