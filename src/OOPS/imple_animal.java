package OOPS;

interface animal{
    void voice();
}
public class imple_animal {
    public static void main(String[] args) {
        cat c1 = new cat();
        c1.voice();

        dog d1 = new dog();
        d1.voice();
    }
}

class cat implements animal{
    public void voice() {
        System.out.println("Meow Meow");
    }
}

class dog implements animal{
    public void voice(){
        System.out.println("Bark Bark");
    }
}