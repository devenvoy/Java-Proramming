package Problems;

import java.util.*;

public class matrix_sort {
    public static void main(String args[]) {
        int marks[] = new int[9];
        int temp = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            System.out.print("Enter Element: ");
            marks[i] = sc.nextInt();
        }

        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 8; i++) {
                if (marks[i] < marks[i + 1]) {

                    temp = marks[i];
                    marks[i] = marks[i + 1];
                    marks[i + 1] = temp;

                }
            }
        }

        for (int i = 0; i < 9; i++) {
            System.out.print(marks[i]);
            if(i==2 || i == 5){
                System.out.println();
            }
        }

    }

}
