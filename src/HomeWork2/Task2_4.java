package HomeWork2.Loops;

public class Task2_4 {
    public static void main(String[] args) {
        int [] arr = ArraysUtils.arrayRandom(50, 100);
        System.out.println("Сумма четных положительных элементов массива\n" + SumOfEvenNumbers(arr));
        System.out.println("Максимальный из элементов массива с четными индексами\n" + MaxValue(arr));
        LessThenAverage(arr);
        LeastElements(arr);
        ReduceArray(arr, 5, 55);
        ArrayNumberSum(arr);
    }
    public static int SumOfEvenNumbers (int [] arr){
        int sum = 0;
        for (int element: arr) {
            if(element % 2 == 0){
                sum = sum + element;
            }
        }
        return sum;
    }
    public static int MaxValue (int [] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i+=2){
            if (arr [i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void LessThenAverage (int [] arr){
        int sum = 0;
        for (int element: arr) {
            sum = sum + element;
        }
        double average = sum / 50d;
        System.out.println("Элементы массива меньше среднего арифметического");
        for (int element: arr) {
            if (element < average){
                System.out.print(element + " ");
            }
        }
    }
    public static void LeastElements (int [] arr){
        int min1 = 0;
        int min2;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < arr[min1]){
                min1 = i;
            }
        }
        if (min1 == 0){
            min2 = 1;
        }else {
            min2 = 0;
        }
        for (int i = 0; i < arr.length; i++){
            if (i != min1){
                if (arr[i] < arr[min2]){
                    min2 = i;
                }
            }
        }
        System.out.println("\nДва минимальных элемента\n" + min1 + " " + min2);
    }
    public static void ReduceArray (int [] arr, int a, int b){
        int index = arr.length;
        int i = 0;

        while (i < index){
            if (arr[i] >= a && arr[i] <=b){
                index--;
                for(int j = i; j < index; j++){
                    arr[j] = arr[j+1];
                }
            }else {
                i++;
            }
        }
        for (int k = index; k < arr.length; k++ ){
            arr[k] = 0;
        }
        System.out.println("Массив с удаленными элементами из интервала");
        for (int element: arr){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void ArrayNumberSum (int [] arr){
        int sum = 0;
        for (int element : arr) {
            int number = element;
            while (number > 0) {
                int b = number % 10;
                sum = sum + b;
                number = number / 10;
            }
        }
        System.out.println("Сумма цифр элементов массива\n" + sum);
    }

}
