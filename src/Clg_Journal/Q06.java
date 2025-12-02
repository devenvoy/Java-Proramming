package Clg_Journal;
class student1 {
    int rollNo;

    public void setRollNo(int r) {
        rollNo = r;
    }

    public void putRollNo() {
        System.out.println("Roll no = " + rollNo);
    }
}

class test extends student1 {
    float mark1, mark2;

    public void setMarks(float m1, float m2) {
        this.mark1 = m1;
        this.mark2 = m2;
    }

    public void putMarks() {
        System.out.println("Mark1 = " + mark1 + "\nMark2 = " + mark2);
    }
}

interface sports {
    float sportMark = 6.0f;

    void putSport();
}

class result extends test implements sports {
    float total;

    @Override
    public void putSport() {
        System.out.println("Sport Mark = " + sportMark);
    }

    void display() {
        total = mark1 + mark2 + sportMark;
        putRollNo();
        putMarks();
        putSport();
        System.out.println("Total Marks = " + total);
    }
}

public class Q06 {
    public static void main(String[] args) {
        result aa = new result();
        aa.setRollNo(101);
        aa.setMarks(30.5f, 35.6f);
        aa.display();
    }
}
