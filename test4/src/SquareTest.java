interface IShape {
    double area();

    Square zoom(double factor);
}

class Square implements IShape {
    double side;

    Square(double side) {
        if (side >= 0) {
            this.side = side;
        } else {
            System.err.println("请输入正数");
        }
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public Square zoom(double factor) {
        if (factor < 0) {
            System.err.println("请输入正数");
            return null;
        } else
            return new Square(side * factor);
    }

    @Override
    public String toString() {
        return String.format("正方形的边长:%.2f；正方形的面积：%.2f", side, area());
    }
}

public class SquareTest {
    public static void main(String[] args) {
        Square s1 = new Square(10);
        System.out.println(s1.toString());
        Square s2 = s1.zoom(0.25);
        if (s2 != null) {
            System.out.println(s2.toString());
        }
    }
}