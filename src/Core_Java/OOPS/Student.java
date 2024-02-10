package Core_Java.OOPS;

interface oman {

    void get_data();

    void set_data();
}

public class Student {
    String name, Division;
    int rollno, semester;

    public static void main(String[] args) {

    }
}

class internal implements oman {
    float sub1Marks;
    float sub2Marks;
    float sub3Marks;
    float sub4Marks;
    float sub5Marks;
    float internalOutOf;

    @Override
    public void get_data() {

    }

    @Override
    public void set_data() {

    }
}

class external implements oman {
    float sub1Marks;
    float sub2Marks;
    float sub3Marks;
    float sub4Marks;
    float sub5Marks;
    float internalOutOf;

    @Override
    public void get_data() {

    }

    @Override
    public void set_data() {

    }
}

class result {
    String Grade;
    float grandTotal;
    float Percentage;

    void display_result() {
        // Q. what it means by with grade and other marks.
    }
}