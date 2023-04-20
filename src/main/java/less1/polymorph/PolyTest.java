package less1.polymorph;

public class PolyTest {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[]{
                new Circle(14),
                new Triangle(12,10),
                new Circle(11),
                new SquareRectangle(4),
                new SquareRectangle(5)
        };

        for (Shape s: shapes){
            s.findSquare();
        }

    }
}
