package Std_XII;

public class U9_5 {
    public static void main(String[] args) {
        double[] numbers = {10.5, 20.6, 30.8, 15.5, 17.3, 25.5, 27.2, 20, 30, 18.5};

        double sum = 0, avg;

        System.out.println("List Of Numbers is:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
            sum = sum + numbers[i];
        }

        avg = sum / 10;
        System.out.println("\nSum of total numbers is "+sum);
        System.out.println("Average of total numbers is "+avg);
    }
}
