package HomeWork1;

public class HomeWork2_4 {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        int c = (5 + a++) / --b;
        /*1) присваивание а=2 b=8
        2) действие в скобках: сложение 5+2=7
        3) префикс унарного оператора b = b-1 = 8-1 =7
        4) деление 7/7=1
        5) присваивание с = 1
        6) постунарный оператор а = а + 1 = 2 + 1 =3*/
        System.out.println(c);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
