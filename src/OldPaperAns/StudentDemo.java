package OldPaperAns;

import java.util.Arrays;

public class StudentDemo {
    public static void main(String[] args) {

        Student[] studs = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i + 1));
            studs[i] = new Student();
        }

        Arrays.sort(studs);

        for (int i = 0; i < 5; i++) {
            studs[i].display();
        }
    }
}
