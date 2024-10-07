public interface Perarea {
    double getArea();

    double getPerimeter();
}

class Rectangle implements Perarea {
    double length;
    double breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double getArea() {
        return length * breadth;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + breadth);
    }
}

class Cycle implements Perarea {
    double side;

    Cycle(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 3.14 * side * side;
    }

    @Override
    public double getPerimeter() {
        return 3.14 * side * 2;
    }
}

public class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        Cycle c = new Cycle(5);
        System.out.println("Area of rectangle is " + r.getArea());
        System.out.println("Perimeter of rectangle is " + r.getPerimeter());
        System.out.println("Area of circle is " + c.getArea());
        System.out.println("Perimeter of circle is " + c.getPerimeter());
    }
}