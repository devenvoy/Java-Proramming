package Clg_Journal;

public class Q03 {
    public static void main(String[] args) {
        Student st1 = new Student(251, "Devansh");
        st1.display();

        Student st2 = new Student();
        st2.setRollNo(255);
        st2.setName("Prince");
        st2.display();

    }
}

class Student {

    private int rollNo;
    private String name;

    Student() {
    }

    Student(int rn, String n) {
        this.rollNo = rn;
        this.name = n;
    }

    public void setRollNo(int rn) {
        this.rollNo = rn;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Student Roll No. => " + rollNo);
        System.out.println("Student Name. => " + name);
    }

}
