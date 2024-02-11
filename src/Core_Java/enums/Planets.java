package Core_Java.enums;

public enum Planets {
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8),
    PLUTO(9);

    final int number;

    Planets(int number) {
        this.number = number;
    }
}


// enum = enumerated
//( ordered listing of items in a collection)
// Grouping of constants that behave similarly to objects
// by default enum have constant value from zero,
// but we can specify each constant with own number