package Core_Java.ExceptionHandling;

public class Main {
    public static void main(String[] args) {

        try {
            int a[] = new int[7];
            a[4] = 30 / 0;
            System.out.println("First Print Statement in Try Block");
        } catch (ArithmeticException e) {
            System.out.println("Warning : Arithmetic Exception\n" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Warning : ArrayIndexOutOfBoundsException\n" + e);
        } catch (Exception e) {
            System.out.println("Warning : Some Other Exception\n" + e);
        } finally {
            System.out.println("Out Off Try-Catch block ");
            System.out.println("From Finally Block");
        }
    }
}
