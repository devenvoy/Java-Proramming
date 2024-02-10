package PW_Skills;

abstract class AnswerSheet {

    void display(){
        System.out.println("Answer 1 ==>");
        Q1Answer();
        System.out.println("\nAnswer 2 ==>");
        Q2Answer();
        System.out.println("\nAnswer 3 ==>");
        Q3Answer();
        System.out.println("\nAnswer 4 ==>");
        Q4Answer();
        System.out.println("\nAnswer 5 ==>");
        Q5Answer();
    }

    abstract void Q1Answer();
    abstract void Q2Answer();
    abstract void Q3Answer();
    abstract void Q4Answer();
    abstract void Q5Answer();
}
