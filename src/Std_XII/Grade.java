package Std_XII;

public class Grade {
    public static void main(String[]s)
    {
        int x=45;
        if(x<=100 && x>=70)
        {
            System.out.println("your grade is A");
        }
        else if(x<=69 && x>=60)
        {
            System.out.println("your grade is B");
        }
        else if(x<=59 && x>=50)
        {
            System.out.println("your grade is c");
        }
        else
        {
            System.out.println("your grade is F");
        }
    }
}
