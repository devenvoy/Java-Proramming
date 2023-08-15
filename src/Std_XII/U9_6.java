package Std_XII;

import java.util.Arrays;

public class U9_6 {
    public static void main(String[] args) {

        double[] list = {6.4, 8, 7.8, 9.8, 9.5, 6, 7, 8, 8.5, 5.9};
        int indx;
        System.out.println("Initial Elements: ");
        display(list);

        Arrays.sort(list,3,8);
        System.out.println("\nSort Partial Array, list[3] to list[8]:");
        display(list);

        Arrays.fill(list ,7);
        System.out.println("\nFill Whole Array: ");
        display(list);
        Arrays.fill(list,2,6,5);
        System.out.println("\nFill Partial Array : list[2] to list[6] ");
        display(list);

        double[] list2 = {6, 5, 7, 9, 9.5, 6.5, 7.5, 8};
        System.out.println("\nList 2 Elements are: ");
        display(list2);

        indx = search(list2,8);

        if(indx < 0){
            System.out.println("Element 8 not Found in array");
        } else {
            System.out.println("Element 8 Found at position : "+indx);
        }

        indx = search(list2,5.5);
        if(indx < 0){
            System.out.println("Element 5.5 not Found in array");
        } else {
            System.out.println("Element 5.5 Found at position : "+indx);
        }

    }

    private static int search(double[] list2, double x) {
        for(int i = 0; i< list2.length; i++){
            if(list2[i] == x){
                return  i;
            }
        }
        return -1;
    }

    private static void display(double[] list) {
        // this method just used to display 1D array / list to console
        for (double v : list) {
            System.out.print(v+"\t  ");
        }
        System.out.println();
    }
}
