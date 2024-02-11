package Core_Java.enums;

public class Main {
    public static void main(String[] args) {

        Planets p1 = Planets.EARTH;
        Planets p2 = Planets.PLUTO;

        canILiveHere(p1);
        canILiveHere(p2);

    }

    static void canILiveHere(Planets planet) {
        switch (planet) {
            case EARTH:
                System.out.println("Yes You can live here");
                System.out.println("This is Planet #"+planet.number);
                break;
            default:
                System.out.println("You can't Live here ... yet ");
                System.out.println("This is Planet #"+planet.number);
                break;
        }
    }
}
