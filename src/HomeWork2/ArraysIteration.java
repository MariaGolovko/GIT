package HomeWork2.Loops;

public class ArraysIteration {
    public static void main (String[] args) {

        int[] container = ArraysUtils.arrayFromConsole();

        PrintAllElements(container);
        PrintSecondElement(container);
        PrintReverseOrder(container);
    }
    public static void PrintAllElements (int [] container){
        int i = 0;
        do {
            System.out.print(container[i] + " ");
            i++;
        }while (i < container.length);
        System.out.println();

        int j = 0;
        while (j < container.length){
            System.out.print(container[j] + " ");
            j++;
        }
        System.out.println();

        for (int index = 0; index < container.length; index++){
            System.out.print(container[index] + " ");
        }
        System.out.println();

        for (int element: container){
            System.out.print(element + " ");
        }
        System.out.println();
    }

     public static void PrintSecondElement (int [] container) {

        int i = 0;
        do {
            if (i % 2 != 0) {
                System.out.print(container[i] + " ");
            }
            i++;
        }while (i < container.length);
        System.out.println();

         int j = 0;
         while (j < container.length){
             if (j % 2 != 0) {
                 System.out.print(container[j] + " ");
             }
             j++;
         }
         System.out.println();

         for (int index = 0; index < container.length; index++){
             if (index % 2 != 0) {
                 System.out.print(container[index] + " ");
             }
         }
         System.out.println();

         /*
         Цикл ForEach обращается к каждому элементу массива,а не к индексу элемента, не применяет счётчик индексов, поэтому выборку по порядковому номеру элемента сделать нельзя
          */

    }
    public static void PrintReverseOrder (int [] container){
        int i = container.length - 1;
        do {
            System.out.print(container[i] + " ");
            i--;
        }while (i >= 0);
        System.out.println();

        int j = container.length - 1;
        while (j >= 0){
            System.out.print(container[j] + " ");
            j--;
        }
        System.out.println();

        for (int index = container.length - 1; index >= 0 ; index--){
            System.out.print(container[index] + " ");
        }
        System.out.println();

        /*
        Цикл ForEach обращается к каждому элементу массива,а не к индексу элемента,
        не применяет счётчик индексов, поэтому обратиться по порядковому номеру элемента в обратном порядке нельзя, чтобы его вывести на печать
          */
    }
}
