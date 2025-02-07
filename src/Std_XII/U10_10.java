package Std_XII;

// Exception Handling using try and catch in java
public class U10_10 {
    public static void main(String[] args) {
        String[] citylist = {"Ahmedabad", "Baroda", "Rajkot", "Surat"};
        
        try {
            System.out.println("Before Error Statement:\n");
            // int num = 15 / 0;
            System.out.println(citylist[5]);
            System.out.println("After Error Statement:\n\n");
        } catch (ArrayIndexOutOfBoundsException eobj) {
            System.out.println("Within Catch Block");
            System.out.println("Caught Exception object of type:\n\t " + eobj);
        } // you can add more than catch block
        catch (ArithmeticException eobj) {
            System.out.println("Caught Exception object of type:\n\t " + eobj);
        }  // Generic Block
        catch (Exception eobj) {
            System.out.println("Caught Exception object of type:\n\t " + eobj);
        } // And Last you can add optional final block
        finally {
            System.out.println("This line will always get executed ");
            // even you catch an error
            // or try block without an error
        }


        // User Defined Exception
        // Creating new Exception And throwing manually
        try{
            Exception myobj = new Exception("Demonstrate of manual throw..");
            throw myobj;
        } catch (Exception eobj){
            System.out.println("Exception Caught:\n"+eobj);
        }
    }
}
