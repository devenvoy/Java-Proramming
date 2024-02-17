package Clg_Journal;
class student1 {
    int rollno;

    public void setRollno(int r) {
        rollno = r;
    }

    public void putRollno() {
        System.out.println("Roll no = " + rollno);
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
    float sportmark = 6.0f;

    void putSport();
}

class result extends test implements sports {
    float total;

    @Override
    public void putSport() {
        System.out.println("Sport Mark = " + sportmark);
    }

    void display() {
        total = mark1 + mark2 + sportmark;
        putRollno();
        putMarks();
        putSport();
        System.out.println("Total Marks = " + total);
    }
}

public class Q06 {
    public static void main(String[] args) {
        result aa = new result();
        aa.setRollno(101);
        aa.setMarks(30.5f, 35.6f);
        aa.display();
    }
}
