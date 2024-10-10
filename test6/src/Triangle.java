public class Triangle {
    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double area() throws NotTriangle {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new NotTriangle("非三角形");
        }
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new NotTriangle("非三角形");
        }
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public static void main(String[] args) {
        Triangle obj1Triangle = new Triangle(3.0, 4.0, 5.0);
        Triangle obj2Triangle = new Triangle(1.0, 1.0, 2.0);
        try {
            System.out.println("三角形1的面积是" + obj1Triangle.area());
        } catch (NotTriangle e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("三角形2的面积是" + obj2Triangle.area());
        } catch (NotTriangle e) {
            System.out.println(e.getMessage());
        }
    }
}

class NotTriangle extends Exception {
    public NotTriangle(String msg) {
        super("非三角形");
    }
}
