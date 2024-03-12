package OldPaperAns;

import java.util.Arrays;
import java.util.Scanner;

public class EmpAns {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Number Of Employee: ");
        int n = sc.nextInt();

        Employee[] emps = new Employee[n];

        for (int i = 0; i < emps.length; i++) {
            System.out.println("\nEmployee no. " + (i + 1));
            emps[i] = new Employee();
            emps[i].getData();
        }

        Arrays.sort(emps, new Employee());

        for (int i = 0; i < emps.length; i++) {
            System.out.println("\nEmployee no. " + (i + 1));
            emps[i].display();
        }
    }
}
