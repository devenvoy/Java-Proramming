package OldPaperAns;

import java.util.Comparator;
import java.util.Scanner;

public class Employee implements Comparator<Employee> {

    String name;
    int age;
    int salary;

    @Override
    public int compare(Employee e1,Employee e2){
        return Integer.compare(e1.salary,e2.salary);
    }

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        name = sc.next();
        System.out.println("Enter Age:");
        age = sc.nextInt();
        System.out.println("Enter Salary");
        salary = sc.nextInt();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
