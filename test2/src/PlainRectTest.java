class Rect {
    double width;
    double height;

    Rect(double w, double h) {
        this.width = w;
        this.height = h;
    }

    Rect() {
        this.width = 10;
        this.height = 10;
    }

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }
}

class PlainRect extends Rect {
    double startX;
    double startY;

    PlainRect(double startX, double startY, double width, double height) {
        super(width, height);
        this.startX = startX;
        this.startY = startY;
    }

    PlainRect() {
        super();
        this.startX = 0;
        this.startY = 0;
    }

    boolean isInside(double x, double y) {
        return x >= startX && x <= startX + width && y >= startY && y <= startY + height;
    }
}

public class PlainRectTest {
    public static void main(String[] args) {
        PlainRect target = new PlainRect(10, 10, 20, 10);
        System.out.println("矩形的面积是：" + target.area());
        System.out.println("矩形的周长是：" + target.perimeter());
        if (target.isInside(25.5, 13)) {
            System.out.println("点（25.5，13）在矩形内");
        } else {
            System.out.println("点（25.5，13）在矩形外");
        }

    }
}