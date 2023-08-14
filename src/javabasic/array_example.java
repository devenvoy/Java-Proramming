package javabasic;
import java.util.Scanner;

public class array_example {
    public static void main(String args[])
    {
        int marks[] = new int[5];
        int temp = 0;
        // marks[0] = 90;
        // marks[1] = 80;
        // marks[2] = 70;
        // marks[3] = 60;
        // marks[4] = 50;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5 ; i++){
            System.out.print("Enter Element: ");
            marks[i] = sc.nextInt();
        }

        for (int i = 0; i < 4 ; i++){
            if(marks[i]<marks[i+1]){
                temp =  marks[i+1];
            }
        }

        System.out.println("Maximum number is "+temp);
    }
    
}
