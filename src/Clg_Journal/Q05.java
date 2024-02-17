package Clg_Journal;

interface Area {
    void area();
}

class rectangle implements Area {

    int height, width;

    rectangle(int h, int w) {
        this.height = h;
        this.width = w;
    }

    @Override
    public void area() {
        System.out.println("Area Of Rectangle :" + (height * width));
    }
}


class triangle implements Area {
    int height, base;

    triangle(int h, int b) {
        this.height = h;
        this.base = b;
    }

    @Override
    public void area() {
        System.out.println("Area Of Triangle :" + (0.5 * base + height));
    }
}


class square implements Area {
    int side;

    square(int h) {
        this.side = h;
    }

    @Override
    public void area() {
        System.out.println("Area Of Square :" + (side * side));
    }
}

public class Q05 {
    public static void main(String[] args) {
        triangle t = new triangle(10, 5);
        rectangle r = new rectangle(10, 30);
        square s = new square(10);

        t.area();
        r.area();
        s.area();
    }
}
