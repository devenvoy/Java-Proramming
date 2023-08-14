package OOPS;

import java.util.Scanner;

class Employee{
    String name;
    int year_of_join;
    double salary;
    String address;
}
public class format_output {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Employee e1 = new Employee();
        e1.name=sc.nextLine();
        e1.year_of_join=sc.nextInt();
        e1.salary = sc.nextInt();
        sc.nextLine();
        e1.address = sc.nextLine();

        Employee e2 = new Employee();
        e2.name = "raj pavasiya";
        e2.year_of_join = 1998;
        e2.salary = 243;
        e2.address = "mumbai";
                
        System.out.printf("%-20s%6s%15s%20s","Name","Year of Join","Salary","Address");
        System.out.printf("\n%-20s%6d\t\t%15.2f\t\t%20s",e1.name,e1.year_of_join,e1.salary,e1.address);
        System.out.printf("\n%-20s%6d\t\t%15.2f\t\t%20s",e2.name,e2.year_of_join,e2.salary,e2.address);

    }
}
