package Problems;

import java.util.Scanner;

public class sum_two {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no1 here: ");
        int num_1 = sc.nextInt();
        System.out.print("Enter no2 here: ");
        int num_2 = sc.nextInt();
       
        int c = num_1 + num_2;
        System.out.println("Sum of two numbers is: " + c);

    }
    
}
