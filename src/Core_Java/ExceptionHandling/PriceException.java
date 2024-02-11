package Core_Java.ExceptionHandling;

public class PriceException extends Exception {
    int price;

    PriceException(int price) {
        this.price = price;
    }

    public String toString() {
        return "Price Can't Be in Negative ,You entered " + price;
    }
}
