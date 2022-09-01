package HomeWork4;

public class TestClassTask4 {
    public static void main(String[] args) {
        DataContainer<Integer> numbers = new DataContainer<>(new Integer[6]);
        Integer[] abc = numbers.getData();

        for (int i = 0; i < 4; i++){
            abc[i] = 2;
        }
        numbers.setData(abc);


        System.out.println(numbers.add(777));
        System.out.println(numbers.get(8));


    }
}
