package HomeWork1;

public class HomeWork7 {
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5,6,7,8,9,0};
        createPhoneNumber(number);
    }
    public static void createPhoneNumber (int [] arr) {
        System.out.println("(" + arr[0] + arr[1] + arr[2] + ") " + arr[3] + arr[4] + arr[5] + "-" + arr[6] + arr[7] + arr[8] + arr[9]);
    }
}
